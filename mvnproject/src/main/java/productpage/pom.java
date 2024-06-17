package productpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pom {
	
	 WebDriver driver;
	 WebDriverWait wait;
	 By addTocartButton = By.id("product_addtocart_button");
	 public ProductPage(WebDriver driver) {
	 this.driver = driver;
	 this.wait = new
	 WebDriverwait(driver,10);
	 }
	 public void addTocart() {
	 wait.until(ExpectedConditions.elementToBeClickable(addTocartButton)).click();
	 }
	 Public string
	 getproductpageTitle() {
	 return driver.getTitle();
	 }
}
	 
			 
	
			 
	 


