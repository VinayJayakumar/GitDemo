package testNG_basics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test001 {
	
	WebDriver webDriver;
	
	@BeforeTest
	public void Beforetest() {
		WebDriverManager.chromedriver().setup();
		webDriver = new ChromeDriver();
	}
	
	@Test
	public void googletest() {
		
		webDriver.get("https://www.google.com");
		String ActualResult = "Google";
		String ExpectedResult = webDriver.getTitle();
		assertEquals(ExpectedResult,ActualResult);
	}
	
	@Test
	public void googletest1() {
		
		webDriver.get("https://www.google.com");
		String ActualResult = "Google";
		String ExpectedResult = webDriver.getTitle();
		assertEquals(ExpectedResult,ActualResult);
	}

	@AfterTest
	public void Aftertest() {
		webDriver.quit();
	}
	
}
