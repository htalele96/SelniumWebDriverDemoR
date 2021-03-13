package com.plursight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/darwante/Documents/Javapractice/SeleniumWebDriverDemo/src/main/webapp/tabletest.html");
//		WebElement outerTable= driver.findElement(By.tagName("table"));
//		WebElement innerTable=outerTable.findElement(By.tagName("table"));
//		WebElement row=innerTable.findElements(By.tagName("td")).get(1);
//		System.out.println(row.getText());
		
		WebElement row=driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));
		System.out.println(row.getText());
	}

}
