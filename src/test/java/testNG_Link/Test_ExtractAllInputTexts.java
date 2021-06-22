package testNG_Link;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNG_basics.AbstractChromeWebDriver;


public class Test_ExtractAllInputTexts extends AbstractChromeWebDriver {
  @Test
  public void login() {
	  
	  Webdriver.get("http://localhost:8080/pages/index.html");
	  sleep(5);
	  WebElement linkElement = Webdriver.findElement(By.linkText("Tables"));
	  sleep(2);
	  linkElement.click();
	  WebElement inputElement = Webdriver.findElement(By.xpath("//*[@id='dataTables-example_filter']/label/input"));
	  inputElement.sendKeys("1.7");
	  sleep(20);
	  
	  /****** work Around 
	  List<WebElement> LinkElements = Webdriver.findElements(By.tagName("input"));
	  
	  for ( WebElement LinkElement:LinkElements) {
		  String string1 = LinkElement.getAttribute("type");
		  String string2 = "search";
		  System.out.println(string1);
		  if (string1.equals(string2)){
			  LinkElement.sendKeys("1.7");
			  sleep(20);
		  }
	  } *////////////////////
	  
  }
}