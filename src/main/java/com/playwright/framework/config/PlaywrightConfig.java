package com.playwright.framework.config;

import org.springframework.context.annotation.Scope;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Scope(SCOPE_CUCUMBER_GLUE)
public class PlaywrightConfig {
    private final String browserType;
    private final boolean isHeadless;
    private final long timeout;

    public PlaywrightConfig(final String browserType,
                            final boolean isHeadless,
                            final long timeout) {
        this.browserType = browserType;
        this.isHeadless = isHeadless;
        this.timeout = timeout;
    }

    public String getBrowserType() {
        return browserType;
    }

    public boolean isHeadless() {
        return isHeadless;
    }

    public long getTimeout() {
        return timeout;
    }

}
