package luma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LumaAutomation {

	public static void main(String[] args) {

   //setup webDriver
	WebDriver.ChromeDriver().setup();
	WebDriver driver = new ChromeDriver();
	
	try {
		
	//Navigate to the Luma WebSite
	driver.get("https://magento.softwaretestingboard.com/");
	
	//click on the women category
	WebElement womencategory = driver.findElement(By.linkText("Women"));
	womencategory.click();
	
	//click on jackets
	WebElement jacketslink = driver.findElement(By.linkText("jackets"));
	jacketslink.click();
	
	//select a product
	WebElement product = driver.findElement(By.cssSelector(".product_item-link"));
	product.click();
	
	//choose a size (if required)
	WebElement size = driver.findElement(By.id("option_label_size.143_item_168"));
	size.click();
	
	//choose a color (if required)
	WebElement color = driver.findElement(By.id("option_label_color_93_item_50"));
	color.click();
	
	//add to cart
	WebElement addtocart = driver.findElement(By.id("product_addtocart_button"));
	addtocart.click();
	
	//verify if the item is added to cart
	WebElement cartlink = driver.findElement(By.linkText("shopping cart"));
	cartlink.click();
	
	//print success message
	System.out.println("product successfully added to cart1");
	}catch(Exception e) {
	  e.printstacktrace();
	}finally {
		
	// close the browser
     driver.quit();
	}
	}

	
	
	  
	
	
		

	}

}
