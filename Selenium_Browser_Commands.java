

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Browser_Commands {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		System.out.println("Page Title: " + title);
		
		String url = driver.getCurrentUrl();
		System.out.println("Current URL: " + url);
		
		String source = driver.getPageSource();
		System.out.println(source);
		
		// Maximize browser
		driver.manage().window().maximize();
		
		// Minimize browser
		driver.manage().window().minimize();

		// Full screen
		driver.manage().window().fullscreen();
		
		// Get window size
		System.out.println(driver.manage().window().getSize());
		
		driver.close();
	}

}

