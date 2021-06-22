package testNG_Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNG_basics.AbstractChromeWebDriver;

public class RowsAndColumnswithoutID extends AbstractChromeWebDriver {
 
  @Test
  public void Extracttablesize() {
	  
	  Webdriver.get("http://localhost:8080/pages/index.html");
	  sleep(5);
	  WebElement findElement = Webdriver.findElement(By.linkText("Tables"));
	  findElement.click();
	  List<WebElement> BrowserColMaster = Webdriver.findElements(By.xpath("//*[@id=\"dataTables-example-5\"]/table/thead/tr/th"));
	  System.out.println("No of cloumns in the table are " + BrowserColMaster.size());
	  List<WebElement> BrowserRowMaster = Webdriver.findElements(By.xpath("//*[@id=\"dataTables-example-5\"]/table/tbody/tr/td[1]"));
	  System.out.println("No of rows in the table are " + BrowserRowMaster.size());
  }
}
