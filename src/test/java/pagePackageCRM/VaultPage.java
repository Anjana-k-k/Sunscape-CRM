package pagePackageCRM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VaultPage 
{
WebDriver driver;
public VaultPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//button[.//span[text()='Vault']]")WebElement vaultopt;
@FindBy(xpath="//button[.//span[text()='Import CSV']]")WebElement importOpt;
@FindBy(xpath="//button[.//span[text()='Upload or Drop file']]")WebElement uploadFile;
@FindBy(xpath="//button[text()='Submit']")WebElement submitfile;
@FindBy(xpath="//button[.//span[text()='Export CSV']]")WebElement exportcsv;
@FindBy(xpath="//button[.//span[text()='+ Vault']]")WebElement create;
@FindBy(xpath="//input[@name='name']")WebElement V_name;
@FindBy(xpath="//input[@name='username']")WebElement username;
@FindBy(xpath="//input[@name='password']")WebElement password;
@FindBy(xpath="//input[@name='website']")WebElement website;
@FindBy(xpath="//button[@aria-label='Open']")WebElement type;
@FindBy(xpath="//li[text()='Design tools']")WebElement Opt;
@FindBy(xpath="//textarea[@name='note']")WebElement notes;
@FindBy(xpath="//button[.//span[text()='Upload or Drop file']]")WebElement uploadclick;
@FindBy(xpath="//button[text()='Save']")WebElement saveClick;
@FindBy(xpath="//div[@aria-rowindex='2']")WebElement openVault;
@FindBy(xpath="//button[@aria-label='more']")WebElement menu;
@FindBy(xpath="//li[text()='Edit']")WebElement edit;
@FindBy(xpath="//li[text()='Delete']")WebElement delete;



public void vaultClick()
{
	vaultopt.click();
}
public void importfile() throws AWTException
{
    importOpt.click();
    uploadFile.click();
	fileuploads("C:\\Users\\kanjana\\Downloads\\Book1sample.csv");
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(submitfile)).click();
}
private void fileuploads(String fp) throws AWTException
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
public void exportCSV()
{
exportcsv.click();	
}
public void createVAult() throws AWTException, InterruptedException
{
create.click();
V_name.sendKeys("Test Vault");
username.sendKeys("testuser123");
password.sendKeys("Abc@123");
website.sendKeys("https://www.google.com/?zx=1773743238483&no_sw_cr=1");
type.click();
Opt.click();
notes.sendKeys("Notes for test vault");
uploadclick.click();
fileuploads2("C:\\Users\\kanjana\\Downloads\\design issue.png");
Thread.sleep(2000);
saveClick.click();
}
private void fileuploads2(String fp) throws AWTException
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
public void edit()
{
openVault.click();
menu.click();
edit.click();
notes.clear();
notes.sendKeys("Test Vault Edited");
saveClick.click();
}
public void delete()
{
menu.click();	
delete.click();
}
}
