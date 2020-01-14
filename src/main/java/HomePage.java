import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HomePage {
    /**
     * 1. Open Browser
     * 2. Enter URL
     * 3. Search "Printed Chiffon Dress" using search box
     * 4. Press
     *
     *
     * */
    public void searchTest() {
              System.setProperty("webdriver.chrome.driver", "/Users/jahidul/IdeaProjects/batch1903webautomation/driver/chromedriver");
              WebDriver driver = new ChromeDriver();
              driver.get("http://automationpractice.com/");
              // Search for the product using search box
              driver.findElement(By.id("search_query_top")).sendKeys("Printed Chiffon Dress");
              // Click search button
              driver.findElement(By.name("submit_search")).click();
              driver.quit();
    }

}
