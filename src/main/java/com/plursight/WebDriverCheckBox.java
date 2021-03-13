package com.plursight;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/darwante/Documents/Javapractice/SeleniumWebDriverDemo/src/main/webapp/checkBox.html");
		WebElement checkBox= driver.findElement(By.id("lettuceCheckbox"));
		
		checkBox.click();
		
	}
			}