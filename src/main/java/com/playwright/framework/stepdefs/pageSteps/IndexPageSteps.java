package com.playwright.framework.stepdefs.pageSteps;

import com.playwright.framework.context.ScenarioContext;
import com.playwright.framework.stepdefs.TestCore;
import com.playwright.framework.stores.ParabankPageStore;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class IndexPageSteps extends TestCore {

    public IndexPageSteps(final ScenarioContext scenarioContext,
                          final ParabankPageStore parabankPageStore) {
        super(scenarioContext, parabankPageStore);
    }

    @Given("I am on the register page")
    public void iAmOnTheRegisterPage() {
        getIndexPageHandler().goTo();
    }

    @When("I sign up with correct credentials and store it as user_A")
    public void iSignUpWithCorrectCredentialsAndStoreItAsUser_A() {
    }

//    @Then("verify that the user is not logged in")
//    public void verifyThatTheUserIsNotLoggedIm() {
//        assertThat(getIndexPageHandler().isAt()).isTrue();
//    }
}
