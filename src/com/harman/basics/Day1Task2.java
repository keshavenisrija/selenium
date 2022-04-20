package com.harman.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day1Task2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goto.com/meeting/");

		driver.findElement(By.id("truste-consent-button")).click();
		driver.findElement(By.xpath("//a[text()='Try Free']")).click();
		driver.findElement(By.id("first-name")).sendKeys("jhon");
		driver.findElement(By.id("last-name")).sendKeys("wick");
		driver.findElement(By.id("login__email")).sendKeys("john@gmail.com");
		driver.findElement(By.id("login__password")).sendKeys("john1234");
		driver.findElement(By.id("CompanySize")).click();
		driver.findElement(By.xpath("//option[text()='10 - 99']")).click();
		driver.findElement(By.xpath("//button[text()='Start My Trial']")).click();



	}

}