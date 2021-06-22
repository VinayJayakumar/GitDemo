package testNG_Forms;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import testNG_basics.AbstractChromeWebDriver;

public class MultipleSelectButton extends AbstractChromeWebDriver {
  @Test
  public void selectmethod() {
	  
	  System.out.println("First Checkin");
	  System.out.println("Second Checkin");
	  
	  Webdriver.get("http://localhost:8080/pages/forms.html");
	  sleep(2);
	  WebElement SelectElement = Webdriver.findElement(By.name("selectElement1"));
	  Select select = new Select(SelectElement);
	  System.out.println(select.isMultiple());
	  System.out.println(select.getFirstSelectedOption().getText());	  
}
}
