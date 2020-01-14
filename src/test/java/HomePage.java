import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {
    /**
     * 1. Open Browser
     * 2. Enter URL
     * 3. Search "Printed Chiffon Dress" using search box
     * 4. Press
     *
     *
     * */
    // Before each @Test method run setUp() method

    WebDriver driver = null;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/jahidul/IdeaProjects/batch1903webautomation/driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
    }

    @Test
    public void demTest() {

              // 1. Search for the product using id locator
              // driver.findElement(By.id("search_query_top")).sendKeys("Printed Chiffon Dress");
              // 8. Search using absolute xpath
              //driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/form/input[4]")).sendKeys("Printed Chiffon Dress");
              // 8. Search using relative xpath
              //driver.findElement(By.xpath("//form/input[4]"));
              // 8. relative xpath using attribute
              //driver.findElement(By.xpath("//input[@id='search_query_top']"));
              // 7. ccs selector
              driver.findElement(By.cssSelector("#search_query_top"));

              // 2. Click search button using name locator
              driver.findElement(By.name("submit_search")).click();

    }

    @Test
    public void goToContactUsPageTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/jahidul/IdeaProjects/batch1903webautomation/driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        // Using link text
        //driver.findElement(By.linkText("Contact us")).click();
        // Partial link text
        driver.findElement(By.partialLinkText("Contact"));

    }
    // Run cleanUp method every after @Test method
    @AfterMethod
    public void cleanUp(){
        driver.quit();
    }


}
