package com.plursight;



import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class WebDriverDemo {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
		Capabilities cap=DesiredCapabilities.chrome();
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),DesiredCapabilities.chrome());
		
		//WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement searchField=driver.findElement(By.name("q"));
		searchField.sendKeys("pluralsight");
		searchField.submit();
		
		List<WebElement> imageLink=driver.findElements(By.linkText("Images"));
		imageLink.get(0).click();
		
//		WebElement imageElement= driver.findElements(By.cssSelector("[wXeWr islib nfEiy mM5pbd]")).get(0);
//		WebElement imagelink2=imageElement.findElements(By.tagName("img")).get(0);
//		imagelink2.click();
				
		driver.close();
		
		
	}

}
