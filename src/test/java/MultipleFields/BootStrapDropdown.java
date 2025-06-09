package MultipleFields;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BootStrapDropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		//Select dropCountry = new Select(dropDownElement);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@value='CSS']")).click();     // SELECT ONE OPTION
		//To select all the options in dropdown
		List <WebElement> options= driver.findElements(By.xpath("//ul[@class='checkbox'//label]"));
		System.out.println(options.size());	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		for(WebElement opr:options)
		{
			//System.out.println(opr.getText());
			opr.click();
		}
		//To select mul
	}

}
