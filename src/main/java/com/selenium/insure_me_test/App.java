package com.selenium.insure_me_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--headless");

    	 WebDriver driver = new ChromeDriver(options);

                      
         driver.get("http://54.213.236.6:8081/contact.html");
         
         driver.getTitle();
          
           System.out.println(driver.getTitle());
          
           WebElement name = driver.findElement(By.id("inputName"));
          name.sendKeys("Satya");
          
           WebElement number = driver.findElement(By.id("inputNumber"));
           number.sendKeys("111111");
           
          WebElement email = driver.findElement(By.id("inputMail"));
           email.sendKeys("Satya@xyz.com");
           
           WebElement message = driver.findElement(By.id("inputMessage"));
           message.sendKeys("Capstone Test Message");
           
          WebElement submitButton = driver.findElement(By.id("my-button"));
          submitButton.click();
          
           WebElement response = driver.findElement(By.id("response"));
           response.getText();
          
          System.out.println(response.getText());
          
           if(response.getText().equalsIgnoreCase("Message Sent")) {
            System.out.println("Test Case Passed");
          }
          else
           {
          System.out.println("Test Case Failed");
          }
                    
        
          driver.quit();
    	
    	
    }
}
