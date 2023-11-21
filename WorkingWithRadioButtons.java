package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithRadioButtons {

	public static void main(String[] args) throws InterruptedException {

		// Launching browser
				WebDriverManager.edgedriver().setup();
				WebDriver driver = new EdgeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://demowebshop.tricentis.com/");
				
				List<WebElement> allRadioButtons = driver.findElements(By.xpath("//li[@class='answer']//label"));
		
				for (WebElement radioButton : allRadioButtons) 
				{
					radioButton.click();
					Thread.sleep(3000);
				}
	}

}
