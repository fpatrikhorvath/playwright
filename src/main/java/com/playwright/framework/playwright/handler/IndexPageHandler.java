package com.playwright.framework.playwright.handler;

import com.playwright.framework.config.ParabankConfig;
import com.playwright.framework.playwright.pom.IndexPage;
import io.cucumber.spring.ScenarioScope;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@ScenarioScope
@Service
public class IndexPageHandler extends BasePageHandler {
    private final String PAGE_NAME = "index";
    private final IndexPage indexPage;
    private final ParabankConfig parabankConfig;

    public IndexPageHandler(final IndexPage indexPage,
                            final ParabankConfig parabankConfig) {
        this.indexPage = indexPage;
        this.parabankConfig = parabankConfig;
    }

    @Override
    public boolean isAt() {
        return false;
    }

    @Override
    public void goTo() {
        String url = StringUtils.replace(parabankConfig.getUrl(), "{pageName}", PAGE_NAME);
        //playwrightManager.getDriver().get(url);
    }
}
