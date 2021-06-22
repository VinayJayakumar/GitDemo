package testNG_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test003_GetID extends AbstractChromeWebDriver{
	
  @Test
  public void getattributesName() {
	  	Webdriver.get("http://localhost:8080/login");
	  	WebElement findElement = Webdriver.findElement(By.id("name"));
	  	System.out.println(findElement.getTagName());
	  	System.out.println(findElement.getAttribute("type"));
	  	System.out.println(findElement.getAttribute("id"));
	  	System.out.println(findElement.getAttribute("name"));
	  	System.out.println(findElement.getAttribute("value"));
  }
  
  @Test
  public void getattributesPassword() {
	  	Webdriver.get("http://localhost:8080/login");
	  	WebElement findElement = Webdriver.findElement(By.id("password"));
	  	System.out.println(findElement.getTagName());
	  	System.out.println(findElement.getAttribute("type"));
	  	System.out.println(findElement.getAttribute("id"));
	  	System.out.println(findElement.getAttribute("name"));
	  	System.out.println(findElement.getAttribute("value"));
  }
  
  @Test
  public void getattributesSubmit() {
	  	Webdriver.get("http://localhost:8080/login");
	  	WebElement findElement = Webdriver.findElement(By.id("submit"));
	  	System.out.println(findElement.getTagName());
	  	System.out.println(findElement.getAttribute("type"));
	  	System.out.println(findElement.getAttribute("id"));
  }
  
}