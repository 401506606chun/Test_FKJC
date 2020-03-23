package pages;

import base.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.ReadFile;

import java.util.List;

public class BasePage {
    public WebDriver webDriver;
    ReadFile read = new ReadFile();

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void gotoUrl(String testUrl) {
        webDriver.get(testUrl);
        webDriver.manage().window().maximize();
    }


    public WebElement element(By by) {
        WebElement element = webDriver.findElement(by);
        //WebElement element = webDriver.findElement(By.id("username"));
        return element;
    }


    public WebElement findElement(By by) {
        WebElement element = webDriver.findElement(by);
        //WebElement element = webDriver.findElement(By.id("username"));
        return element;
    }

    public By getByLocator(String pageName, String key) {
        List<String> list = read.readFile("D:\\Git\\github-20200109\\autotest\\" + pageName + ".txt");

        String keyMessage = null;

        String locatorType = null;
        String locatorValue = null;
        for (int i = 0; i < list.size(); i++) {
            keyMessage = list.get(i);
            if (keyMessage.split(">")[0].contentEquals(key)) {
                locatorType = keyMessage.split(">")[1];
                locatorValue = keyMessage.split(">")[2];
            }else{
                System.out.println("第"+i+"行没找到对应key");
            }
        }




        if (locatorType.equals("id")) {
            return By.id(locatorValue);
        } else if (locatorType.equals("name")) {
            return By.name(locatorValue);
        } else if (locatorType.equals("tagName")) {
            return By.tagName(locatorValue);
        } else if (locatorType.equals("linkText")) {
            return By.linkText(locatorValue);
        } else if (locatorType.equals("className")) {
            return By.className(locatorValue);
        } else {
            return By.xpath(locatorValue);
        }
    }
}
