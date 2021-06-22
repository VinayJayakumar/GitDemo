package testNG_Link;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNG_basics.AbstractChromeWebDriver;


public class Test_ClassDemo1 extends AbstractChromeWebDriver {
  @Test
  public void login() {
	  
	  Webdriver.get("http://localhost:8080/pages/index.html");
	  sleep(5);
	  List<WebElement> classElements = Webdriver.findElements(By.className("huge"));
	  sleep(2);
	  for ( WebElement classElement:classElements ) {
		  System.out.println(classElement.getText());
	  }
  }
}