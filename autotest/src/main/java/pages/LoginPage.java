package pages;

import base.DriverBase;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
        
        //this.driver = driver;
    }
    // LoginPage l = new LoginPage();

    /*
    获取 用户名user、密码password输入框
    */
//    public WebElement getLoginpageElement(String pageName,String key) {
//        return findElement(getByLocator("loginPage","user"));
//    }
    public void gotoLoginPage() {
    	super.gotoUrl(constant.Constant.loginUrl);
    }
    public WebElement getUserElement() {
        return findElement(getByLocator("loginPage","user"));
    }
    public WebElement getPasswordElement() {
        return findElement(getByLocator("loginPage","password"));
    }
    public WebElement getLoginbuttonElement(){
        return findElement(getByLocator("loginPage","loginbutton"));
    }
    
    public List<String> getLoginPageElement() {
    	return super.getPageElement(constant.Constant.loginElement);
    }
    

//    public WebElement element(String a, String b) {
//    	if(StringUtils.equals("id", a)) {
//    		return null;
//    	}else if() {
//    		
//    	}else {
//    		
//    	}
//    	
//    }
    public static void main(String[] args) {
    	new LoginPage(null).getLoginPageElement();
    }

}
