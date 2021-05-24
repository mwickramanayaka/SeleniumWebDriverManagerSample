package seleniumWebDriverManagerSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://ikman.lk/");
	
		String expectedTitleikman = "ikman.lk - Electronics, Cars, Property and Jobs in Sri Lanka";
		
		String actualTitle = driver.getTitle();
		
		if (actualTitle.contentEquals(expectedTitleikman)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		driver.close();
	}
}
