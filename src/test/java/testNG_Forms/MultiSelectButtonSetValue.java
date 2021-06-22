package testNG_Forms;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import testNG_basics.AbstractChromeWebDriver;

public class MultiSelectButtonSetValue extends AbstractChromeWebDriver {
  @Test
  public void selectmethod() {
	  
	  Webdriver.get("http://localhost:8080/pages/forms.html");
	  sleep(2);
	  WebElement SelectElement = Webdriver.findElement(By.name("multiSelectElement"));
	  Select select = new Select(SelectElement);
	  System.out.println(select.isMultiple());
	  for (WebElement MultipleElement : select.getAllSelectedOptions()) {
		  System.out.println(MultipleElement.getText());
	}	  
}
}
