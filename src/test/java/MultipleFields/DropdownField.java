package MultipleFields;

import java.sql.DriverPropertyInfo;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement dropDownElement = driver.findElement(By.xpath("//select[@class='form-control'and @id='country']"));
		Select dropCountry = new Select(dropDownElement);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//dropCountry.selectByValue("India");
		//dropCountry.deselectByIndex(3);
		dropCountry.selectByVisibleText("Japan");
		
		List <WebElement> options= dropCountry.getOptions();
		for(WebElement opr:options)
		{
			System.out.println(opr.getText());
		}
		//System.out.println("No. of options :"+ options.size());
	}

}
