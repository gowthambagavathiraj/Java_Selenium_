import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Navigation {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

     // Open Google
        driver.get("https://www.google.com");
        Thread.sleep(2000);

        // Navigate to Amazon
        driver.navigate().to("https://www.amazon.in");
        Thread.sleep(2000);

        // Go back to Google
        driver.navigate().back();
        Thread.sleep(2000);

        // Go forward to Amazon
        driver.navigate().forward();
        Thread.sleep(2000);

        // Refresh current page
        driver.navigate().refresh();
        Thread.sleep(2000);

        // Close browser
        driver.quit();
    }
}
