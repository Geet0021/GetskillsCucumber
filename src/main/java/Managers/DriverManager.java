package Managers;
        import io.github.bonigarcia.wdm.config.DriverManagerType;
        import org.openqa.selenium.WebDriver;
        import enums.DriverType;

public class DriverManager {
    private WebDriver driver;
    private static DriverType driverType;
    private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";

   //This method is constructor (DriverManager)
    public DriverManager(){}
    //check driver for null else create a driver calls createDriver method
    public WebDriver getDriver() {
        if (driver == null) driver = createDriver();
        return driver;
    }
    //This method calling local driver
    private WebDriver createDriver() {
        driver = createLocalDriver();
        return driver;
    }
    private WebDriver createLocalDriver() {

        DriverManagerType chrome = DriverManagerType.CHROME;
        io.github.bonigarcia.wdm.WebDriverManager.getInstance(chrome).setup();
        System.setProperty(CHROME_DRIVER_PROPERTY, io.github.bonigarcia.wdm.WebDriverManager.chromedriver().getBinaryPath());
        Class<?> chromeClass = null;
        try {
            chromeClass = Class.forName(chrome.browserClass());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            driver = (WebDriver) chromeClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return driver;
    }

    public void closeDriver() {
        driver.close();
        driver.quit();
    }

}
