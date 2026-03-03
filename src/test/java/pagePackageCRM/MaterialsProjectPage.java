package pagePackageCRM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MaterialsProjectPage 
{
 WebDriver driver;
 public MaterialsProjectPage(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver,this);	 
 }
 @FindBy(xpath="//button[.//div[text()='Material']]")WebElement materials;
 
 @FindBy(xpath="//button[text()='+ BOM']")WebElement bom;
 @FindBy(xpath="(//button[@aria-label='Open'])[1]")WebElement materialMenu;
 @FindBy(xpath="(//div[text()='Material'])[3]")WebElement materialOpt;
 @FindBy(xpath="(//button[@aria-label='Open'])[2]")WebElement typeMenu;
 @FindBy(xpath="//div[text()=' _New _Materials__ ']")WebElement typeOpt;
 @FindBy(xpath="//input[@name='itemqty']")WebElement qntity;
 @FindBy(xpath="//button[text()='Save']")WebElement save;
 @FindBy(xpath="//button[text()='Download']")WebElement dwnld;
 @FindBy(xpath="//button[@aria-label='more']")WebElement Menu;
 @FindBy(xpath="//li[text()='Delete']")WebElement delete;
 @FindBy(xpath="//button[text()='Delete']")WebElement dltBtn;
 
@FindBy(xpath="//button[text()='Adder']")WebElement adderOpt;
@FindBy(xpath="//button[text()='+ Adder']")WebElement adder;
@FindBy(xpath="//div[text()='Inverter']")WebElement addertype;
@FindBy(xpath="//div[text()=' _new inverter11 ']")WebElement adderInv;

 @FindBy(xpath="//button[text()='Labels']")WebElement labelOpt;
 @FindBy(xpath="//button[text()='+ Label']")WebElement addLabel;
 @FindBy(xpath="//button[text()='Upload']")WebElement upload;
 @FindBy(xpath="//input[@name='select_row']")WebElement selectfile;
 @FindBy(xpath="(//button[text()='Upload'])[2]")WebElement uploadBtn;
 @FindBy(xpath="(//button[text()='+'])[2]")WebElement stickerPack;
 @FindBy(xpath="(//button[text()='+'])[3]")WebElement placardPack;
 @FindBy(xpath="//input[@name='name']")WebElement Name;
 @FindBy(xpath="//input[@name='deliveryType']")WebElement deliveryType;
 @FindBy(xpath="//textarea[@name='orderNotes']")WebElement notes;
 @FindBy(xpath="//button[text()='Order']")WebElement order;
 
 public void materialsclick()
 {
	 materials.click();
 }
 public void bomData()
 {
	 bom.click();
	 materialMenu.click();
	 materialOpt.click();
	 typeMenu.click();
	 typeOpt.click();
	 qntity.sendKeys("5");
	 save.click();
	 dwnld.click();	 
 }
 public void deleteBom()
 {
	 Menu.click();
	 delete.click();
	 dltBtn.click();
 }
 public void adder() throws InterruptedException
 {
	 adderOpt.click();
	 adder.click();
	 materialMenu.click();
	 addertype.click();
	 typeMenu.click();
	 adderInv.click();
	 qntity.sendKeys("4");
	 save.click();
	 Thread.sleep(1000);
	 dwnld.click();
 }
 public void dltAdder()
 {
	 Menu.click();
	 delete.click();
	 dltBtn.click();
 }

public void labels() throws InterruptedException, AWTException
{
	labelOpt.click();
	addLabel.click();
	upload.click();
	selectfile.click();
    Actions act=new Actions(driver);
    Thread.sleep(2000);
    act.moveToElement(uploadBtn).click().perform();
    stickerPack.click();
    placardPack.click();
    Name.sendKeys("Noyal s");
    deliveryType.click();
    notes.sendKeys("Notes for label");
    order.click();
}
 
 

}
