package testNG_Forms;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNG_basics.AbstractChromeWebDriver;

public class RadioButtonsEnableValue extends AbstractChromeWebDriver {
  @Test
  public void readradiobuttonfromautilitymethod() {
	  
	  Webdriver.get("http://localhost:8080/pages/forms.html");
	  sleep(2);
	  setRadioButton("optionsRadios", "option2");
	  setRadioButton("optionsRadiosInline", "inline-option1");
  }

  private void setRadioButton(String radioname, String optionValue) {
	List<WebElement> options = Webdriver.findElements(By.name(radioname));
	  for ( WebElement option:options) {
		if (option.getAttribute("value").equals(optionValue)) {
			sleep(5);
			option.click();
		}
	  }
}
}
