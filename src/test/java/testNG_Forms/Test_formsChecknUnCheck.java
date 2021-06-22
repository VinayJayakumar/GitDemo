package testNG_Forms;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNG_basics.AbstractChromeWebDriver;

public class Test_formsChecknUnCheck extends AbstractChromeWebDriver {
  @Test
  public void textArea() {
	  
	  Webdriver.get("http://localhost:8080/pages/index.html");
	  sleep(5);
	  WebElement linkElement = Webdriver.findElement(By.linkText("Forms"));
	  sleep(2);
	  linkElement.click();
	  WebElement CheckboxElement1 = Webdriver.findElement(By.id("checkboxElement1"));
	  System.out.println(CheckboxElement1.isSelected());
	  assertFalse(CheckboxElement1.isSelected());
	  WebElement CheckboxElement2 = Webdriver.findElement(By.id("checkboxElement2"));
	  CheckboxElement2.click();
	  sleep(4);
	  WebElement CheckboxElement3 = Webdriver.findElement(By.id("checkboxElement3"));
	  CheckboxElement3.click();
	  
	  WebElement CheckboxElement4 = Webdriver.findElement(By.id("inlineCheckboxElement1"));
	  CheckboxElement4.click();
	  System.out.println(CheckboxElement4.isSelected());
	  assertTrue(CheckboxElement4.isSelected());
	  sleep(4);  
  }
}
