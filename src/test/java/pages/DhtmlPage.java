package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DhtmlPage {

    public DhtmlPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='countries']//div")
    public List<WebElement> ulkeler;

    @FindBy(xpath = "//*[@id='box1']")
    public WebElement Oslo;

    @FindBy(xpath = "//*[@id='box2']")
    public WebElement Stockholm;

    @FindBy(xpath = "//*[@id='box3']")
    public WebElement Washington;

    @FindBy(xpath = "//*[@id='box4']")
    public WebElement Copenhagen;

    @FindBy(xpath = "//*[@id='box5']")
    public WebElement Seoul;

    @FindBy(xpath = "//*[@id='box6']")
    public WebElement Rome;

    @FindBy(xpath = "//*[@id='box7']")
    public WebElement Madrid;

    @FindBy (xpath = "//*[@id='box101']")
    public WebElement Norway;
    @FindBy (xpath = "//*[@id='box102']")
    public WebElement Sweden;
    @FindBy (xpath = "//*[@id='box103']")
    public WebElement abd;
    @FindBy (xpath = "//*[@id='box104']")
    public WebElement Denmark;
    @FindBy (xpath = "//*[@id='box105']")
    public WebElement Korea;
    @FindBy (xpath = "//*[@id='box106']")
    public WebElement Italy;
    @FindBy (xpath = "//*[@id='box107']")
    public WebElement Spain;

}
