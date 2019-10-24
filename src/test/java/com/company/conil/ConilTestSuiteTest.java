package com.company.conil;

import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.*;

class ConilTestSuiteTest {

    private static final String DRIVER_IE_LOCATION = "C:\\Users\\bishe\\IdeaProjects\\JenkinsMavenConil\\webdriver\\IEDriverServer.exe";
    private static final String DEFAULT_HOME_PAGE_SV = "https://www.dev.conil.se";
    private static final String DRIVER_IE = "webdriver.ie.driver";
    private static final String DRIVER_CHROME = "webdriver.chrome.driver";
    private static final String DRIVER_CHROME_LOCATION = "C:\\Users\\bishe\\IdeaProjects\\JenkinsMavenConil\\webdriver\\chromedriver.exe";

    @org.junit.jupiter.api.Test
    void runChrome() {
        ConilTestSuite conilTestSuite= new ConilTestSuite();
        WebDriver driverChrome =conilTestSuite.webDriver(DRIVER_CHROME,DRIVER_CHROME_LOCATION);
        String results=conilTestSuite.runWebdriver(driverChrome, DEFAULT_HOME_PAGE_SV);
        assertEquals("Success",results);
    }
    @org.junit.jupiter.api.Test
    void runIE() {
        ConilTestSuite conilTestSuite= new ConilTestSuite();
        WebDriver driverIE=conilTestSuite.webDriver(DRIVER_IE,DRIVER_IE_LOCATION);
        String results=conilTestSuite.runWebdriver(driverIE, DEFAULT_HOME_PAGE_SV);
        assertEquals("Success",results);
    }



}