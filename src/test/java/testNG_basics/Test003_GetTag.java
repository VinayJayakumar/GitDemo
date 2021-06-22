package testNG_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test003_GetTag extends AbstractChromeWebDriver {
	
  @Test
  public void getattributeslogin() {
	  Webdriver.get("http://localhost:8080/pages/login.html");
	  WebElement findElement = Webdriver.findElement(By.tagName("a"));
	  System.out.println(findElement.getText());
	  System.out.println(findElement.getAttribute("class"));
	  System.out.println(findElement.getAttribute("href"));
  }
  
  @Test
  public void getattributesPanel() {
	  Webdriver.get("http://localhost:8080/pages/login.html");
	  List<WebElement> Elements = Webdriver.findElements(By.tagName("div"));
	  for (WebElement Element:Elements) {
	  System.out.println(Element.getAttribute("class"));
	  
  }
}
}