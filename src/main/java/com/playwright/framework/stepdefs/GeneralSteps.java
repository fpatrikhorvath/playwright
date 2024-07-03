package com.playwright.framework.stepdefs;

import com.playwright.framework.context.ScenarioContext;
import com.playwright.framework.stores.ParabankPageStore;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GeneralSteps extends TestCore {
    private static final Logger LOG = LogManager.getLogger(GeneralSteps.class);

    public GeneralSteps(final ScenarioContext scenarioContext,
                        final ParabankPageStore parabankPageStore) {
        super(scenarioContext, parabankPageStore);
    }

}
