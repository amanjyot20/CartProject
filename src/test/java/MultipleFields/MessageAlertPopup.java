package MultipleFields;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MessageAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		Thread.sleep(5000);
		
		//driver.switchTo().alert().accept();		// to click okay button
		driver.switchTo().alert().dismiss();		// to click on cancel button
	}

}
