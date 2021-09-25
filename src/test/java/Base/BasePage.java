package Base;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;


public class BasePage {

    WebDriver webDriver=null;
    WebDriverWait webDriverWait=null;

    public BasePage(WebDriver webDriver){

        this.webDriver=webDriver;

        this.webDriverWait=new WebDriverWait(webDriver,60);

    }

    public void assertionPage(String text) {
        Assert.assertEquals(text, webDriver.getTitle());
    }

    public void assertionURL(String text) {
        Assert.assertEquals(text, webDriver.getCurrentUrl());
    }

    public WebElement findElement(By by) {
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return webDriver.findElement(by);
    }

    public List<WebElement> findElements(By by) {
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return webDriver.findElements(by);
    }

    public void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);
    }

    public void click(By by) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }

    public void hoverElement(By by) {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(findElement(by)).build().perform();
    }

    public void randomItemClick(By by) {
        Random rand = new Random();
        findElements(by).get(rand.nextInt(findElements(by).size())).click();
    }

    public void waitForSecond(int x) throws InterruptedException {
        Thread.sleep(1000 * x);
    }

    public void scrollToElement(By by) {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].scrollIntoView();", findElement(by));
    }

    public void selectItem(By by,String value){
        Select select=new Select(webDriver.findElement(by));
        select.selectByVisibleText(value);

    }
}
