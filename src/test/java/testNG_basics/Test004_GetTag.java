package testNG_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test004_GetTag extends AbstractChromeWebDriver {
  @Test
  public void getelementsusingtagname() {
	  Webdriver.get("http://localhost:8080/login");
	  List<WebElement> Elements = Webdriver.findElements(By.tagName("input"));
	  for ( WebElement Element:Elements) {
		  System.out.println(Element.getAttribute("type"));
		  System.out.println(Element.getAttribute("id"));
		  System.out.println(Element.getAttribute("name"));
		  sleep(3);
	  }
  }
}

