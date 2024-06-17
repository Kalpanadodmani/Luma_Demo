package listingwatches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Watchespage {
	
 WebDriver driver;
 WebDriverWait wait;
 public Watchespage(WebDriver driver) {
	 this.driver = driver;
	 this.wait = new
     WebDriverwait(driver,10);
 }
 public void selectFirstWatch() {
  WebElement firstwatch = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".product_item a.product_item_link")));
  firstwatch.click();
 }
 }


