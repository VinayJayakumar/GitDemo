package testNG_Table;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNG_basics.AbstractChromeWebDriver;


public class Test_Xpath2 extends AbstractChromeWebDriver {
  @Test
  public void loginStatic() {
	  
	  Webdriver.get("http://localhost:8080/pages/index.html");
	  sleep(5);
	  WebElement linkElement = Webdriver.findElement(By.linkText("Tables"));
	  sleep(2);
	  linkElement.click();
	  sleep(2);
	  WebElement BrowserRow1 = Webdriver.findElement(By.xpath("//*[@id=\'dataTables-example\']/tbody/tr[1]/td[2]"));
	  assertEquals(BrowserRow1.getText(),"Firefox 1.0");
	  WebElement BrowserRow2 = Webdriver.findElement(By.xpath("//*[@id=\'dataTables-example\']/tbody/tr[2]/td[2]"));
	  assertEquals(BrowserRow2.getText(),"Firefox 1.5");
	  WebElement BrowserRow3 = Webdriver.findElement(By.xpath("//*[@id=\'dataTables-example\']/tbody/tr[3]/td[2]"));
	  assertEquals(BrowserRow3.getText(),"Firefox 2.0");
	  WebElement BrowserRow4 = Webdriver.findElement(By.xpath("//*[@id=\'dataTables-example\']/tbody/tr[4]/td[2]"));
	  assertEquals(BrowserRow4.getText(),"Firefox 3.0");
  } 
  
  @Test
  public void loginDynamic() {
	  
	  Webdriver.get("http://localhost:8080/pages/index.html");
	  sleep(5);
	  WebElement linkElement = Webdriver.findElement(By.linkText("Tables"));
	  sleep(2);
	  linkElement.click();
	  sleep(2);
	  WebElement BrowserRowMaster = Webdriver.findElement(By.xpath("//*[@id=\'dataTables-example\']/tbody"));
	  WebElement BrowserRow1 = BrowserRowMaster.findElement(By.xpath("tr[1]/td[2]"));
	  assertEquals(BrowserRow1.getText(),"Firefox 1.0");
	  WebElement BrowserRow2 = BrowserRowMaster.findElement(By.xpath("tr[2]/td[2]"));
	  assertEquals(BrowserRow2.getText(),"Firefox 1.5");
	  WebElement BrowserRow3 = BrowserRowMaster.findElement(By.xpath("tr[3]/td[2]"));
	  assertEquals(BrowserRow3.getText(),"Firefox 2.0");
	  WebElement BrowserRow4 = BrowserRowMaster.findElement(By.xpath("tr[4]/td[2]"));
	  assertEquals(BrowserRow4.getText(),"Firefox 3.0");
  }
}