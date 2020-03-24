package pages;

import base.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
        //this.driver = driver;
    }

    /*
    获取 用户名user、密码password输入框
    */
//    public WebElement getLoginpageElement(String pageName,String key) {
//        return findElement(getByLocator("loginPage","user"));
//    }
    public WebElement getUserElement() {
        return findElement(getByLocator("loginPage","user"));
    }
    public WebElement getPasswordElement() {
        return findElement(getByLocator("loginPage","password"));
    }
    public WebElement getLoginbuttonElement(){
        return findElement(getByLocator("loginPage","loginbutton"));
    }

}
