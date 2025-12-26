package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.WebDriverUtils;


public class homepage {
	//declaration
		@FindBy(linkText = "Organizations")
		private WebElement orglink;
		
		@FindBy(linkText = "Contacts")
		private WebElement contlink;
		
		
		@FindBy(linkText = "Opportunities")
		private WebElement opplink;
		
		@FindBy(linkText = "Documents")
		private WebElement doclink;
		
		@FindBy(linkText = "Email")
		private WebElement emaillink;
		
		@FindBy(linkText = "Trouble Tickets")
		private WebElement ticketlink;
		
		@FindBy(linkText = "Leads")
		private WebElement leadlink;
		
		@FindBy(linkText = "Calendar")
		private WebElement calendarlink;
		
		@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement admImg;
		
		@FindBy(linkText = "Sign Out")
		private WebElement signoutlink;
		
		//initialization
		public homepage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		
		//utilization
		
		public WebElement getOrglink() {
			return orglink;
		}

		public WebElement getContlink() {
			return contlink;
		}

		public WebElement getOpplink() {
			return opplink;
		}

		public WebElement getDoclink() {
			return doclink;
		}

		public WebElement getEmaillink() {
			return emaillink;
		}

		public WebElement getTicketlink() {
			return ticketlink;
		}

		public WebElement getLeadlink() {
			return leadlink;
		}

		public WebElement getCalendarlink() {
			return calendarlink;
		}

		public WebElement getAdmImg() {
			return admImg;
		}

		public WebElement getSignoutlink() {
			return signoutlink;
		}
		
		//business logic
		public void org() {
			orglink.click();
		}
		
		public void cont() {
			contlink.click();
		}
		
		public void ticket() {
			ticketlink.click();
		}
		
		
		public void lead() {
			leadlink.click();
		}
		public void calendar() {
			calendarlink.click();
		}
		public void opp() {
			opplink.click();
		}
		public void document() {
			doclink.click();
		}
		
		 public void email() {
			 emaillink.click();
		 }
		public void signout(WebDriver driver,WebDriverUtils wlib) {
			//admImg.click();
			
			
			wlib.mouseHover(driver, admImg);
			wlib.clickOnEleUsingJSE(driver,signoutlink );
			//wlib.mouseHoverAndClickOnEle(driver, signoutlink);
			
		}
		
		

	}



