package testNG_Link;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNG_basics.AbstractChromeWebDriver;


public class Test_XpathDom extends AbstractChromeWebDriver {
  @Test
  public void loginStatic() {
	  
	  Webdriver.get("http://localhost:8080/pages/index.html");
	  sleep(5);
	  WebElement linkElement = Webdriver.findElement(By.linkText("Tables"));
	  sleep(2);
	  linkElement.click();
	  sleep(2);
	  //List<WebElement> ClassElements = Webdriver.findElements(By.className("panel-heading"));
	  List<WebElement> ClassElements = Webdriver.findElements(By.className("row"));
	  for (WebElement ClassElement:ClassElements) {
	  System.out.println(ClassElement.getText());
  } 
  }
  
 }