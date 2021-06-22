package testNG_Table;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNG_basics.AbstractChromeWebDriver;


public class Test_Xpath1 extends AbstractChromeWebDriver {
  @Test
  public void login() {
	  
	  Webdriver.get("http://localhost:8080/pages/index.html");
	  sleep(5);
	  WebElement linkElement = Webdriver.findElement(By.linkText("Tables"));
	  sleep(2);
	  linkElement.click();
	  sleep(2);
	  WebElement BrowserRow = Webdriver.findElement(By.xpath("//*[@id='dataTables-example']/thead/tr/th[2]"));
	  BrowserRow.click();
	  sleep(2);
	  WebElement BrowserRowafterclick = Webdriver.findElement(By.xpath("//*[@id=\'dataTables-example\']/tbody/tr[1]/td[2]"));
	  assertEquals(BrowserRowafterclick.getText(),"All others");
	  sleep(2);
  }
}