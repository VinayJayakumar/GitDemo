package testNG_Forms;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNG_basics.AbstractChromeWebDriver;

public class RadioButtons extends AbstractChromeWebDriver {
  @Test
  public void readradiobuttonfromautilitymethod() {
	  
	  Webdriver.get("http://localhost:8080/pages/forms.html");
	  sleep(2);
	  System.out.println(extractRadioButtonValue("optionsRadiosInline"));
  }

  private String extractRadioButtonValue(String name) {
	  
	  List<WebElement> options = Webdriver.findElements(By.name(name));
	  for ( WebElement option:options) {
		  if (option.isSelected()) {
			  return option.getAttribute("value");
		  }
	  }
	  return null;
}
}
