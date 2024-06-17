package productspage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import listingpage.Bagspage;
import lumatesting.Gearpage;
import pom.Lumamainpage;

public class LumaTest {

	public static void main(String[] args) {
	
	//set the path chromeDriver
   System.setProperty("webdriver.chrome.driver","C:\\Users\\kalpana\\Downloads\\chromedriver-win64\\chromedriver-win64//chromedriver.exe");

 //initialize the chromeDriver
   WebDriver driver = new ChromeDriver();
   
   try {
	//open the luma website
	   driver.get("https://magento.softwaretestingboard.com");
	   
	 //Instantiate page objects
	 Lumamainpage mainpage = new lumamaiunpage(driver);
	 Gearpage gearpage = new Gearpage(driver);
	 Bagspage bagspage = new Bagspage(driver);
	 productpage productpage = new productpage(driver);
	 
	 //perform actions
	 mainpage.navigateTOGear();
	 gearpage.selectbags();
	 bagspage.selectFirstBag();
	 productpage.addtocart();
	 
	 System.out.println("product page title:"+productpage.getproductpageTitle());
   }
   catch(Exception e) {
   }finally {
	   
	 //close the browser
	   driver.quit();
   }
	}

}
	 
	 
   
   
	


