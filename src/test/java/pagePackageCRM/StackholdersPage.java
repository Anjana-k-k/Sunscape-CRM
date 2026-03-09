package pagePackageCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StackholdersPage 
{
WebDriver driver;
public StackholdersPage(WebDriver driver)
{
 this.driver=driver;
 PageFactory.initElements(driver,this);
}
@FindBy(xpath="//button[.//div[text()='Stakeholders']]")WebElement stackHolder;
@FindBy(xpath="//span[@class='_editButton_1wmih_32']")WebElement edit;
@FindBy(xpath="(//button[@aria-label='Open'])[1]")WebElement offMenu;
@FindBy(xpath="//div[text()='office 109']")WebElement offOpt;
@FindBy(xpath="(//button[@aria-label='Open'])[2]")WebElement srcMenu;
@FindBy(xpath="//div[text()='source 109']")WebElement srcOpt;
@FindBy(xpath="(//button[@aria-label='Open'])[3]")WebElement salesGrp;
@FindBy(xpath="//div[text()='Account Manager']")WebElement grpOpt1;
@FindBy(xpath="(//button[@aria-label='Open'])[4]")WebElement saleUserMenu;
@FindBy(xpath="//div[text()='Gokul - Krishna']")WebElement saleUserOpt;
@FindBy(xpath="(//button[@aria-label='Open'])[5]")WebElement setGrpMenu;
@FindBy(xpath="//div[text()='Account Manager']")WebElement setgrpOpt1;
@FindBy(xpath="(//button[@aria-label='Open'])[6]")WebElement setUsrMenu;
@FindBy(xpath="//div[text()='Gokul - Krishna']")WebElement setUserOpt;
@FindBy(xpath="(//button[@aria-label='Open'])[7]")WebElement prjGrpMenu;
@FindBy(xpath="//div[text()='Account Manager']")WebElement PrjgrpOpt1;
@FindBy(xpath="(//button[@aria-label='Open'])[8]")WebElement prjUsrMenu;
@FindBy(xpath="//div[text()='Gokul - Krishna']")WebElement prjUserOpt;
@FindBy(xpath="//input[@name='installerName']")WebElement InstName;
@FindBy(xpath="//span[@class='_saveButton_1wmih_25']")WebElement saveStack;

public void stackClick()
{
stackHolder.click();	
}
public void stackdetails()
{
	edit.click();
	offMenu.click();
	offOpt.click();
	srcMenu.click();
	srcOpt.click();
	salesGrp.click();
	grpOpt1.click();
	saleUserMenu.click();
	saleUserOpt.click();
	setGrpMenu.click();
	setgrpOpt1.click();
	setUsrMenu.click();
	setUserOpt.click();
	prjGrpMenu.click();
	PrjgrpOpt1.click();
	prjUsrMenu.click();
	prjUserOpt.click();
	InstName.sendKeys("Installer 11");
	saveStack.click();
	}
}
