package com.playwright.framework.stepdefs;

import com.playwright.framework.context.ScenarioContext;
import com.playwright.framework.playwright.handler.IndexPageHandler;
import com.playwright.framework.playwright.handler.RegisterPageHandler;
import com.playwright.framework.stores.ParabankPageStore;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


@CucumberContextConfiguration
@ContextConfiguration(loader = SpringBootContextLoader.class, value = {"classpath:spring.xml"})
@SpringBootTest(classes = TestCore.class)
public class TestCore {

    protected final ScenarioContext scenarioContext;

    private final ParabankPageStore parabankPageStore;

    public TestCore(final ScenarioContext scenarioContext,
                    final ParabankPageStore parabankPageStore) {
        this.scenarioContext   = scenarioContext;
        this.parabankPageStore = parabankPageStore;
    }

    protected IndexPageHandler getIndexPageHandler() {
        return parabankPageStore.getIndexPageHandler();
    }

    protected RegisterPageHandler getRegisterPageHandler() {
        return parabankPageStore.getRegisterPageHandler();
    }
}