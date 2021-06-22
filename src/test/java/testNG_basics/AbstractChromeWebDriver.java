package testNG_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class AbstractChromeWebDriver {

	protected WebDriver Webdriver;

	public AbstractChromeWebDriver() {
		super();
	}
	@BeforeTest
	public void beforegetattributesofname() {
		  WebDriverManager.chromiumdriver().setup();
		  Webdriver = new ChromeDriver();
	  }
	@AfterTest
	public void Aftergetattributes() {
		  Webdriver.quit();
	  }
	public void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}