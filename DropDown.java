import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		WebElement country =
			    driver.findElement(By.id("country"));
		Select dropdown = new Select(country);
		
		//visible Text
		dropdown.selectByVisibleText("India");
	
		
		//value
		//<option value="usa">USA</option>
		dropdown.selectByValue("usa");
		
		dropdown.selectByIndex(2);
		
		// Get all options
		List<WebElement> options = dropdown.getOptions();

		for (WebElement option : options) {
		    System.out.println(option.getText());
		}

		// Get selected option
		System.out.println(
		    dropdown.getFirstSelectedOption().getText()
		);
		
		
		
		
		//Dynamic DropDown
		// Click dropdown
		driver.findElement(By.id("country")).click();

		// Select India
		driver.findElement(
		    By.xpath("//li[text()='India']")
		).click();
	}

}
