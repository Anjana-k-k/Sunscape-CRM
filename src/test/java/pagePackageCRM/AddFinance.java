package pagePackageCRM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddFinance 
{
WebDriver driver;
public AddFinance(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver,this);
}
@FindBy(xpath="//button[.//div[text()='Finance']]")WebElement financeBtn;
@FindBy(xpath="//button[text()='Add']")WebElement addf; 
@FindBy(xpath="//input[@name='financeType']")WebElement ftype;
@FindBy(xpath="(//input[@name='paymentType'])[2]")WebElement rdio;
@FindBy(xpath="//li[text()='CNR']")WebElement ftypeOpt;
@FindBy(xpath="//input[@name='amount']")WebElement amnt;
@FindBy(xpath="//button[.//span[text()='Submit']]")WebElement sbmt;
@FindBy(xpath="//div[@class='_mainContainer_4ta1u_1']")WebElement scroll;
public void financeClick()
{
	
	financeBtn.click();
}
public void addfinancesData()
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0, -200);",scroll);
	addf.click();
	Actions act=new Actions(driver);
	act.moveToElement(ftype).click().perform();
	act.moveToElement(ftypeOpt).click().perform();
	//ftypeOpt.click();
	amnt.sendKeys("1000");
	sbmt.click();
}

}
