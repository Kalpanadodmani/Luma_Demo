package lumatest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddproductTocartTest {

	public static void main(String[] args) {
	
    
     //set the path to chromeDriver
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\kalpana\\Downloads\\chromedriver-win64\\chromedriver-win64//chromedriver.exe");
	 
	 //initialize the chromeDriver
	   WebDriver driver = new ChromeDriver();
	   
	   //Navigate to the Url
	   driver.get("https://magento.softwaretestingboard.com/women.html");
	   
	   //click on product
	   WebElement product = driver.findElement(By.cssSelector("product_item a .product_item_link"));
	   product.click();
	   
	   
	   //Add to cart
	   WebElement addtocartbutton = driver.findElement(By.id("product_addtocart-button"));
	   addtocartbutton.click();
	   
	   //verify product added to cart
	   WebElement cartcount = driver.findElement(By.cssSelector("number"));
	   
	   if(!
		cartcount.getText().equals("0")) {
		System.out.println("Test passed:product added to cart");
	   }
	   else
	   {
	System.out.println("Test failed:product not added to cart");
	   }
	   driver.quit();
	}









	   
	 
	 
	}

}
