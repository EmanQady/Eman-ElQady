package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver BaseTestDriver;

	@BeforeClass
	public void open_browser() {
		WebDriverManager.chromedriver().setup();
		BaseTestDriver = new ChromeDriver();
		BaseTestDriver.manage().window().maximize();
		BaseTestDriver.get("https://www.google.com");
		BaseTestDriver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a")).click();

	}

	@AfterClass
	public void close_browser() {
		// BaseTestDriver.close();
	}
}
