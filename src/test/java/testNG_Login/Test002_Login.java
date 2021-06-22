package testNG_Login;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNG_basics.AbstractChromeWebDriver;

public class Test002_Login extends AbstractChromeWebDriver {
  @Test
  public void login() {
	  
	  Webdriver.get("http://localhost:8080/pages/login.html");
	  sleep(5);
	  WebElement nameElement = Webdriver.findElement(By.name("email"));
	  nameElement.sendKeys("in28minutes");
	  sleep(3);
	  WebElement passwordElement = Webdriver.findElement(By.name("password"));
	  passwordElement.sendKeys("dummy");
	  sleep(3);
	  WebElement submitElement = Webdriver.findElement(By.tagName("a"));
	  submitElement.click();
	  sleep(3);
	  String Exp_res = "http://localhost:8080/pages/index.html";
	  String Act_res = Webdriver.getCurrentUrl();
	  assertEquals(Exp_res,Act_res);
  }
}
