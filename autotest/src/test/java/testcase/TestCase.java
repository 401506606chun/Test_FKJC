package testcase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import base.DriverBase;
import constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TestCase {
    WebDriver driver = new DriverBase().driverInit();

    LoginPage loginPage = new LoginPage(driver);

    public void signIn(String user,String password) {
//       打开登录页面
        loginPage.gotoUrl(Constant.loginUrl);
//        输入用户名 user
        loginPage.getUserElement().sendKeys(user);
//        输入密码 password
        loginPage.getPasswordElement().sendKeys(password);
//        点击登录 loginbutton
        loginPage.getLoginbuttonElement().click();

    }

    public boolean  loginResult(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boolean isLogin = false;
//        出现退出按钮 证明登录成功
        WebElement logout = driver.findElement(By.xpath("//a[text()=' 退出']"));
        isLogin = logout.isDisplayed();
        return isLogin;
    }
/*
 * 测试方法testLogin
 * 入参分别为用户、密码  user 及pwd
 * */
    

//    public void testLogin(String user,String pwd) {
//    	this.signIn(Constant.loginUrl,user,pwd);
//        AssertJUnit.assertTrue(this.loginResult());
//    }
//    
//    
//    @Test
//    public void testLoginSuccess(){
//        this.signIn(Constant.loginUrl,"admin","123456");
//        AssertJUnit.assertTrue(this.loginResult());
//    }
//    @Test
//    public void testLoginError(){
//        this.signIn(Constant.loginUrl,"admin","1234567");
//        AssertJUnit.assertTrue(this.loginResult());
//    }
 
    
    
//    public static void main(String args[]) {
//        TestCase testCase = new TestCase();
//        testCase.signIn(Constant.loginUrl);
///Users/jiubugaosuni/Downloads/Git/autotest/autotest
//    }

}
