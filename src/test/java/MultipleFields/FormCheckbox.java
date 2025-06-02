package MultipleFields;
import java.awt.Checkbox;
import java.time.Duration;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.groovy.json.internal.Chr;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormCheckbox {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		// TODO Auto-generated method stub
		WebDriver driver  = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(6));
		List<WebElement> daysCheckbox = driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@class='form-check-input'and @type='checkbox']")));
		
		//List<WebElement> daysCheckbox = driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='form-group']")));
		
		for(int i = 0; i<daysCheckbox.size(); i++)
		{
			daysCheckbox.get(i).click();
		}
		
		Thread.sleep(10000);
		
		for(int i =0; i<daysCheckbox.size(); i++)
		{
			daysCheckbox.get(i).click();
		}
		//driver.quit();
	}

}
