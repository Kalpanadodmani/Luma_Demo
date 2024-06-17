package seleniumtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InitTests {



  @Test
  public void firstTestcase() {
  System.out.println("Running first Test");	
  System.setProperty("webdriver.chrome.driver","C:\\Users\\Malik\\Downloads\\chromedriver-win64\\chromedriver-win64//chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("https://elearning.excelr.com/");
  String title = driver.getTitle();
  Assert.assertTrue(title.contains("ExcelR"), "Title does not contain ExcelR");
  }
  
  
  

  @Test
  public void secondTestcase() {
  System.out.println("Running second Test");	  
  System.setProperty("webdriver.chrome.driver","C:\\Users\\Malik\\Downloads\\chromedriver-win64\\chromedriver-win64//chromedriver.exe");
  WebDriver driver = new ChromeDriver();
   driver.get("https://google.com/");
  String title = driver.getTitle();
  Assert.assertTrue(title.contains("Google"), "Title does not contain google");

  }
  }
  
  
	  
  
  


  
   
  
  
  
  
  