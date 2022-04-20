package com.harman.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Task3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			driver.get("https://nasscom.in/about-us/career");

			driver.findElement(By.xpath("//a[text()=' New User ']")).click();
			driver.findElement(By.id("edit-field-fname-reg")).sendKeys("Admin");
			driver.findElement(By.id("edit-field-lname")).sendKeys("Pass");
			driver.findElement(By.id("edit-mail")).sendKeys("admin@gmail.com");
			driver.findElement(By.id("edit-field-company-name-registration")).sendKeys("Google");
			driver.findElement(By.id("edit-field-business-focus-reg")).click();
			driver.findElement(By.xpath("//option[text()='IT Consulting']")).click();
			driver.findElement(By.id("edit-submit--2")).click();

			String errorText=driver.findElement(By.xpath("//label[contains(text(),'What code is in the image? field is required.')]")).getText();
			System.out.println(errorText);	

			driver.quit();
	}

}