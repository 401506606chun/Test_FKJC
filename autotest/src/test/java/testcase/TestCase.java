package testcase;

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


    public void signIn(String url,String user,String password) {
//       打开登录页面
        loginPage.gotoUrl(url);
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
        return logout.isDisplayed();
    }
    @Test
    public void testLoginSuccess(){
        this.signIn(Constant.loginUrl,"admin","123456");
        Assert.assertTrue(this.loginResult());
    }
    @Test
    public void testLoginError(){
        this.signIn(Constant.loginUrl,"admin","1234567");
        Assert.assertTrue(this.loginResult());
    }
//    public static void main(String args[]) {
//        TestCase testCase = new TestCase();
//        testCase.signIn(Constant.loginUrl);
//
//    }

}
