package handles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.BasePage;
import pages.LoginPage;

public class Loginhandle{
	private WebDriver driver = new base.DriverBase().driverInit();
	public LoginPage page = new LoginPage(driver);
	public void login(String user,String pwd) {
		page.gotoLoginPage();
		page.getUserElement().sendKeys(user);
		page.getPasswordElement().sendKeys(pwd);
		page.getLoginbuttonElement().click();
	}
	

	
	public String loginError() {
		WebDriverWait wait = new WebDriverWait(page.webDriver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='layui-layer-content']")));
		WebElement ele = page.webDriver.findElement(By.xpath("//div[@class='layui-layer-content']"));
		System.out.println(ele.getText());
		return ele.getText();
	}
	public boolean loginSuccess() {
		
		System.out.println(driver.getCurrentUrl());
//		String url = constant.Constant.loginUrl+"/home";
		return driver.getCurrentUrl().equals(constant.Constant.loginUrl+"/home");
	}
//	BasePage one = new BasePage(driver);
//    public void methoda() {
//    	BasePage bp = new LoginPage(driver);
//    	((LoginPage)bp).getPasswordElement();
//    	
//    }
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public LoginPage getPage() {
		return page;
	}
	public void setPage(LoginPage page) {
		this.page = page;
	}
	
}
