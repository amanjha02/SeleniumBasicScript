package com.suit2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LaunchBrowser {
	 @Test    
	    public void executSessionOneSuittwo(){
	            //First session of WebDriver
	        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	            WebDriver driver = new ChromeDriver();
	            //Goto guru99 site
	            driver.get("http://demo.guru99.com/V4/");
	            //find user name text box and fill it
	            driver.findElement(By.name("uid")).sendKeys("Driver 1");
	            Reporter.log("First Test Case");
	            
	        }
	        
	    @Test    
	        public void executeSessionTwoSuittwo(){
	            //Second session of WebDriver
	        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	            //Goto guru99 site
	        driver.get("https://www.google.co.in/");
	        //find user name text box and fill it
	        driver.findElement(By.name("uid")).sendKeys("Driver 2");
	        
	        }
	        
	    @Test    
	        public void executSessionThreeSuittwo(){
	            //Third session of WebDriver
	        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	            //Goto guru99 site
	        driver.get("https://www.myntra.com/");
	        //find user name text box and fill it
	        driver.findElement(By.name("uid")).sendKeys("Driver 3");
	        
	        }        
}
