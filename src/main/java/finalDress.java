import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class finalDress {


    @FindBy (xpath = "//*[@id=\"center_column\"]/div/div/div[3]/h1")
    WebElement text;

    public String checkText (){
    return text.getText();
    }
}
