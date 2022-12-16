package thirdTest;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestExam3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Selenium Prj\\selenium-java-4.7.2\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		// Hide control by automation
				options.setExperimentalOption("useAutomationExtension", false);
				options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));    
				WebDriver driver = new ChromeDriver(options);
				// Maximize window size
				driver.manage().window().maximize();
				driver.get("https://itera-qa.azurewebsites.net/home/automation");
				driver.findElement(By.id("male")).click();
				Thread.sleep(1000); 
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,400)", "");
				Thread.sleep(2000); 
				driver.findElement(By.id("tuesday")).click();
				driver.findElement(By.id("friday")).click();
				Thread.sleep(2000); 
				driver.quit();
			
	}

}
