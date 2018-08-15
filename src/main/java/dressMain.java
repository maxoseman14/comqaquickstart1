import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class dressMain {

    @FindBy (id = "search_query_top")
    WebElement searchbox;

    @FindBy (xpath = "//*[@id=\"searchbox\"]/button")
    WebElement searchBtn;

    public void search (String text){
        searchbox.sendKeys(text);
        searchBtn.click();
    }


}
