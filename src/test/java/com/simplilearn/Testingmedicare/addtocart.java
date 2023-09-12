package com.simplilearn.Testingmedicare;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class addtocart {
	

	public void added() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost:8081/medicare/");
		Thread.sleep(2000);
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("username")).sendKeys("sri@123");
		driver.findElement(By.id("password")).sendKeys("5678");
		driver.findElement(By.xpath("(//input[@value='Login'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("View Products")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[6]/a[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.tagName("input")).sendKeys("2");
		Thread.sleep(500);
		driver.findElement(By.partialLinkText("Continue Shoppi")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//a[@class='btn btn-success'])[3]")).click();
		Thread.sleep(500);
		driver.findElement(By.partialLinkText("Checko")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Select")).click();
		Thread.sleep(500);
		driver.findElement(By.id("cardNumber")).sendKeys("456767897895");
		driver.findElement(By.id("expityMonth")).sendKeys("08");
		driver.findElement(By.id("expityYear")).sendKeys("1996");
		driver.findElement(By.id("cvCode")).sendKeys("456");
		driver.findElement(By.linkText("Pay")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("h3[class='text-center']")).getText());
		driver.quit();

}

}


