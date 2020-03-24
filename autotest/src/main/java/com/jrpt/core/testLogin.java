package com.jrpt.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.DriverBase;

public class testLogin {
	DriverBase base = new DriverBase();
	public  WebDriver driver = base.driverInit();
	
	
	String url ="http://test-fintech.sinoiov.com/core-admin/#/user/login?redirect=%2F";
	String[] user = {"id","username","admin"};
	String[] pwd = {"id","password","123456"};
	String[] msg = {"xpath","//div[@class='ant-notification-notice-message']"};
	
	public String login(String user,String password) {
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.tagName("button")).click();
		new WebDriverWait(driver,30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='ant-notification-notice-message']")));
		String result = driver.findElement(By.xpath("//div[@class='ant-notification-notice-message']")).getText();
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 打开登录页面 url http://test-fintech.sinoiov.com/core-admin/#/user/login?redirect=%2F
		 * 输入账户名  id=username admin
		 * 输入密码 id=password 123456
		 * 获取结果  class=ant-notification-notice-description text 登录失败
		 * **/	
		testLogin test = new testLogin();
		System.out.println("第一条case");
		System.out.println("输入admin/123456,结果是"+test.login("admin","123456"));	
	}

}
