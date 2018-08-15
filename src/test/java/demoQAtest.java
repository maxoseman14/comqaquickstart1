import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class demoQAtest {


    static ChromeDriver driver;
    static ExtentReports reports;
    ExtentTest test;

    @BeforeClass
    public static void setUpReports (){
        reports = new ExtentReports("C:\\testReports\\report.html", false);
    }

    @AfterClass
    public static void tearDownReports (){
        reports.flush();
    }

    @Before
    public void setup() {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void teardown () {
        reports.endTest(test);
        driver.quit();
    }


    public void selectDroppable () {                                           //opens droppable page from main page
        driver.get("http://demoqa.com/");
        demoQAmain main = PageFactory.initElements(driver, demoQAmain.class);
        main.clickDroppable();

    }

    public void selectable (){                                                 //opens selectable page from main page
        driver.get("http://demoqa.com/");
        demoQAmain main = PageFactory.initElements(driver, demoQAmain.class);
        main.clickSelectable();
    }

    public void selectAccordion (){                                            //opens accordion page from main page
        driver.get("http://demoqa.com/");
        demoQAmain main = PageFactory.initElements(driver, demoQAmain.class);
        main.clickAccordion();
    }

    @Test
    public void moveBox (){
        test = reports.startTest("move box");
        selectDroppable();
        test.log(LogStatus.INFO, "Droppable menu opened");
        droppablePage droppable = PageFactory.initElements(driver, droppablePage.class);
        droppable.dragAndDrop(driver);
        if (droppable.checkDrop()) {
            test.log(LogStatus.PASS, "Box moved");
        }else{
            test.log(LogStatus.FAIL, "Box did not move");
        }
        assertTrue(droppable.checkDrop());
    }

    @Test
    public void selectItems (){
        test = reports.startTest("select item");
        selectable();
        selectablePage selectable = PageFactory.initElements(driver, selectablePage.class);
        selectable.select(driver);
        if (driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]")).getAttribute("class").contains("ui-selected")){
            test.log(LogStatus.PASS, "Item 1 selected");
        } else {
            test.log(LogStatus.FAIL, "Item 1 not selected");
        }
        assertTrue(driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]")).getAttribute("class").contains("ui-selected"));
        assertTrue(driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]")).getAttribute("class").contains("ui-selected"));
        assertTrue(driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]")).getAttribute("class").contains("ui-selected"));
        assertTrue(driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]")).getAttribute("class").contains("ui-selected"));
        assertTrue(driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[5]")).getAttribute("class").contains("ui-selected"));
        assertTrue(driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[6]")).getAttribute("class").contains("ui-selected"));
        assertTrue(driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[7]")).getAttribute("class").contains("ui-selected"));
    }

    @Test
    public void dragOver () {
        selectable();
        selectablePage selectable = PageFactory.initElements(driver, selectablePage.class);
        selectable.drag(driver);
        assertTrue(driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]")).getAttribute("class").contains("ui-selected"));
        assertTrue(driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]")).getAttribute("class").contains("ui-selected"));
        assertTrue(driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]")).getAttribute("class").contains("ui-selected"));
        assertTrue(driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]")).getAttribute("class").contains("ui-selected"));
        assertTrue(driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[5]")).getAttribute("class").contains("ui-selected"));
        assertTrue(driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[6]")).getAttribute("class").contains("ui-selected"));
        assertTrue(driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[7]")).getAttribute("class").contains("ui-selected"));
    }

    @Test
    public void accordionSections () throws InterruptedException {
        selectAccordion();
        AccordionWidget accordion = PageFactory.initElements(driver, AccordionWidget.class);
        accordion.openSection1();
        assertTrue(driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]")).getAttribute("aria-hidden").contains("false"));
        accordion.openSection2();
        assertTrue(driver.findElement(By.xpath("//*[@id=\"ui-id-7\"]")).getAttribute("aria-hidden").contains("false"));
        accordion.openSection3();
        assertTrue(driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]")).getAttribute("aria-hidden").contains("false"));
        accordion.openSection4();
        assertTrue(driver.findElement(By.xpath("//*[@id=\"ui-id-11\"]")).getAttribute("aria-hidden").contains("false"));
    }

    //@Test
    //public void autocomplete (){

    //}
}

