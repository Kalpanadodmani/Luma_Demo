package mvn_test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestClass {

	public static void main(String[] args) {			
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Malik\\Downloads\\chromedriver-win64\\chromedriver-win64//chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
        driver.get("https://google.com");
        System.out.println("Execution completed");
        driver.quit();







  

     
	}

}
