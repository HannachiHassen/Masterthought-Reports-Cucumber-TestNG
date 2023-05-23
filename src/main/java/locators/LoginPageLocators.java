package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {

	@FindBy(name = "username")
    public WebElement userName;
  
    @FindBy(name = "password")
    public WebElement password;
  
    @FindBy(id = "logInPanelHeading")
    public WebElement titleText;
  
    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public WebElement login;
  
    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
    public  WebElement errorMessage;
         
    @FindBy(xpath = "//*[@href='https://www.facebook.com/OrangeHRM/mycompany']") //Invalid Xpath
    public  WebElement faceBookIcon;  
     
    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span")
    public WebElement missingUsernameErrorMessage;

}
