package com.harman.multipletabs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Medibuddy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.get("https://www.medibuddy.in/");
        driver.findElement(By.id("wzrk-cancel")).click();
        
        driver.findElement(By.linkText("For Employer")).click();
        List<String>window=new ArrayList<String>(driver.getWindowHandles());
        System.out.println(window.get(0));
	    System.out.println(window.get(1));
	    driver.switchTo().window(window.get(1));
        
        driver.findElement(By.id("getInTouchName")).sendKeys("hello");
        driver.findElement(By.id("getInTouchEmail")).sendKeys("hello@gmail.com");
        driver.findElement(By.id("getInTouchMobile")).sendKeys("12345");
        
        driver.findElement(By.xpath("//button[text()='Get in Touch']")).click();
        
        String errText= driver.findElement(By.xpath("//div[contains(text(),'10 digit')]")).getText();
        System.out.println(errText);
        driver.quit();
        
	}

}
