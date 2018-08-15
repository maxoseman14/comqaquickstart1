import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class selectablePage {

    @FindBy (xpath = "//*[@id=\"selectable\"]/li[1]")
    WebElement item1;
    @FindBy (xpath = "//*[@id=\"selectable\"]/li[2]")
    WebElement item2;
    @FindBy (xpath = "//*[@id=\"selectable\"]/li[3]")
    WebElement item3;
    @FindBy (xpath = "//*[@id=\"selectable\"]/li[4]")
    WebElement item4;
    @FindBy (xpath = "//*[@id=\"selectable\"]/li[5]")
    WebElement item5;
    @FindBy (xpath = "//*[@id=\"selectable\"]/li[6]")
    WebElement item6;
    @FindBy (xpath = "//*[@id=\"selectable\"]/li[7]")
    WebElement item7;


    public void select (WebDriver driver){

        Actions action = new Actions(driver);
        action.sendKeys(Keys.CONTROL).perform();
        item1.click();
        item2.click();
        item3.click();
        item4.click();
        item5.click();
        item6.click();
        item7.click();

    }

    public void drag (WebDriver driver){

        Actions action = new Actions(driver);
        action.moveToElement(item1).clickAndHold().moveByOffset(0, 250).release().perform();

    }
}
