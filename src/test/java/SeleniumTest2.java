import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class SeleniumTest2 {

    ChromeDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void teardown () {
        driver.quit();
    }

    @Test
    public void dressTest() {

        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")).click();
        assertEquals("Printed Dress", driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1")).getText());

    }

    @Test
    public void search(){

        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("dress");
        driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")).click();
        assertEquals("Printed Dress",driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1")).getText());
    }
}
