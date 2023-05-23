package actions;

import org.openqa.selenium.support.PageFactory;

import locators.LoginPageLocators;
import utils.HelperClass;

public class LoginPageActions {
	LoginPageLocators loginPageLocators = null; 
    
    public LoginPageActions() { 
        this.loginPageLocators = new LoginPageLocators();
 
        PageFactory.initElements(HelperClass.getDriver(),loginPageLocators);
    }
     
    public void login(String strUserName, String strPassword) {
          
        // Fill user name
        loginPageLocators.userName.sendKeys(strUserName);
  
        // Fill password
        loginPageLocators.password.sendKeys(strPassword);
  
        // Click Login button
        loginPageLocators.login.click();
  
    }
  //Get the title of Login Page")
    public String getLoginTitle() {
        return loginPageLocators.titleText.getText();
    }
       
    // Get the error message of Login Page
    public String getErrorMessage() {
        return loginPageLocators.errorMessage.getText();
    }
}
