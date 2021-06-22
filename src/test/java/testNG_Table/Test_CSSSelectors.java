package testNG_Table;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNG_basics.AbstractChromeWebDriver;


public class Test_CSSSelectors extends AbstractChromeWebDriver {
  @Test
  public void login() {
	  
	  Webdriver.get("http://localhost:8080/pages/index.html");
	  sleep(5);
	  WebElement linkElement = Webdriver.findElement(By.linkText("Tables"));
	  sleep(2);
	  linkElement.click();
	  WebElement BrowserRow = Webdriver.findElement(By.cssSelector("#dataTables-example > tbody > tr:nth-child(1) > td:nth-child(2)"));
	  assertEquals(BrowserRow.getText(),"Firefox 1.0");
  }
}