package testNG_Link;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNG_basics.AbstractChromeWebDriver;


public class Test_Class2 extends AbstractChromeWebDriver {
  @Test
  public void login() {
	  
	  Webdriver.get("http://localhost:8080/login");
	  sleep(5);
	  WebElement classElement = Webdriver.findElement(By.className("navbar-brand"));
	  sleep(2);
	  System.out.println(classElement.getText());
	  assertEquals("in28Minutes",classElement.getText());
  }
}