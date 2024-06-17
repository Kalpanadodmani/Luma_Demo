package listing;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Productlisting {

	public static void main(String[] args) {


	//set the path chromeDriver
   System.setProperty("webdriver.chrome.driver","C:\\Users\\kalpana\\Downloads\\chromedriver-win64\\chromedriver-win64//chromedriver.exe");
	
   //initialize the chromeDriver
   WebDriver driver = new ChromeDriver();
   
   //Navigate to the Url
   driver.get("https://magento.softwaretestingboard.com/women.html");
   
   //verify there are products listed
   List< WebElement>productList = driver.findElements(By.cssSelector(".product_grid.product_item"));
   
   if(productList.size()>0) {
	System.out.println("Test passed:products are listed");
   }
   else
   {
	System.out.println("Test failed:no products listed");
   }
   driver.quit();
	}

   }
   

	
