package testNG_Link;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNG_basics.AbstractChromeWebDriver;


public class Test_ExtractAllLinks extends AbstractChromeWebDriver {
  @Test
  public void login() {
	  
	  Webdriver.get("http://localhost:8080/pages/index.html");
	  sleep(5);
	  
	  List<WebElement> LinkElements = Webdriver.findElements(By.tagName("a"));
	  
	  for ( WebElement LinkElement:LinkElements) {
		  System.out.println(LinkElement.getText());
	  }
	  
  }
}