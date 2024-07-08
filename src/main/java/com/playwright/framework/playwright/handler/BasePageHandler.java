package com.playwright.framework.playwright.handler;

import com.playwright.framework.config.ParabankConfig;
import io.cucumber.spring.ScenarioScope;
import org.springframework.stereotype.Service;

@ScenarioScope
@Service
public abstract class BasePageHandler {
    protected final ParabankConfig parabankConfig;

    protected BasePageHandler(final ParabankConfig parabankConfig) {
        this.parabankConfig = parabankConfig;
    }

}
