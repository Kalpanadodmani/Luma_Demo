package listingpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bagspage {
	 WebDriver driver;
	 WebDriverWait wait;
 public Bagspage(WebDriver driver)
 {
	 this.driver = driver;
	 this.wait = new
	 WebDriverwait(driver,10);
  public void selectFirstBag() {
	  WebElement firstBags =wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".product _ item.a.product_item_link")));
     firstBag.click();
  }

}
