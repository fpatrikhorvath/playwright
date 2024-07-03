package com.playwright.framework.stores;

import com.playwright.framework.playwright.handler.IndexPageHandler;
import io.cucumber.spring.ScenarioScope;
import org.springframework.stereotype.Service;

@ScenarioScope
@Service
public class ParabankPageStore {
    private final IndexPageHandler indexPageHandler;
    public ParabankPageStore(final IndexPageHandler loginPageHandler) {
        this.indexPageHandler = loginPageHandler;
    }

    public IndexPageHandler getIndexPageHandler() {
        return indexPageHandler;
    }
}
