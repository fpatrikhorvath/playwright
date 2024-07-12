package com.playwright.framework.stepdefs.pageSteps;

import com.playwright.framework.context.ScenarioContext;
import com.playwright.framework.stepdefs.TestCore;
import com.playwright.framework.stores.ParabankPageStore;
import io.cucumber.java.en.Then;

public class RegisterPageSteps extends TestCore {

    public RegisterPageSteps(final ScenarioContext scenarioContext,
                             final ParabankPageStore parabankPageStore) {
        super(scenarioContext, parabankPageStore);
    }

    @Then("verify that the user {word} is registered")
    public void verifyThatTheUserIsRegistered(final String identifier) {
    }
}
