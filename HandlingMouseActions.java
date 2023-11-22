package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMouseActions {

	public static void main(String[] args) {


		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[.='X']")).click();
		
		//To handle mouse actions, we use action class
		//MoveToElement
		 WebElement eleName = driver.findElement(By.xpath("//span[text()='Fashion']"));
		Actions act = new Actions(driver);
		act.moveToElement(eleName).perform();
		
		//Right click on Element
		 eleName = driver.findElement(By.xpath("//span[text()='Travel']"));
		 
		act = new Actions(driver);
		act.contextClick(eleName).perform();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		
		
		
		
		
	}

}
