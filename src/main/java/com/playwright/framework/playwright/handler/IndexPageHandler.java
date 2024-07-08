package com.playwright.framework.playwright.handler;

import com.playwright.framework.config.ParabankConfig;
import com.playwright.framework.playwright.pom.IndexPage;
import io.cucumber.spring.ScenarioScope;
import org.springframework.stereotype.Service;

@ScenarioScope
@Service
public class IndexPageHandler extends BasePageHandler {
    private final String PAGE_NAME = "index";
    private final IndexPage indexPage;

    protected IndexPageHandler(final ParabankConfig parabankConfig,
                               final IndexPage indexPage) {
        super(parabankConfig);
        this.indexPage = indexPage;
    }
}
