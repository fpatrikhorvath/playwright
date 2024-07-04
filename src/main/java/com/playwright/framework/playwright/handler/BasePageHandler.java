package com.playwright.framework.playwright.handler;

import io.cucumber.spring.ScenarioScope;
import org.springframework.stereotype.Service;

@ScenarioScope
@Service
public abstract class BasePageHandler {

    public abstract boolean isAt();

    public abstract void goTo();
}
