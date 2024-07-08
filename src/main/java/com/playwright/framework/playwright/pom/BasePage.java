package com.playwright.framework.playwright.pom;

import com.microsoft.playwright.Page;
import io.cucumber.spring.ScenarioScope;

@ScenarioScope
public abstract class BasePage {
    private String PAGE_NAME;
    protected final Page page;

    protected BasePage(final Page page) {
        this.page = page;
    }
    public abstract boolean isAt();
    public void goTo(final String url){
        page.navigate(url.replace("{pageName}", PAGE_NAME));
    }
}
