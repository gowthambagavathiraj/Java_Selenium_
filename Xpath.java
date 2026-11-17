
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		// Relative XPath
		driver.findElement(By.xpath("//input[@id='user-name']"))
		      .sendKeys("standard_user");

		driver.findElement(By.xpath("//input[@id='password']"))
		      .sendKeys("secret_sauce");

		driver.findElement(By.xpath("//input[@id='login-button']"))
		      .click();
		// Using multiple attributes
		driver.findElement(By.xpath("//input[@id='email' and @type='text']"));
		
		// Exact text
		driver.findElement(By.xpath("//button[text()='Login']")).click();

		// Exact link text
		driver.findElement(By.xpath("//a[text()='Register Now']")).click();
		
		//Xpath using contains
		driver.findElement(
			    By.xpath("//input[contains(@id,'login')]")
			);
		driver.findElement(
			    By.xpath("//button[contains(text(),'Login')]")
			).click();
		
		//Xpath using Startswith
		driver.findElement(
			    By.xpath("//input[starts-with(@id,'user')]")
			);
		
		// AND operator
		driver.findElement(
		    By.xpath("//input[@id='username' and @type='text']")
		);

		// OR operator
		driver.findElement(
		    By.xpath("//input[@id='username' or @name='user']")
		);
		
		// First element
		driver.findElement(
		    By.xpath("(//input[@name='user'])[1]")
		);

		// Second element
		driver.findElement(
		    By.xpath("(//input[@name='user'])[2]")
		);

	}

}
