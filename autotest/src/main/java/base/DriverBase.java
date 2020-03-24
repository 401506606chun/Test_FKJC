package base;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ReadFile;

import java.util.List;

public class DriverBase {
    public WebDriver webDriver;



    public WebDriver driverInit() {
        String os = System.getProperty("os.name");
        System.out.print(os);
        /*		根据不同系统走不同的驱动配置
         */
        if (os.contentEquals("Windows 10")) {
            System.setProperty("webdriver.chrome.driver", "D:\\Git\\imooc\\coding-118-master\\coding-118\\chromedriver_win32\\chromedriver.exe");
        } else if (os.contentEquals("MAC")) {
            System.setProperty("webdriver.chrome.driver", "//Users//jiubugaosuni//workspace//javaSelenium//chromedriver");
        } else {
            System.out.println("没有相应驱动");
        }
//		配置浏览器（不要提示具体信息，如浏览器受到自动软件控制）
        ChromeOptions option = new ChromeOptions();
        option.addArguments("disable-infobars");
//        option.addArguments("headless");
        webDriver = new ChromeDriver(option);
        return webDriver;

    }

//    public void gotoUrl(WebDriver driver, String testUrl) {
//        driver.get(testUrl);
//        driver.manage().window().maximize();
//    }

//    public void getByLocator(String pagename){
//
//    }


    public By byStr(String by, String element) {
        if (by.equals("id")) {
            return By.id(element);
        } else if (by.equals("name")) {
            return By.name(element);
        } else if (by.equals("className")) {
            return By.className(element);
        } else if (by.equals("xpath")) {
            return By.xpath(element);
        } else {
            return null;
        }
    }

    public void waitForElementToLoad(WebDriver driver, int timeOut) {
        try {
            (new WebDriverWait(driver, timeOut)).until(new ExpectedCondition<Boolean>() {

                public Boolean apply(WebDriver driver) {
                    WebElement element = driver.findElement(By.id("username"));
                    System.out.println("find it");
                    return element.isDisplayed();
                }
            });

        } catch (TimeoutException e) {
            System.out.println("超时!! " + timeOut + " 秒之后还没找到元素 [" + "By" + "]");
        }
    }

    public void elementLocate(String by, String locator) {
        WebElement ele = webDriver.findElement(this.byStr(by, locator));

    }
//    public void timeoutHandle(){
//        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//        Timeouts timeouts = driver.manage().timeouts();
//        timeouts.implicitlyWait(30, java.util.concurrent.TimeUnit.SECONDS);
//        timeouts.pageLoadTimeout(30, java.util.concurrent.TimeUnit.SECONDS);
//        timeouts.setScriptTimeout(30, java.util.concurrent.TimeUnit.SECONDS);
//    }
}

