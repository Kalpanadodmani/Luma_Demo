package Lumapage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatetowomenproductpage {

	public static void main(String[] args) {

		
	// set the path to chromeDriver
  System.setProperty("webdriver.chrome.driver","C:\\Users\\kalpana\\Downloads\\chromedriver-win64\\chromedriver-win64//chromedriver.exe");
     
    //initialize chromeDriver
  WebDriver driver = new ChromeDriver();
  
   //open luma WebSite
  driver.get("https://magento.softwaretestingboard.com/");
  
  //navigate to womens section
  WebElement womenmenu = driver.findElement(By.linkText("women"));
  womenmenu.click();
  
  //verify navigation to womens section
  String expectedurl = "https://magento.softwaretestingboard.com/women.html";
  String actualurl = driver.getCurrentUrl();
  
  if
  (expectedurl.equals(actualurl)) {
   System.out.println("Test passed");
  } else {
	  System.out.println("Test failed");
  }
  driver.quit();
	}





  
  
  
  
  
	}

}
