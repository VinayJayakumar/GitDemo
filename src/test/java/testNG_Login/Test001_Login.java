package testNG_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNG_basics.AbstractChromeWebDriver;

public class Test001_Login extends AbstractChromeWebDriver {
  @Test
  public void login() {
	  
	  Webdriver.get("http://localhost:8080");
	  sleep(5);
	  WebElement nameElement = Webdriver.findElement(By.id("name"));
	  nameElement.sendKeys("in28minutes");
	  sleep(3);
	  WebElement passwordElement = Webdriver.findElement(By.id("password"));
	  passwordElement.sendKeys("dummy");
	  sleep(3);
	  WebElement submitElement = Webdriver.findElement(By.id("submit"));
	  submitElement.click();
	  sleep(3);
	  
	  WebElement WelcomeMsgElement = Webdriver.findElement(By.id("welcome-message"));
	  System.out.println(WelcomeMsgElement.getText());
  }
}
