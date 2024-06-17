package searchproduct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
	
	WebDriver driver;
	By searchbox =By.id("Search");
	By searchbutton = By.cssSelector("button.action.search");
	public (WebDriver driver)
	{
		this.driver = driver;
	}
	public void
	searchforproduct(stringproductname) {
	driver.findElement(searchBox).sendkeys(productname);
	driver.findElement(searchButton).click();
	}

	
	


