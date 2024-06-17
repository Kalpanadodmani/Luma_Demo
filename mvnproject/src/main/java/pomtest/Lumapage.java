package pomtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Lumapage {

	WebDriver driver;
	By watchLink = By.linkText("watches");
	public Gearpage(WebDriver driver)
	{
	this.driver = driver;
	}
	public void selectwatches() {
	driver.findElement(watchLink).click();
	}
	
}
	
	

