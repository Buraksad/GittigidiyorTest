package Base;

import Constants.Constants;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    static WebDriver webDriver=null;
    @Before

    public void setUp() {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("disable-notifications");
        chromeOptions.addArguments("disable-popup-blocking");

        setWebDriver(new ChromeDriver(chromeOptions));
        getWebDriver().navigate().to(Constants.LINK);


    }
    protected WebDriver getWebDriver() {
        return webDriver;
    }

    public static void setWebDriver(WebDriver webDriver) {
        BaseTest.webDriver = webDriver;
    }

    public void tearDown(){
        getWebDriver().quit();
    }

}
