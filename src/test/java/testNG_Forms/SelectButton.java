package testNG_Forms;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import testNG_basics.AbstractChromeWebDriver;

public class SelectButton extends AbstractChromeWebDriver {
  @Test
  public void selectmethod() {
	  
	  Webdriver.get("http://localhost:8080/pages/forms.html");
	  sleep(2);
	  WebElement SelectElement = Webdriver.findElement(By.name("multiSelectElement"));
	  Select select = new Select(SelectElement);
	  select.deselectAll();
	  sleep(5);
	  select.selectByValue("1");
	  sleep(5);
	  select.selectByVisibleText("Five");
	  sleep(5);
	  select.selectByIndex(3);
	  sleep(5);
	  }
}
