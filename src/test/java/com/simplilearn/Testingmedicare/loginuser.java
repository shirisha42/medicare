package com.simplilearn.Testingmedicare;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginuser {
	
	public void loginuse()throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost:8081/medicare");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		
		driver.findElement(By.id("login")).click();
		driver.findElement(By.tagName("input")).sendKeys("krish@123");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("5678");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/div/input[2]")).click();
		
		String expectedUrl = "http://localhost:8081/medicare/";
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,expectedUrl);
		driver.quit();
}
}
