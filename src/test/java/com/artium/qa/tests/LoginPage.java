package com.artium.qa.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginPage {
	
	@Test
	public void setUp() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://uatreact.artiumacademy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement bookATrail = driver.findElement(By.xpath("//a[@id ='bookAfreeTrial-solid']"));
		bookATrail.click();
		
		WebElement name = driver.findElement(By.id("learner-name"));
		name.sendKeys("testautomatio");
		
		driver.findElement(By.xpath("//div[contains(@class, 'rc-country-code')]")).click();
		
		driver.findElement(By.xpath("//div[@class ='list-item']//span[text() = 'UAE']")).click();
		
		WebElement mobileNumber = driver.findElement(By.id("standard-number"));
		mobileNumber.sendKeys("1234567899");
		
		WebElement continueBtn = driver.findElement(By.xpath("//button[@type = 'submit']"));
		continueBtn.click();
		Thread.sleep(5000); 
		
		//To select age, gender and emailId
		
		driver.get("https://uatreact.artiumacademy.com/bookfreetrial/personalinfo");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement age = driver.findElement(By.xpath("//span[text() = '13-21']"));
		age.click();
		
		WebElement gender = driver.findElement(By.xpath("//span[text() = 'Male']"));
		gender.click();
		WebElement email  = driver.findElement(By.id("learner-email"));
		email.sendKeys("aaa@gmail.com");	
		
		
		WebElement next = driver.findElement(By.xpath("//button[text() = 'Next']"));
		next.click();
		
		
		WebElement hindiMusic = driver.findElement(By.xpath("//div[contains(@class ,'course-info')]//span[text() = 'Hindi Film Music']"));
		hindiMusic.click();
		
		WebElement nextBtn = driver.findElement(By.xpath("//button[text() = 'Next']"));
		nextBtn.click();
		
		
		
	}

}
