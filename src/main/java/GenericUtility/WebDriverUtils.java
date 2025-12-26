package GenericUtility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {
	/**
	 * This method is used to maximize the window
	 * @author Sneha
	 * @param driver
	 */
	//to maximize window
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/**
	 * This method is used to give wait time for loading the elements 
	 * @author Sneha
	 * @param driver
	 * @param second
	 */
	//to load the page 
	public void waitForPageLoad(WebDriver driver,int second) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(second));
	}
	/**
	 * This method is used to perform explicit wait w.r.t visibility of that element
	 * @author Sneha
	 * @param driver
	 * @param second
	 * @param element
	 */
	//explicit wait
	public void waitUntilEleToBeVisible(WebDriver driver,int second,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(second));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * This method is used to perform wait function explicitly w.r.t element to be clickable
	 * @author Sneha
	 * @param driver
	 * @param second
	 * @param element
	 */
	public void waitUntilEleToBeClickable(WebDriver driver,int second,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(second));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public  Select dropdown(WebElement element) {
		Select sel=new Select(element);
		return sel;
	}
	/**
	 * This method is used to select an element from dropdown with value
	 * @author Sneha
	 * @param element
	 * @param value
	 */

	public void dropdownUsingContainsVisibleText(WebElement element,String text) {
		dropdown(element).selectByContainsVisibleText(text);
	}
	/**
	 * This method is used to select an element from dropdown with index number
	 * @author Sneha
	 * @param element
	 * @param index
	 */
	public void dropdownUsingIndex(WebElement element,int index) {
		dropdown(element).selectByIndex(index);
	}
	/**
	 * This method is used to select an element from dropdown with visible text of that element
	 * @author Sneha
	 * @param element
	 * @param text
	 */
	public void dropdownUsingVisibleText(WebElement element,String text) {
		dropdown(element).selectByVisibleText(text);
	}
	
	//Actions class
	public Actions actions(WebDriver driver) {
		Actions act=new Actions(driver);
		return act;
	}
	/**
	 * This method is used to move the control to element
	 * @author Sneha
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebDriver driver,WebElement element) {
		actions(driver).moveToElement(element).perform();
	}
	/**
	 * This method is used to move the control to element and click on element
	 * @author Sneha
	 * @param driver
	 * @param element
	 */
	public void mouseHoverAndClickOnEle(WebDriver driver,WebElement element) {
		actions(driver).moveToElement(element).click(element).perform();
	}
	/**
	 * This method is used to  drag and drop element from source to destination
	 * @author Sneha
	 * @param driver
	 * @param source
	 * @param destination
	 */
	public void dragAnddrop(WebDriver driver,WebElement source,WebElement destination) {
		actions(driver).dragAndDrop(source, destination).perform();
	}
	/**
	 * This method is used to click and hold the element
	 * @author Sneha
	 * @param driver
	 * @param element
	 */
	
	public void clickAndHold(WebDriver driver,WebElement element) {
		actions(driver).clickAndHold(element).perform();
	}
	/**
	 * This method is used to click and hold an element and release the control
	 * @author Sneha
	 * @param driver
	 * @param element
	 */
	public void clickandHoldAndRelease(WebDriver driver,WebElement element) {
		actions(driver).clickAndHold(element).release().perform();
	}
	/**
	 * This method is used to double click on web page 
	 * @author Sneha
	 * @param driver
	 */
	public void doubleClickOnWebpage(WebDriver driver) {
		actions(driver).doubleClick().perform();
		}
	/**
	 * This method is used to double click on element 
	 * @author Sneha
	 * @param driver
	 * @param element
	 */
	public void doubleClickOnEle(WebDriver driver,WebElement element) {
		actions(driver).doubleClick(element).perform();
	}
	/**
	 * This method is used to rightclick on webpage
	 * @author Sneha
	 * @param driver
	 */
	public void rightClickOnPage(WebDriver driver) {
		actions(driver).contextClick().perform();
	}
	/**
	 * This method is used to rioght click on element
	 * @author Sneha
	 * @param driver
	 * @param element
	 */
	public void rightClickOnEle(WebDriver driver,WebElement element) {
		actions(driver).contextClick(element).perform();
	}
	/***
	 * This method is used to  scroll to element w.r.t actions class
	 * @author Sneha
	 * @param driver
	 * @param element
	 */
public void scrollToEle(WebDriver driver,WebElement element) {
		actions(driver).scrollToElement(element).perform();
	}
