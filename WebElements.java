package LaunchProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("http://www.saucedemo.com");
		WebElement username = driver.findElement(By.id("username"));
		
		WebElement loginButton = driver.findElement(By.id("login"));
		
		//clicking button
		loginButton.click();
		
		//Sending text
		username.sendKeys("admin");
		
		//Keyboard Keys
		username.sendKeys(Keys.TAB);
		
		//cleared and again send text
		username.clear();
		username.sendKeys("testuser");
		
		//Get the Actual text
		WebElement heading = driver.findElement(By.tagName("h1"));
		String text = heading.getText();
		System.out.println("Heading: " + text);
		
		//printing the actual value
		//<input id="username" type="text" value="admin" placeholder="Enter username">
		System.out.println(username.getAttribute("id"));
		System.out.println(username.getAttribute("type"));
		System.out.println(username.getAttribute("placeholder"));
		System.out.println(username.getAttribute("value"));
		
		
		//Checking the buttons
		System.out.println(loginButton.isDisplayed());
		System.out.println(loginButton.isEnabled());
		System.out.println(loginButton.getTagName());
		
		
		//Handling Buttons
		//<button id="submit">Submit</button>
		WebElement submitButton = driver.findElement(By.id("submit"));
		if (submitButton.isDisplayed() && submitButton.isEnabled()) {
		    submitButton.click();
		}
		
		
		//Handling Check Box
//		<input type="checkbox" id="java">
//		<label for="java">Java</label>
//		<input type="checkbox" id="python">
//		<label for="python">Python</label>
		
		WebElement javaCheckbox = driver.findElement(By.id("java"));

		if (!javaCheckbox.isSelected()) {
		    javaCheckbox.click();
		}
		
	}

}
