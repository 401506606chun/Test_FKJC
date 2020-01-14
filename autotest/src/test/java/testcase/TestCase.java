package testcase;

import base.DriverBase;
import constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TestCase {
    WebDriver driver = new DriverBase().driverInit();

    LoginPage loginPage = new LoginPage(driver);


    public void signIn(String url) {
//       打开登录页面
        loginPage.gotoUrl(url);
//        输入用户名 user
        loginPage.getUserElement().sendKeys("admin");
//        输入密码 password
        loginPage.getPasswordElement().sendKeys("123456");
//        点击登录 loginbutton
        loginPage.getLoginbuttonElement().click();

    }
    @Test
    public void testLogin(){
        this.signIn(Constant.loginUrl);
        boolean isLogin = false;
//        出现退出按钮 证明登录成功
        isLogin = driver.findElement(By.xpath("//a[text()=' 退出']")).isDisplayed();
        Assert.assertTrue(isLogin);
    }
//    public static void main(String args[]) {
//        TestCase testCase = new TestCase();
//        testCase.signIn(Constant.loginUrl);
//
//    }

}
