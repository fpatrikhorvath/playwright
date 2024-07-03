package com.playwright.framework.stepdefs;

import com.playwright.framework.context.ScenarioContext;
import com.playwright.framework.stores.ParabankPageStore;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks extends TestCore {

    public Hooks(final ScenarioContext scenarioContext,
                 final ParabankPageStore parabankPageStore) {
        super(scenarioContext, parabankPageStore);
    }


    @After
    public void tearDown(final Scenario scenario) {

//        if (scenario.isFailed() && WebDriverInitializationListener.isInitialized()) {
//            byte[] screenshot = ((TakesScreenshot) webDriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png", "Screenshot");
//        }
//
//        if (WebDriverInitializationListener.isInitialized()) {
//            webDriverFactory.tearDown();
//            WebDriverInitializationListener.setIsInitialized(false);
//        }
    }
}
