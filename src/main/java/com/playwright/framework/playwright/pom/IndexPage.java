package com.playwright.framework.playwright.pom;

import com.microsoft.playwright.Locator;
import com.playwright.framework.playwright.PwFactory;
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

    protected IndexPage(final PwFactory pwFactory) {
        super(pwFactory);
    }



    public Locator getUsernameInput() {
        return page.locator(USERNAME_INPUT_XPATH);
    }

    public Locator getPasswordInput() {
        return page.locator(PASSWORD_INPUT_XPATH);
    }

    public Locator getLoginButton() {
        return page.locator(LOGIN_BUTTON_XPATH);
    }

    public Locator getForgotPassword() {
        return page.locator(FORGOT_PASSWORD_BUTTON_XPATH);
    }

    public Locator getRegisterButton() {
        return page.locator(REGISTER_BUTTON_XPATH);
    }
}
