package com.Firstpage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MousehoverFuction {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		//click by  mousehover link name 
		WebElement ele = driver.findElement(By.cssSelector("#nav-link-accountList"));
		//Action for mousehover Function 
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		//Mousehavour element list 
		List<WebElement> list = driver.findElements(By.xpath(".//*[@id='nav-al-your-account']//a[@class='nav-link nav-item']/span"));
		System.out.println("list of links: "+list.size());
	
		int total_count =list.size();
		
		for(int i=0;i<total_count;i++){
			
			WebElement links = list.get(i);
			String text = links.getAttribute("innerHTML");
			System.out.println("links are :" + text);
		
		if(text.equalsIgnoreCase("Your Account"))
		{
			links.click();
			break;
		}
		}
		
driver.close();
	}

}
