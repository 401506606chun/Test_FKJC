package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LoginTest {
  @Test
  public void f() {
	  System.out.print("This is testcase");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.print("This is beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.print("This is afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.print("This is beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.print("This is afterTest");
  }

}
