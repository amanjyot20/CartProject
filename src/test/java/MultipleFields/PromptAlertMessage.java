package MultipleFields;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertMessage {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
		Thread.sleep(5000);
		
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Aman Attri");
		promptAlert.accept();		
	}
}
