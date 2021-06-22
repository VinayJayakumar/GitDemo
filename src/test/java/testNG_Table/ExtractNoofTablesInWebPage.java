package testNG_Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNG_basics.AbstractChromeWebDriver;

public class ExtractNoofTablesInWebPage extends AbstractChromeWebDriver {
 
  @Test
  public void Extracttablesize() {
	  
	  Webdriver.get("http://localhost:8080/pages/index.html");
	  sleep(5);
	  WebElement findElement = Webdriver.findElement(By.linkText("Tables"));
	  findElement.click();
	  sleep(2);
	  List<WebElement> TableElements = Webdriver.findElements(By.tagName("table"));
	  for ( WebElement TableElement:TableElements) {
		  //System.out.println(TableElement.getText());
		  System.out.println(TableElement.getAttribute("id") + " / " + TableElement.getAttribute("class"));
	  }
  }
}
