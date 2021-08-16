package Cucumber;

import Managers.DriverManager;
import Managers.PageObjectManager;

public class TestContext {
    //this class will help to instantiate webdrivermanager and pageobjectmanager

    private DriverManager driverManager;
    private PageObjectManager pageObjectManager;

    public TestContext() {
        driverManager = new DriverManager();
        pageObjectManager = new PageObjectManager(driverManager.getDriver());
    }

    public DriverManager getWebDriverManager() {
        return driverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

}






