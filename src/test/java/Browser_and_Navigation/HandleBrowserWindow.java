package Browser_and_Navigation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowId = driver.getWindowHandles();
		
		//Approach 1
		List <String> windowList= new ArrayList(windowId);
		String parentId = windowList.get(0);
		String childId = windowList.get(1);
		driver.switchTo().window(childId);    //Switch to the child window
		System.out.println(driver.getTitle());
				
		
	}

}