/**
 * This method is used to handle multiple windows
 * @author Sneha
 * @param driver
 * @param expTitle
 */
	
	//multiple windows
	public void switchToWindow(WebDriver driver,String expTitle) {
	//String parent = driver.getWindowHandle();
	Set<String> windows = driver.getWindowHandles();
	Iterator<String>it=windows.iterator();
	while(it.hasNext()) {
		String currentWin=it.next();
		String actualTitle=driver.switchTo().window(currentWin).getTitle();
		if(actualTitle.contains(expTitle)) {
			break;
		}
	}
	}
	/**
	 * This method is used to switch the control to parent window from child/multiple windows
	 * @author Sneha
	 * @param driver
	 * @param parentID
	 */
	
//	public void switchToParentWindow(WebDriver driver) {
//		String parentID=driver.getWindowHandle();
//		driver.switchTo().window(parentID);
//	}
	//frames
	/**
	 * This method is used to switch to frame by index
	 * @author Sneha
	 * @param driver
	 * @param index
	 */
	public void switchToFrameByIndex(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * This method is used to switch to frame by id/name value
	 * @author Sneha
	 * @param driver
	 * @param idOrname
	 */
	public void switchToFrameByIdOrName(WebDriver driver,String idOrname) {
		driver.switchTo().frame(idOrname);
	}
	/**
	 * This method is used to switch  to frame by element
	 * @author Sneha
	 * @param driver
	 * @param element
	 */
	public void switchToFramesByEle(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	/**
	 * This method is used to switch the control to parent frame
	 * @author Sneha
	 * @param driver
	 */
	public void switchToParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}
	/**
	 * This method is used to switch the control to main web page
	 * @author Sneha
	 * @param driver
	 */
	//for main webPage
	public void switchToMainPage(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	//alert popups
	public Alert AlertPopUp(WebDriver driver) {
		Alert a = driver.switchTo().alert();
		return a;
	}
	/**
	 * This method is used to accept the popup
	 * @author Sneha
	 * @param driver
	 */
	public void acceptAlertPopUp(WebDriver driver) {
		AlertPopUp(driver).accept();
	}
	/**
	 * This method is used to dismiss/reject the popup
	 * @author Sneha
	 * @param driver
	 */
	public void rejectAlertPopUp(WebDriver driver) {
		
		AlertPopUp(driver).dismiss();
	}
	/**
	 * This method is used to enter text into field in popup
	 * @author Sneha
	 * @param driver
	 * @param value
	 */
	public void enterValueIntoALertPopUp(WebDriver driver,String value) {
		AlertPopUp(driver).sendKeys(value);
	}
	/**
	 * This method is used to get the text from popup
	 * @author Sneha
	 * @param driver
	 */
	public void getTextFromAlertPopUp(WebDriver driver) {
		AlertPopUp(driver).getText();
	}
	//javascrpitExecutor  methods
	public JavascriptExecutor javaScriptExecutor(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		return js;
	}
	/**
	 * This method is used to click on element using JavaScriptExecutor
	 * @author Sneha
	 * @param driver
	 * @param element
	 */
	//click on element
	public void clickOnEleUsingJSE(WebDriver driver,WebElement element) {
		javaScriptExecutor(driver).executeScript("arguments[0].click()",element);
	}
	/**
	 * This method is used to enter text into fields using JavaScriptExecutor
	 * @author Sneha
	 * @param driver
	 * @param element
	 * @param value
	 */
	//sendKeys
	public void enterValueIntoTextFieldUsingJSE(WebDriver driver,WebElement element,String value) {
		javaScriptExecutor(driver).executeScript("arguments[0].value=arguments[1]",element,value);
	}
	/**
	 * This method is used to scroll w.r.t X and Y co-ordinators using JavascriptExecutor
	 * @author Sneha
	 * @param driver
	 * @param element
	 */
	
	public void  scrollToEleUsingXYcorJSE(WebDriver driver,WebElement element) {
	Point loc = element.getLocation();
	int x=loc.getX();
	int y=loc.getY();
	javaScriptExecutor(driver).executeScript("window.scrollBy("+x+","+y+")");
	}
	public void scrollHeightUsingJSE(WebDriver driver) {
		javaScriptExecutor(driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	//scrollTillElement
	/**
	 * This method is used to scroll to element using javascriptExecutor
	 * @author Sneha
	 * @param driver
	 * @param element
	 */
	public void scrollUntilEleVisibleUsingJSE(WebDriver driver,WebElement element) {
		javaScriptExecutor(driver).executeScript("arguments[0].scrolIntoView()",element);
	}

}





