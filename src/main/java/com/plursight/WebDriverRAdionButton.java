package com.plursight;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverRAdionButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/darwante/Documents/Javapractice/SeleniumWebDriverDemo/src/main/webapp/radioButton.html");
			List<WebElement>  radioButtons= driver.findElements(By.name(("color")));
			radioButtons.get(2).click();
			
			for (WebElement radioButton : radioButtons) {
				if(radioButton.isSelected()) {
					System.out.println(radioButton.getAttribute("value"));
					
				}
				
			}
	}

}
