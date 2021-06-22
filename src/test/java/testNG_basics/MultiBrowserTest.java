package testNG_basics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTest {
  
	@Parameters("browser")
	@Test
  public void testmultipleBrowser(String browser){
	  
	  System.out.println(browser);
  }
}
