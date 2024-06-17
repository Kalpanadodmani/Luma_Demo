package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Afterclass;
import org.testng.annotations.Beforeclass;
import org.testng.annotations.Test;



public class LumaproductpageTest {
	
WebDriver driver;
	
	@Beforeclass
	public void setup() 
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\kalpana\\Downloads\\chromedriver-win64\\chromedriver-win64//chromedriver.exe");	
	
	 driver = new ChromeDriver();
	 driver.get("https://example_luma.com/womens_product");
	}
	@Test
	public void verifyproductTitle() {
	WebElement productTitle = driver.findElement(By.cssSelector(".product_title"));
	Assert.assertTrue(productTitle_isDisplayed());
	Assert.assertEquals(productTitle.getText(), "Expected productTitle");
	}
	@Afterclass
	public void () {
		driver.quit();
	}
}
	
	
	
	


