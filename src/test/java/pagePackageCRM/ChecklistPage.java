package pagePackageCRM;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChecklistPage 
{
WebDriver driver;
public ChecklistPage(WebDriver driver)
{
this.driver=driver;	
PageFactory.initElements(driver,this);
}
@FindBy(xpath="//button[.//span[text()='Check list']]")WebElement checklist;
@FindBy(xpath="//p[text()='Permit and Utility Onboarding Intake Sheet']")WebElement permit;
@FindBy(xpath="//input[@name='posPerAssi']")WebElement q1;
@FindBy(xpath="//input[@name='posPrjVolume']")WebElement q2;
@FindBy(xpath="//input[@type='file']")WebElement fileInput;
@FindBy(xpath="//button[text()='Submit']")WebElement submit;
@FindBy(xpath="(//span[normalize-space()='Click to upload'])[1]")WebElement q3;
@FindBy(xpath="(//span[normalize-space()='Click to upload'])[2]")WebElement q4;
@FindBy(xpath="(//span[normalize-space()='Click to upload'])[3]")WebElement q5;
@FindBy(xpath="(//span[normalize-space()='Click to upload'])[4]")WebElement q6;
@FindBy(xpath="(//span[normalize-space()='Click to upload'])[5]")WebElement q7;
@FindBy(xpath="//input[@placeholder='Location']")WebElement location;
@FindBy(xpath="//li[text()='Summit Street']")WebElement opt;
@FindBy(xpath="//button[text()='Mark as completed']")WebElement markAscompleted;
@FindBy(xpath="//p[text()='Permit and Utility Onboarding Intake sheet']//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1xeia1z']")
WebElement permitback;
@FindBy(xpath="//p[text()='Contractor Registration Onboarding Requirements']")WebElement contractor;
@FindBy(xpath="//input[@name='companyLegalName']")WebElement legalName;
@FindBy(xpath="(//input[@placeholder='Location'])[1]")WebElement locatn;
@FindBy(xpath="//li[text()='Summit Street']")WebElement place;
@FindBy(xpath="//input[@name='postalCode']")WebElement postalcode;
@FindBy(xpath="//input[@name='companyType']")WebElement type;
@FindBy(xpath="//input[@class='custom_datepicker_input outlined checkform_custom_datepicker']") 
WebElement Datefield;
@FindBy(xpath = "//h2[@class='react-datepicker__current-month']")WebElement monthYear;
@FindBy(xpath = "//button[.//span[text()='Previous Month']]")WebElement nextArrow;
@FindBy(xpath = "//div[contains(@class,'react-datepicker__day') and not(contains(@class,'outside-month'))]")List<WebElement> allDates;
@FindBy(xpath="(//span[normalize-space()='Click to upload'])[1]")WebElement qc5;
@FindBy(xpath="//input[@name='companyFein']")WebElement companyFein;
@FindBy(xpath="//input[@name='naics']")WebElement naics;
@FindBy(xpath="//input[@name='permittingEmail']")WebElement permitMail;
@FindBy(xpath="//input[@name='businessEmail']")WebElement businessEmail;
@FindBy(xpath="(//input[@placeholder='Phone Number'])[1]")WebElement phonenumber;
@FindBy(xpath="(//input[@placeholder='Phone Number'])[2]")WebElement phonenumber1;
@FindBy(xpath="//input[@name='businessOwnerName']")WebElement owner;
@FindBy(xpath="(//input[@placeholder='Phone Number'])[3]")WebElement phonenumber2;
@FindBy(xpath="(//input[@placeholder='Location'])[1]")WebElement locatn2;
@FindBy(xpath="//li[text()='Summit Street']")WebElement place2;
@FindBy(xpath="//input[@name='namePrefrence']")WebElement namepreference;
@FindBy(xpath="(//span[normalize-space()='Click to upload'])[2]")WebElement qc6;
@FindBy(xpath="(//span[normalize-space()='Click to upload'])[3]")WebElement qc7;
@FindBy(xpath="(//span[normalize-space()='Click to upload'])[4]")WebElement qc8;
@FindBy(xpath="(//span[normalize-space()='Click to upload'])[5]")WebElement qc9;
@FindBy(xpath="(//span[normalize-space()='Click to upload'])[6]")WebElement qc10;
@FindBy(xpath="//div[@class='MuiBox-root css-1rc3hml']")WebElement scroll;


@FindBy(xpath="//p[text()='Contractor Registration Onboarding Requirements']")WebElement contract;
public void checklistClick()
{
checklist.click();	
}
public void permit() throws InterruptedException, AWTException
{
	permit.click();
	q1.sendKeys("yes");
	q2.sendKeys("abcd");

	Actions act=new Actions(driver);
	act.moveToElement(q3).click().perform();
	Thread.sleep(1000);
	fileupload1("C:\\Users\\kanjana\\Downloads\\BOM (13).pdf");
	Thread.sleep(3000);
	act.moveToElement(q4).click().perform();
	Thread.sleep(1000);
	fileupload1("C:\\Users\\kanjana\\Downloads\\BOM (13).pdf");
	Thread.sleep(3000);
	act.moveToElement(q5).click().perform();
	Thread.sleep(1000);
	fileupload1("C:\\Users\\kanjana\\Downloads\\BOM (13).pdf");
	Thread.sleep(3000);
	act.moveToElement(q6).click().perform();
	Thread.sleep(1000);
	fileupload1("C:\\Users\\kanjana\\Downloads\\BOM (13).pdf");
	Thread.sleep(3000);
	act.moveToElement(q7).click().perform();
	Thread.sleep(1000);
	fileupload1("C:\\Users\\kanjana\\Downloads\\BOM (13).pdf");
	Thread.sleep(3000);
	location.click();
	location.sendKeys("s");
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOf(opt));
    wait.until(ExpectedConditions.elementToBeClickable(opt)).click();
	wait.until(ExpectedConditions.elementToBeClickable(submit)).click();	
	Thread.sleep(1000);
    markAscompleted.click();
    permitback.click();
}
public void fileupload1(String fp) throws AWTException 
{
StringSelection str=new StringSelection(fp);
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
Robot ob=new Robot();
ob.delay(2000);
ob.keyPress(KeyEvent.VK_CONTROL);
ob.keyPress(KeyEvent.VK_V);
ob.keyRelease(KeyEvent.VK_V);
ob.keyRelease(KeyEvent.VK_CONTROL);
ob.delay(2000);
ob.keyPress(KeyEvent.VK_ENTER);
ob.keyRelease(KeyEvent.VK_ENTER);
}
public void selectDueDate(String expectedMonthYear, String day) throws InterruptedException 
{
    while (!monthYear.getText().trim().equals(expectedMonthYear)) 
    {
        nextArrow.click();
    }

    for (WebElement date : allDates)
    {
        if (date.getText().trim().equals(day))
        {
        	Actions actions = new Actions(driver);
            actions.moveToElement(date).pause(200).click().perform();
            break;
        }
    }      
    Thread.sleep(500);
}
public void contractordetails() throws InterruptedException, AWTException
{       
	Actions act1=new Actions(driver);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	contractor.click();
    legalName.sendKeys("FYUGP");
    locatn.click();
    locatn.sendKeys("s");
    wait.until(ExpectedConditions.visibilityOf(place));
    wait.until(ExpectedConditions.elementToBeClickable(place)).click();
    act1.moveToElement(postalcode).click().sendKeys("467288").perform();
    Thread.sleep(1000);
    act1.moveToElement(type).click().perform();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true);", Datefield);
    act1.moveToElement(Datefield).click().perform();
    Thread.sleep(1000);
    selectDueDate("March 2026","1");	
	act1.moveToElement(qc5).click().perform();
	Thread.sleep(1000);
	fileupload1("C:\\Users\\kanjana\\Downloads\\BOM (13).pdf");
	Thread.sleep(3000);
	companyFein.sendKeys("JSKJS552");
	naics.sendKeys("HSSJ567");
	permitMail.sendKeys("abcd@gmail.com");
	businessEmail.sendKeys("abc@gmail.com");
	phonenumber.sendKeys("6578263788");
	phonenumber1.sendKeys("6627182332");
	owner.sendKeys("Noyal");
	phonenumber2.sendKeys("7363264238");
	locatn2.click();
	locatn2.sendKeys("s");
    wait.until(ExpectedConditions.visibilityOf(place2));
    wait.until(ExpectedConditions.elementToBeClickable(place2)).click();
	namepreference.sendKeys("Abcd");
	act1.moveToElement(qc6).click().perform();
	Thread.sleep(1000);
	fileupload1("C:\\Users\\kanjana\\Downloads\\BOM (13).pdf");
	Thread.sleep(3000);
	act1.moveToElement(qc7).click().perform();
	Thread.sleep(1000);
	fileupload1("C:\\Users\\kanjana\\Downloads\\BOM (13).pdf");
	Thread.sleep(3000);
	act1.moveToElement(qc8).click().perform();
	Thread.sleep(1000);
	fileupload1("C:\\Users\\kanjana\\Downloads\\BOM (13).pdf");
	Thread.sleep(3000);
	act1.moveToElement(qc9).click().perform();
	Thread.sleep(1000);
	fileupload1("C:\\Users\\kanjana\\Downloads\\BOM (13).pdf");
	Thread.sleep(3000);
	act1.moveToElement(qc10).click().perform();
	Thread.sleep(1000);
	fileupload1("C:\\Users\\kanjana\\Downloads\\BOM (13).pdf");
	act1.moveToElement(submit).click().perform();	
}
}
