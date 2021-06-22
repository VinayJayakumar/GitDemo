package testNG_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test003_GetName extends AbstractChromeWebDriver {
	
  @Test
  public void getattributesName() {
	  	Webdriver.get("http://localhost:8080/pages/login.html");
	  	WebElement findElement = Webdriver.findElement(By.name("email"));
	  	System.out.println(findElement.getTagName());
	  	System.out.println(findElement.getAttribute("type"));
	  	System.out.println(findElement.getAttribute("name"));
	  	System.out.println(findElement.getAttribute("placeholder"));
	  	System.out.println(findElement.getAttribute("class"));
	  	System.out.println(findElement.getAttribute("value"));
  }
  
  @Test
  public void getattributesPassword() {
	  	Webdriver.get("http://localhost:8080/pages/login.html");
	  	WebElement findElement = Webdriver.findElement(By.name("password"));
	  	System.out.println(findElement.getTagName());
	  	System.out.println(findElement.getAttribute("type"));
	  	System.out.println(findElement.getAttribute("name"));
	  	System.out.println(findElement.getAttribute("placeholder"));
	  	System.out.println(findElement.getAttribute("class"));
	  	System.out.println(findElement.getAttribute("value"));
  }
  
  @Test
  public void getattributescheckbox() {
	  	Webdriver.get("http://localhost:8080/pages/login.html");
	  	WebElement findElement = Webdriver.findElement(By.name("remember"));
	  	System.out.println(findElement.getAttribute("placeholder"));
	  	System.out.println(findElement.getAttribute("class"));
	  	System.out.println(findElement.getAttribute("value"));
  }
  
}