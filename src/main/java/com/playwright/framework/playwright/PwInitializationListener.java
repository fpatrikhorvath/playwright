package com.playwright.framework.playwright;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicBoolean;

@Component
public class PwInitializationListener {
    private static final Logger logger = LogManager.getLogger(PwInitializationListener.class);

    private static AtomicBoolean isInitialized = new AtomicBoolean(false);

    public static boolean isInitialized() {
        return isInitialized.get();
    }

    public static void setIsInitialized(final boolean initialized) {
        isInitialized.set(initialized);
        logger.info("Webdriver initialization status set to: {}", isInitialized);
    }
}
