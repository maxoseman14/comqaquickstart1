import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class droppablePage {

    @FindBy(xpath = "//*[@id=\"draggableview\"]/p")
    WebElement box;
    @FindBy(id = "droppableview")
    WebElement target;
    @FindBy(xpath = "//*[@id=\"droppableview\"]/p")
    WebElement text;

    public void dragAndDrop (WebDriver driver){

        Actions action = new Actions(driver);
        action.dragAndDrop(box, target).perform();

    }

    public boolean checkDrop(){
        if(text.getText().equals("Dropped!")){
            return true;
        }else{
            return false;
        }
    }
}
