package WaitMethods;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpilicitWaitCommand 
{
	public static void main(String[] args) throws InterruptedException 
	{
        WebDriver driver = new ChromeDriver();
        
        WebDriverWait waitTime = new WebDriverWait(driver, Duration.ofSeconds(10));   //Decalration of class
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
       
        WebElement textUserName = waitTime.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        		//(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@placeholder='Username']"))); 
        textUserName.sendKeys("Admin");
        driver.close();
    }
}
