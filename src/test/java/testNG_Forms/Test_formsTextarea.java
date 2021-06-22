package testNG_Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNG_basics.AbstractChromeWebDriver;

public class Test_formsTextarea extends AbstractChromeWebDriver {
  @Test
  public void textArea() {
	  
	  Webdriver.get("http://localhost:8080/pages/index.html");
	  sleep(5);
	  WebElement linkElement = Webdriver.findElement(By.linkText("Forms"));
	  sleep(2);
	  linkElement.click();
	  WebElement TextAreaElement = Webdriver.findElement(By.id("textAreaElement"));
	  TextAreaElement.sendKeys("My name is Vinay Jayakumar");
	  TextAreaElement.sendKeys("\n");
	  TextAreaElement.sendKeys("I am from Mysore");
	  sleep(10);
	    
  }
}
