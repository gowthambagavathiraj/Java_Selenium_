package Java_Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver-win32/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();

		//New Version 
		WebDriver driver=new ChromeDriver();

		//Edge Driver
		WebDriver driver=new EdgeDriver();
		//FireFox Driver
		WebDriver driver=new FirefoxDriver();
	}
}
