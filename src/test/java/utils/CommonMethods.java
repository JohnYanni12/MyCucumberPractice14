package utils;

import Steps.PageInitalizer;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CommonMethods extends PageInitalizer {

    public static WebDriver driver;

    public static void openBrowserAndLaunchApplication() {

        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        switch (ConfigReader.getPropertyValue("browser")) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid browser name");
        }
        driver.manage().window().maximize();
        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       // driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        intializePageObjects();
    }
    public static void closeBrowser() {
        driver.quit();
    }

    public static void sendText(WebElement element, String textToSend){
        element.clear();
        element.sendKeys(textToSend);
    }

    //to get webdriver wait
//    public static WebDriverWait getWait() {
//        WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT);
//        return wait;
//    }

    //this method will wait for the element to be clickable
//    public static void waitForClickability(WebElement element) {
//        getWait().until(ExpectedConditions.elementToBeClickable(element));
//    }


    public static void click(WebElement element) {
        element.click();
    }

    public static JavascriptExecutor getJsExecutor() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js;
    }

    public static void jsClick(WebElement element) {
        getJsExecutor().executeScript("arguments[0].click();", element);
    }

    //selecting the dropdown using text
    public static void selectDropdown(WebElement element, String text) {
        Select s = new Select(element);
        s.selectByVisibleText(text);
    }
}




