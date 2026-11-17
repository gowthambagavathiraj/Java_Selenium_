
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoqa.com/automation-practice-form?utm_source=chatgpt.com");
		driver.findElement(By.id("firstName")).sendKeys("Gowtham");
		driver.findElement(By.id("lastName")).sendKeys("Bagavathiraj");
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("gowthambagavathiraj@gmail.com");
		driver.findElement(By.xpath("//label[@for='gender-radio-1']"))
	      .click();
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("8675062180");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.id("currentAddress")).sendKeys("Kuttil Nayakkan Patti "
				+ "Kollapatti "
				+ "Oddanchatram "
				+ "624619 ");
		Thread.sleep(8000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(8000);
		System.out.println(
			    "Male selected: " +
			    driver.findElement(By.id("gender-radio-1")).isSelected()
			);

			System.out.println(
			    "Sports selected: " +
			    driver.findElement(By.id("hobbies-checkbox-1")).isSelected()
			);

			System.out.println(
			    "Reading selected: " +
			    driver.findElement(By.id("hobbies-checkbox-2")).isSelected()
			);
			
			WebElement result = driver.findElement(
				    By.id("example-modal-sizes-title-lg")
				);

				if (result.isDisplayed()) {
				    System.out.println("Form submitted successfully");
				}
		
		driver.quit();
		
	}

}
