package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import base.DriverBase;
import handles.Loginhandle;
import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LoginTest {
	Loginhandle handle = new Loginhandle();
  @Test
  public void f1() {
	  System.out.println("This is testcase f1");
	  handle.login("admin", "1234561");
	  Assert.assertEquals("用户名或密码错误", handle.loginError());
  }
  @Test
  public void f2() throws InterruptedException {
	  System.out.println("This is testcase f2");
	  handle.login("admin", "123456");
	 Thread.sleep(1000);
//	  Assert.assertEquals(Boolean.valueOf("true").booleanValue(), handle.loginSuccess());
	  Assert.assertEquals(true, handle.loginSuccess());
  }

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is beforeMethod");
//	  WebDriver chromedriver = new DriverBase().driverInit();
	  handle.getDriver().get(constant.Constant.loginUrl);
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is afterMethod");
	  handle.getDriver().close();
  }

  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is afterTest");
  }

}

