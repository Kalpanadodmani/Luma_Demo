package lumatesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Gearpage {
	
	 WebDriver driver;
	 By bagsLink = By.linkText("Bags");
	 public Gearpage(WebDriver driver)
	 {
		 this.driver = driver;
	 }
	 public void selectbags() {
	 driver.findElement(bagsLink).click();
	 }
	 }

