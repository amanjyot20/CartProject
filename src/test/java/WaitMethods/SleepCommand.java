package WaitMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepCommand {

	public static void main(String[] args) //throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");  
		//Thread.sleep(3000); //pause the execution
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		// driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
			
		
	}

}
