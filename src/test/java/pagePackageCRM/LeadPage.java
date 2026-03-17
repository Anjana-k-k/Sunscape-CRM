package pagePackageCRM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeadPage 
{
WebDriver driver;
public LeadPage(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver,this);
}
@FindBy(xpath="//a[.//span[text()='Leads']]")WebElement lead;
@FindBy(xpath="//button[text()='Lead']")WebElement createLead;
@FindBy(xpath="//input[@name='isResidential']")WebElement residence;
@FindBy(xpath="//input[@placeholder='Search Address Here ...']")WebElement srch;
@FindBy(xpath="//li[text()='Summit Street']")WebElement place;
@FindBy(xpath="//input[@name='customerInfo.pContact.firstName']") WebElement fName;
@FindBy(xpath="//input[@name='customerInfo.pContact.lastName']")WebElement LName;
@FindBy(xpath="//input[@name='customerInfo.pContact.email']")WebElement email;
@FindBy(xpath="//input[@placeholder='Phone Number']")WebElement phone;
@FindBy(xpath="//textarea[@name='description']")WebElement description;
@FindBy(xpath="//button[.//span[text()='Save']]")WebElement save;

@FindBy(xpath="//div[@role='gridcell' and normalize-space()='Anjana k k']")WebElement openLead;
@FindBy(xpath="//button[@aria-label='Assign Lead']")WebElement assignLead;
@FindBy(xpath="//button[@aria-label='Open']")WebElement usermenu;
@FindBy(xpath="//li[text()='Gokul - Krishna']")WebElement user;
@FindBy(xpath="//button[.//span[text()='Save']]")WebElement SaveUser;
@FindBy(xpath="//span[@class='_modalHeaderButton_1f8j3_21']")WebElement close;

@FindBy(xpath="//div[.//h4[text()='Energy Usage']]//span[contains(@class,'editButton')]")WebElement editEnergy;
@FindBy(xpath="//span[normalize-space()='Area Sqft'] /ancestor::div[1]//input[contains(@class,'_input')]")WebElement sqft;
@FindBy(xpath="(//select[@class='_input_1q1a1_318'])[1]")WebElement ac;
@FindBy(xpath="(//select[@class='_input_1q1a1_318'])[2]")WebElement heater;
@FindBy(xpath="(//input[@class='_input_1q1a1_318'])[3]")WebElement Avg;
@FindBy(xpath="//span[@class='_saveButton_1q1a1_232']")WebElement saveEnergy;


@FindBy(xpath="//button[.//div[text()='Folders']]")WebElement folder;
@FindBy(xpath="//button[.//span[text()='Upload']]")WebElement upload;
@FindBy(xpath="//button[text()='Select file']")WebElement selectfile;
@FindBy(xpath="(//button[.//span[text()='Upload']])[2]")WebElement uploadBtn;
@FindBy(xpath="(//button[@aria-label='more'])[4]")WebElement more;
@FindBy(xpath="//li[text()='Download']")WebElement download;

@FindBy(xpath="//button[.//div[text()='Appointments']]")WebElement appointmnts;
@FindBy(xpath="//button[.//span[text()='+ Add New']]")WebElement addNew;
@FindBy(xpath="(//button[@title='Open'])[1]")WebElement typeMenu;
@FindBy(xpath="//div[text()='Appointment']")WebElement type1;
@FindBy(xpath="//input[@name='subject']")WebElement title;
@FindBy(xpath="(//input[@type='text'])[8]")WebElement timeInput;
@FindBy(xpath="//li[text()='6:30 PM']") WebElement time;
@FindBy(xpath="(//label[.//span[@class='greenmark']])[2]")WebElement online;
@FindBy(xpath="//button[.//span[text()='Save']]")WebElement saveA;

@FindBy(xpath="//button[.//div[text()='Reminder']]")WebElement reminder;
@FindBy(xpath="//button[text()='Reminder']")WebElement addReminder;
@FindBy(xpath="(//input[@type='text'])[4]")WebElement timeInputs;
@FindBy(xpath="//ul[@class='react-datepicker__time-list']")WebElement scroll;
@FindBy(xpath="//li[text()='11:00 AM']") WebElement time2;
@FindBy(xpath="//textarea[@name='message']")WebElement description2;
@FindBy(xpath="//button[.//span[text()='Create']]")WebElement create;

@FindBy(xpath="//button[.//div[text()='Activity']]")WebElement activity;
@FindBy(xpath="//button[text()='Convert to project']")WebElement convertPrj;
@FindBy(xpath="//button[.//span[text()='Next']]")WebElement next;
@FindBy(xpath="//button[.//span[text()='Save']]")WebElement Save;

@FindBy(xpath="//div[text()='Active']")WebElement activemenu;
@FindBy(xpath="//div[text()='Archived']")WebElement archived;
@FindBy(xpath="(//div[text()='Archived'])[1]")WebElement archivemenu;
@FindBy(xpath="//div[text()='Active']")WebElement active;

public void leadClick()
{
lead.click();	
}
public void createLead()
{
createLead.click();
residence.click();	
Actions ac=new Actions(driver);
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
wait.until(ExpectedConditions.elementToBeClickable(srch)).click();
srch.sendKeys("s");
ac.moveToElement(place).click().perform();
fName.sendKeys("Anjana");
LName.sendKeys("k k");
email.sendKeys("abcd@gmail.com");
phone.sendKeys("3456789345");
description.sendKeys("Description for Lead");
save.click();
}
public void openLeads()
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(openLead)).click();
}
public void assignLeads()
{
	assignLead.click();
	usermenu.click();
	user.click();
	SaveUser.click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(close)).click();
}
public void Energy()
{
editEnergy.click();
sqft.sendKeys("2400");
Select ob1=new Select(ac);
ob1.selectByValue("Yes");
Select ob2=new Select(heater);
ob2.selectByValue("Yes");
Avg.sendKeys("2000");
saveEnergy.click();
}
public void robocls() throws AWTException, InterruptedException
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,800)", "");
	folder.click();
	upload.click();
	selectfile.click();
    fileupload("C:\\Users\\kanjana\\Downloads\\BOM (14).pdf");
    Thread.sleep(2000);
    uploadBtn.click();
    
}
private void fileupload(String fp) throws AWTException
{
    StringSelection str = new StringSelection(fp);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

    Robot ob = new Robot();
    ob.delay(2000);

    ob.keyPress(KeyEvent.VK_CONTROL);
    ob.keyPress(KeyEvent.VK_V);
    ob.keyRelease(KeyEvent.VK_V);
    ob.keyRelease(KeyEvent.VK_CONTROL);

    ob.delay(1000);

    ob.keyPress(KeyEvent.VK_ENTER);
    ob.keyRelease(KeyEvent.VK_ENTER);
}
public void filedownload() throws InterruptedException
{
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
wait.until(ExpectedConditions.visibilityOf(more)).click();
download.click();
Thread.sleep(2000);
}
public void appointments()
{ 
	appointmnts.click();
	addNew.click();
	typeMenu.click();
	type1.click();
	title.sendKeys("Appointment 2");
	timeInput.click();
	time.click();
	online.click();
	saveA.click();	
}
public void reminderLead()
{

	reminder.click();
    addReminder.click();
    timeInputs.click();
    time2.click();
    description2.sendKeys("This is a description for Reminder");
    create.click();
}
public void activities()
{
activity.click();	
}
public void convertToproject()
{
convertPrj.click();
next.click();
Save.click();
}
public void MenuList() throws InterruptedException
{
	activemenu.click();
	archived.click();
	Thread.sleep(1000);
	archivemenu.click();
	active.click();
}
}
