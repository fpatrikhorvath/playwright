package com.playwright.framework.playwright.pom;

import com.microsoft.playwright.Page;
import io.cucumber.spring.ScenarioScope;
import org.springframework.stereotype.Component;

@ScenarioScope
@Component
public class IndexPage extends BasePage {
    private final String USERNAME_INPUT_XPATH = "//input[@name='username']";
    private final String PASSWORD_INPUT_XPATH = "//input[@name='password']";
    private final String LOGIN_BUTTON_XPATH = "//input[@type='submit']";
    private final String FORGOT_PASSWORD_BUTTON_XPATH = "//a[@href='lookup.htm']";
    private final String REGISTER_BUTTON_XPATH = "//a[@href='register.htm']";

    protected IndexPage(final Page page) {
        super(page);
    }
}
