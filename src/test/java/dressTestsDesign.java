import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertEquals;

public class dressTestsDesign {

    static ChromeDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void teardown () {
    driver.quit();
    }

    static public void search(){
    driver.get("http://automationpractice.com/index.php");
    dressMain main = PageFactory.initElements(driver, dressMain.class);
    main.search("dress");
    }

    static public void click(){
    search();
    dressPage click = PageFactory.initElements(driver, dressPage.class);
    click.iconPress();
    }

    @Test
    public void check(){
    click();
    finalDress text = PageFactory.initElements(driver, finalDress.class);
    assertEquals("Printed Summer Dress", text.checkText());
    }


}
