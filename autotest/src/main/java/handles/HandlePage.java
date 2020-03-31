package handles;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.BasePage;

public class HandlePage {
	BasePage page;
	public HandlePage(BasePage page) {
		//
		this.page = page;
		
	}
	
	public void login() {
		//LoginPage page1 = new LoginPage(null);
		//((LoginPage)page).getPasswordElement();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("js代码");
	}
	

}
