
--Example HTML Code---
 input type="text" id="username" name="user"
       class="form-control">
 <input type="password" id="password"
       name="pass">
<button id="login">Login</button>
<a href="https://google.com">Google</a>



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//Finding element using ID
	driver.findElement(By.id("username")).sendKeys("Gowtham");

	//Finding element using name
	driver.findElement(By.name("email")).sendKeys("test@gmail.com");

	//Finding element using className
	driver.findElement(By.className("username")).sendKeys("Java");

	//Finding element using tag name
	driver.findElement(By.tagName("input"));

	//Finding element using linktext Locator
		<a href="https://google.com">Google</a>
	driver.findElement(By.linkText("Google")).click();


	//Finding element using Partial linktext Locator
		<a href="https://google.com">Visit Google Website</a>
    driver.findElement(By.partialLinkText("Google")).click();
  

	//Finding element using Css Locators

	driver.findElement(By.cssSelector("#username")).sendKeys("Gowtham");
	driver.findElement(By.cssSelector(".form-control"));
	driver.findElement(By.cssSelector("input[name='email']"));
  
  
  
  
  
  }

}
