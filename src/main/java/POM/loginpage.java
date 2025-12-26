package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class loginpage {
	//declaration
		@FindBy(name="user_name")
		private WebElement usernameEdit;
		
		@FindBy(name="user_password")
		private WebElement passwordEdit;
		
		@FindBy(id="submitButton")
		private WebElement loginbtn;
		
		
		//initialization
		public loginpage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		//utilization


		public WebElement getUsernameEdit() {
			return usernameEdit;
		}


		public WebElement getPasswordEdit() {
			return passwordEdit;
		}


		public WebElement getLoginbtn() {
			return loginbtn;
		}

		//business logic
		public void login(String UserName,String PassWord) {
			usernameEdit.sendKeys(UserName);
			passwordEdit.sendKeys(PassWord);
			loginbtn.click();
			
		}

}
