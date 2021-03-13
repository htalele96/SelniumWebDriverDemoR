package com.plursight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/darwante/Documents/Javapractice/SeleniumWebDriverDemo/src/main/webapp/selectItem.html");
		WebElement dropDown=driver.findElement(By.id("select1"));
		Select select=new Select(dropDown);  //wrapper class
		select.selectByVisibleText("Maybe");
	}

}
