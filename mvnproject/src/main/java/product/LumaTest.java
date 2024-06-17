package product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

 public class LumaTest {
 WebDriver driver;

  @Beforeclass

  public void setup() {
	
  //set the path to chromeDriver
 System.setProperty("webdriver.chrome.driver","C:\\Users\\kalpana\\Downloads\\chromedriver-win64\\chromedriver-win64//chromedriver.exe");
 
 //initialize webDriver
 driver = new ChromeDriver();
 
 //open luma webSite
 driver.get("https://www.luma.com");
  }
  
  @Test
  public void
  testsearchAndAddProductToCart() {
	  
  //Locate the search bar and enter the product name
   WebElement searchBox = driver.findElement(By.id("search"));
   searchBox.sendKeys("Jacket");
   
   //click on the search button
   WebElement SearchBox = driver.findElement(By.cssSelector("button.action.search"));
   SearchButton.click();
   
   //wait for the result to load and click the first product
   WebElement firstproduct = driver.findElement(By.cssSelector("prooducts_grid.product_item:first_child"));
   firstproduct.click();
   
   //Add the product to the cart
   WebElement addTocartButton = driver.findElement(By.id("product_addtocart_button"));
   addToCartButton.click();
   
   //verify the product is added to the cart
   WebElement cart = driver.findElement(By.cssSelector(".action.showcart"));
   cart.click();
   
   WebElement cartproduct = driver.findElement(By.cssSelector(".product_item_name"));
   
   Assert.assertTrue(cartproduct.getText().contains("jacket"),"product not.added to the cart");
  }
  
  @Afterclass
  public void teardowm() {

   //close the browser
	if(driver!= null) {
	driver.quit();
	}
  }
 
 
 
 
 
 
 
 
	}
   

  
 
}

	
	
	

}
