import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccordionWidget {

    @FindBy (xpath = "//*[@id=\"ui-id-4\"]")
    WebElement section1;
    @FindBy (xpath = "//*[@id=\"ui-id-6\"]")
    WebElement section2;
    @FindBy (xpath = "//*[@id=\"ui-id-8\"]")
    WebElement section3;
    @FindBy (xpath = "//*[@id=\"ui-id-10\"]")
    WebElement section4;

    public void openSection1(){
        section1.click();
    }

    public void openSection2 (){
        section2.click();
    }

    public void openSection3 (){
        section3.click();
    }

    public void openSection4(){
        section4.click();
    }

}
