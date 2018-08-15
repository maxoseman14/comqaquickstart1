import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class dressPage {

    @FindBy (xpath = "//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img")
    WebElement dressIcon;

    public void iconPress (){
        dressIcon.click();
    }
}
