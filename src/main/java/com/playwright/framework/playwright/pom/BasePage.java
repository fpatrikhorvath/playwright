package com.playwright.framework.playwright.pom;

import com.microsoft.playwright.Page;
import com.playwright.framework.playwright.PwFactory;
import io.cucumber.spring.ScenarioScope;

@ScenarioScope
public abstract class BasePage {
    protected final Page page;
    private String PAGE_NAME;

    protected BasePage(final PwFactory pwFactory) {
        this.page = pwFactory.getPage();
    }

}
