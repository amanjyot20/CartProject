package Cart;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	
	public static void main(String[] args) throws MalformedURLException
	{
		WebDriver driver = new ChromeDriver();
	//  driver.get("https://opensource-demo.orangehrmlive.com/");  // accepts URL in String format only 
	//	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");  // accepts URL in String format as well as URL object format
	//  URL orange_url = new URL("https://opensource-demo.orangehrmlive.com/");
	//	driver.navigate().to(orange_url);
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
	}

}
