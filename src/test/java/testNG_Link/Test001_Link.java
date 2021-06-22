package testNG_Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNG_basics.AbstractChromeWebDriver;


public class Test001_Link extends AbstractChromeWebDriver {
  @Test
  public void login() {
	  
	  Webdriver.get("http://localhost:8080");
	  sleep(5);
	  WebElement linkElement = Webdriver.findElement(By.linkText("in28Minutes"));
	  System.out.println(linkElement.getAttribute("href"));
	  linkElement.click();
	  System.out.println(Webdriver.getCurrentUrl());
  }
}