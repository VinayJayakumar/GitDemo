package testNG_basics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test002 {
	
 private WebDriver webdriver;	

	 @BeforeTest
	 public void beforetest() {
		 WebDriverManager.chromiumdriver().setup();
		 webdriver = new ChromeDriver();
	 }
	  @Test
	  public void testtochecktitel() {
		  
		  webdriver.get("http://localhost:8080");
		  String Actual_result = webdriver.getTitle();
		  String Exp_result = "First Web Application";
		  assertEquals(Exp_result,Actual_result);
		  
	  }
	@AfterTest
	public void aftertest() {
		webdriver.quit();
	}

}	
	  
