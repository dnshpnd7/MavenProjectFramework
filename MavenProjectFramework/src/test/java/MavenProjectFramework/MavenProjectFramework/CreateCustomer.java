package MavenProjectFramework.MavenProjectFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateCustomer {
	
	
	
	@Test
	public void createCustomer()
	{
		/* System.setProperty("webdriver.gecko.driver", "C:\\Server\\geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.amazon.in/");*/
	
				System.out.println("execute Create customer");
	}
	@Test
	public void modifyCustomer()
	{
		System.out.println("execute Modify customer");
	}
	@Test
	public void deleteCustomer()
	{
		System.out.println("execute delete customer");
	

	}

}
