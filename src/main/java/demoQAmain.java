import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class demoQAmain {

    @FindBy (xpath = "//*[@id=\"menu-item-141\"]")
    WebElement droppable;

    @FindBy (xpath = "//*[@id=\"menu-item-142\"]")
    WebElement selectable;

    @FindBy (xpath = "//*[@id=\"menu-item-144\"]/a")
    WebElement accordion;

    @FindBy (xpath = "//*[@id=\"menu-item-145\"]/a")
    WebElement autocomplete;

    @FindBy (xpath = "//*[@id=\"menu-item-146\"]/a")
    WebElement datepicker;

    @FindBy (xpath = "//*[@id=\"menu-item-147\"]/a")
    WebElement menu;

    @FindBy (xpath = "//*[@id=\"menu-item-97\"]/a")
    WebElement slider;

    @FindBy (xpath = "//*[@id=\"menu-item-98\"]/a")
    WebElement tabs;

    @FindBy (xpath = "//*[@id=\"menu-item-99\"]/a")
    WebElement tooltip;



    public void clickDroppable (){
        droppable.click();
    }

    public void clickSelectable(){
        selectable.click();
    }

    public void clickAccordion () {
        accordion.click();
    }

    public void clickAutoComplete (){
        autocomplete.click();
    }


    }

