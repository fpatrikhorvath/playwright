package com.playwright.framework.playwright.pom;

import com.microsoft.playwright.Page;
import io.cucumber.spring.ScenarioScope;

@ScenarioScope

public abstract class BasePage {
    protected final Page page;

    protected BasePage(final Page page) {
        this.page = page;
    }

}
