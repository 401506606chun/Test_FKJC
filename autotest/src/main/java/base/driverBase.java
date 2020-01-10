package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class driverBase {
    WebDriver driver;
    static driverBase base = new driverBase();

    public WebDriver driverInit() {
        String os = System.getProperty("os.name");
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
        driver = new ChromeDriver(option);
        return driver;

    }

    public void gotoUrl(String testUrl) {
        driver.get(testUrl);
        driver.manage().window().maximize();
    }
//    public void timeoutHandle(){
//        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//        Timeouts timeouts = driver.manage().timeouts();
//        timeouts.implicitlyWait(30, java.util.concurrent.TimeUnit.SECONDS);
//        timeouts.pageLoadTimeout(30, java.util.concurrent.TimeUnit.SECONDS);
//        timeouts.setScriptTimeout(30, java.util.concurrent.TimeUnit.SECONDS);
//    }
}

