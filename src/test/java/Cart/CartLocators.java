package Cart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartLocators {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
		
		WebElement userNamefield= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		userNamefield.sendKeys("Admin");
		
		WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		passwordField.sendKeys("admin123");
		

		WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		loginButton.click();
		
		driver.findElement(By.name("search")).sendKeys("T-shirt");
	}
}
