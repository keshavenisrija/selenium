package com.harman.basics;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Demo3FBSignUP {

	public static void main(String[] args) throws InterruptedException{
		
System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.get("https://demo.openemr.io/b/openemr");
        driver.findElement(By.linkText("Create New Account")).click();
        driver.findElement(By.name("firstname")).sendKeys("srija");
        driver.findElement(By.name("lastname")).sendKeys("k");
        driver.findElement(By.name("reg_email__")).sendKeys("hello123@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("hello123@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("welcome123");
        driver.findElement(By.xpath("//input[@value='-1']")).click();
	}  

}
