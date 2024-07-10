package com.playwright.framework.playwright;

import com.microsoft.playwright.*;
import com.playwright.framework.config.ParabankConfig;
import io.cucumber.spring.ScenarioScope;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
@ScenarioScope
public class PwFactory implements DisposableBean {
    private static Browser browser;
    private final ParabankConfig parabankConfig;
    private Playwright playwright = null;
    private Page page = null;

    public PwFactory(final ParabankConfig parabankConfig) {
        this.parabankConfig = parabankConfig;

        if (browser == null) {
            playwright = Playwright.create();
            browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
            BrowserContext context = browser.newContext();
            page = context.newPage();
        }
    }

    public void goTo(final String pageName) {
        String url = parabankConfig.getUrl().replace("{pageName}", pageName);
        page.navigate(url);
    }

    public Page getPage() {
        return page;
    }

    @Override
    public void destroy() {

        if (browser != null) {
            browser.close();
        }

        if (playwright != null) {
            playwright.close();
        }
    }
}
