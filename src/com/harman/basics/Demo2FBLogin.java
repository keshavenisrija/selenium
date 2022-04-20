package com.harman.basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Demo2FBLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.openemr.io/b/openemr");
        
        driver.findElement(By.id("authUser")).sendKeys("admin");
        driver.findElement(By.id("clearPass")).sendKeys("pass");
        driver.findElement(By.id("form_DOB")).sendKeys("2022-18-04");


	}

}
