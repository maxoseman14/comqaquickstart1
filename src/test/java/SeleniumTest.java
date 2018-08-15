import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class SeleniumTest {

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

  @Ignore
  @Test
  public void test1 (){
    driver.manage().window().maximize();
    driver.get("http://thedemosite.co.uk/");
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  @Ignore
  @Test
    public void testLogin(){
      driver.get("http://thedemosite.co.uk/index.php");
      driver.findElement(By.linkText("3. Add a User")).click();
      driver.findElement(By.name("username")).click();
      driver.findElement(By.name("username")).clear();
      driver.findElement(By.name("username")).sendKeys("bob123");
      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='download the free zip here'])[1]/preceding::p[1]")).click();
      driver.findElement(By.name("password")).click();
      driver.findElement(By.name("password")).clear();
      driver.findElement(By.name("password")).sendKeys("123456");
      driver.findElement(By.name("FormsButton2")).click();
      driver.findElement(By.linkText("4. Login")).click();
      driver.findElement(By.name("username")).click();
      driver.findElement(By.name("username")).clear();
      driver.findElement(By.name("username")).sendKeys("bob123");
      driver.findElement(By.name("password")).click();
      driver.findElement(By.name("password")).clear();
      driver.findElement(By.name("password")).sendKeys("123456");
      driver.findElement(By.name("FormsButton2")).click();
      assertEquals("**Successful Login**", driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText());
      //html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b

    }


  }

