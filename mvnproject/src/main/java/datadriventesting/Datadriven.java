package datadriventesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Beforeclass;
import org.testng.annotations.Dataprovider;
import org.testng.annotations.Test;

public class Datadriven {
	WebDriver driver;
	
	@Beforeclass
	public void setup() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\kalpana\\Downloads\\chromedriver-win64\\chromedriver-win64//chromedriver.exe");	
	
	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10);
	}
	@Dataprovider(name = "hoodiesData")
	public object[][] getHoodiesData()
	{
	List<String[]>data = Excelutils.readExcelData("data/dataFile");
	returndata.toArray(new object[data.size()][]);
	}
	@Test(dataprovider = "hoodiesData")
	public void testHoodies(stringsearchTerm) {
	driver.get("https://magento.softwaretestingboard.com/");
	
	//Assuming the searchbox is used to find hoodies
	WebElement searchBox = driver.findElement(By.id("search"));
	searchBox.sendKeys(searchTerm);
	searchBox.submit();
	
	if(driver!= null) {
		driver.quit();
	}
	}
	
	


