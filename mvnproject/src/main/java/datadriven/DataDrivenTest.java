package datadriven;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeMethod
	public void setup() {
		
	//setup webDriver
	WebDriver.ChromeDriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	wait = new
	WebDriverwait(driver,Duration.ofSeconds(10));
	
	@DataProvider(name = "filterdata")
	public object[][] getdata() {
		{"Bag"},
	
		
	@Test(dataprovider = "filterdata")
	public void testfilterbags string bag,stringExpected description)  {
	
	//Navigate to the luma website
	driver.get("https://magento.softwaretestingboard.com/");
		
	//navigate to the Gear section
	WebElement gearmenu = driver.findElement(By.linkText("Gear"));
	wait.until(ExpectedConditions.elementToBeClickable(gearmenu)).click();
	
	//navigate to bag category
	WebElement bagcategory = driver.findElement(By.linkText("bag"));
	wait.until(ExpectedConditions.elementToBeClickable(bagcategory)).click();
	
	//close the browser
	driver.quit();
	}
	}


	
	
	
	
		
		
			
		
			
			
		
		
	
	
	
	
		
	
	
	
	


