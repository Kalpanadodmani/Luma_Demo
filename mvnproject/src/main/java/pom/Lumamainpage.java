package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Lumamainpage {
	WebDriver driver;
	By gearmenu = By.linkText("Gear");
	public Luma mainpage(WebDriver driver) {
		this.driver = driver;
	}
	public void navigateTOGear() {
    driver.findElement(gearmenu).click();
	}
	}


