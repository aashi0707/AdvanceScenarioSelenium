package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMouseActions1 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
	/*	driver.get("https://www.amazon.in/");
		WebElement element = driver.findElement(By.xpath("//a[@data-csa-c-slot-id=\"nav-link-amazonprime\"]"));
		
		Actions act = new Actions(driver);
		
		// used to move cursor to other element
		 act.moveToElement(element).perform();
		
		// right click to particular element
		act.contextClick(element).perform();
	*/
		
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.name("user-name"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.id("login-button"));
		
		Actions act = new Actions(driver);
		/* act.sendKeys(username, "standard_user").perform();
		act.sendKeys(password, "secret_sauce").perform();
		
		act.sendKeys(login).click().perform();
		   // or
		act.click(login).perform();
		
		*/
		
		    // or 
		
		act.sendKeys(username, "standard_user").sendKeys(password, "secret_sauce").click(login).build().perform();
		
		
		
		
	}

}

