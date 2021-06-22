package testNG_Forms;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNG_basics.AbstractChromeWebDriver;

public class ChecknUnCheck extends AbstractChromeWebDriver {
  @Test
  public void Checkbox() {
	  
	  System.out.println("Second Checkin");
	  
	  Webdriver.get("http://localhost:8080/pages/forms.html");
	  checkAcheckbox("inlineCheckboxElement1");
	  checkAcheckbox("inlineCheckboxElement2");
	  checkAcheckbox("inlineCheckboxElement3");
	  UncheckAcheckbox("inlineCheckboxElement1");
	  UncheckAcheckbox("inlineCheckboxElement2");
	  UncheckAcheckbox("inlineCheckboxElement3");
  }

  private void checkAcheckbox(String checkboxname) {
	  WebElement CheckboxElement = Webdriver.findElement(By.id(checkboxname));
	  boolean currentvalue = CheckboxElement.isSelected();
	  sleep(2);
	  if (currentvalue==false) {
		  CheckboxElement.click();
	  }
  }
	  
  private void UncheckAcheckbox(String checkboxname) {
		  WebElement UnCheckboxElement = Webdriver.findElement(By.id(checkboxname));
		  boolean currentvalue = UnCheckboxElement.isSelected();
		  sleep(2);
		  if (currentvalue==true) {
			  UnCheckboxElement.click();
		  }
}
}
