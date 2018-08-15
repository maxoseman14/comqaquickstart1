import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class autoComplete {

    @FindBy (xpath = "//*[@id=\"tagss\"]")
    WebElement tagbox;

    public void sendText (){
    tagbox.sendKeys("ac");
    }


    }


