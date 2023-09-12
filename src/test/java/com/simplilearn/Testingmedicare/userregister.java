package com.simplilearn.Testingmedicare;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class userregister {
	
	public void register1()throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost:8081/medicare");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		driver.findElement(By.id("signup")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("sri");
    	driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("krishna");
 		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("krish@123");
		driver.findElement(By.xpath("//*[@id=\"contactNumber\"]")).sendKeys("9299999999");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("5678");
		driver.findElement(By.xpath("//*[@id=\"confirmPassword\"]")).sendKeys("5678");
    	driver.findElement(By.id("role1")).isSelected();
    	driver.findElement(By.tagName("button")).click();
    	driver.findElement(By.id("addressLineOne")).sendKeys("5-60 a colony");
    	driver.findElement(By.id("addressLineTwo")).sendKeys("uppal");
    	driver.findElement(By.id("city")).sendKeys("hyderabad");
    	driver.findElement(By.id("postalCode")).sendKeys("500056");
    	driver.findElement(By.id("state")).sendKeys("telangana");
    	driver.findElement(By.id("addressLineOne")).sendKeys("5-60 a colony");
    	driver.findElement(By.id("country")).sendKeys("india");
    	driver.findElement(By.xpath("//*[@id=\"billingForm\"]/div[7]/div/button[2]/span")).click();
    	Thread.sleep(500);
    	driver.findElement(By.partialLinkText("Confi")).click();
    	driver.quit();
}
}
