package com.playwright.framework.stepdefs.pageSteps;

import com.playwright.framework.context.ScenarioContext;
import com.playwright.framework.playwright.model.ContextUser;
import com.playwright.framework.stepdefs.TestCore;
import com.playwright.framework.stores.ParabankPageStore;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;


public class IndexPageSteps extends TestCore {

    public IndexPageSteps(final ScenarioContext scenarioContext,
                          final ParabankPageStore parabankPageStore) {
        super(scenarioContext, parabankPageStore);
    }

    @Given("I am on the register page")
    public void iAmOnTheRegisterPage() {
        getRegisterPageHandler().open();
        getRegisterPageHandler().isAt();
    }

    @When("I sign up with correct credentials and store it as {word}")
    public void iSignUpWithCorrectCredentialsAndStoreItAs(final String identifier) {
        ContextUser user = getRegisterPageHandler().initContextUser();
        getRegisterPageHandler().fillRegisterForm(user);
        scenarioContext.storeContextObject(identifier, user);
    }

    @Then("verify that the user is not logged in")
    public void verifyThatTheUserIsNotLoggedIm() {
        assertThat(getIndexPageHandler().isAt()).isTrue();
    }
}
