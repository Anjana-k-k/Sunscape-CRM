package pagePackageCRM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MaterialsPage 
{
WebDriver driver;
@FindBy(xpath="//button[.//span[text()='Material']]")WebElement materialsOpt;
@FindBy(xpath="//button[.//span[contains(text(),'+ Type')]]")WebElement addtype;
@FindBy(xpath="//div[input[@name='name']]")WebElement MaterialName;
@FindBy(xpath="//div[textarea[@name='description']]")WebElement MaterialDescription;
@FindBy(xpath="//button[span[text()='Submit']]")WebElement submitMaterial;
@FindBy(xpath="//*[@id=\"long-button\"]")WebElement materialMenu; 
@FindBy(xpath="//li[@role='menuitem' and text()='Delete']")WebElement dltMaterial;
@FindBy(xpath="//div[contains(@class,'MuiDataGrid-scrollbar MuiDataGrid-scrollbar--horizontal css-2n9dey')]")WebElement scrollOpt;
@FindBy(xpath="//button[contains(text(),'Delete')]")WebElement MatdltOpt;
@FindBy(xpath="//button[contains(text(),'Cancel')]")WebElement cancel;
@FindBy(xpath="//div[@role='gridcell' and normalize-space()='Material']")WebElement openMaterial;
@FindBy(xpath="//button[.//span[text()='+ Material']]")WebElement addMaterial;
@FindBy(xpath="//input[@placeholder='Name']")WebElement nameMaterial;
@FindBy(xpath="//input[@placeholder='Base Price']")WebElement price;
@FindBy(xpath="//input[@placeholder='Unit of Measurement']")WebElement unit;
@FindBy(xpath="//textarea[@placeholder='Description']")WebElement Materialdescription;
@FindBy(xpath="//button[.//span[text()='Submit']]")WebElement submitButton;


@FindBy(xpath="//div[@role='gridcell' and normalize-space()='Material']")WebElement material;
@FindBy(xpath="//a[text()='Material']")WebElement materialBack;
@FindBy(xpath="//div[@role='gridcell' and normalize-space()='Module']")WebElement module;
@FindBy(xpath="//button[.//span[text()='+ Module']]")WebElement addmodule;
@FindBy(xpath="//a[text()='Module']")WebElement moduleback;
@FindBy(xpath="//div[@role='gridcell' and normalize-space()='Inverter']")WebElement inverter;
@FindBy(xpath="//button[.//span[text()='+ Inverter']]")WebElement addinv;
@FindBy(xpath="//a[text()='Inverter']")WebElement inverterBAck;
@FindBy(xpath="//div[@role='gridcell' and normalize-space()='Rail']")WebElement rail;
@FindBy(xpath="//button[.//span[text()='+ Rail']]")WebElement addrail;
@FindBy(xpath="//a[text()='Rail']")WebElement railBack ;
@FindBy(xpath="//div[@role='gridcell' and normalize-space()='Battery']")WebElement battery;
@FindBy(xpath="//button[.//span[text()='+ Battery']]")WebElement addbattery;
@FindBy(xpath="//a[text()='Battery']")WebElement batteryBack ;
@FindBy(xpath="//div[@role='gridcell' and normalize-space()='Ev Charger']")WebElement EvCharger;
@FindBy(xpath="//button[.//span[text()='+ Ev Charger']]")WebElement addev;
@FindBy(xpath="//a[text()='Ev Charger']")WebElement evback;
@FindBy(xpath="//div[@role='gridcell' and normalize-space()='Generator']")WebElement generator;
@FindBy(xpath="//button[.//span[text()='+ Generator']]")WebElement addgenerator;
@FindBy(xpath="//a[text()='Generator']")WebElement generatorback ;
@FindBy(xpath="//div[@role='gridcell' and normalize-space()='Attachment']")WebElement Attachments;
@FindBy(xpath="//button[.//span[text()='+ Attachment']]")WebElement addAttachmnts;
@FindBy(xpath="//a[text()='Attachment']")WebElement AttBack;
public MaterialsPage(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver,this);
}

public void materialsClick()
{
driver.navigate().refresh();
materialsOpt.click();	
}
public void createMaterials() throws InterruptedException
{
	Actions act5=new Actions(driver);
	act5.moveToElement(addtype).click().perform();
	act5.moveToElement(MaterialName).click().sendKeys("Inverter Type 25").perform();
	Thread.sleep(500);
	act5.moveToElement(MaterialDescription).click().sendKeys("This is the description for Inverter ").perform();
	submitMaterial.click();
}
public void deleteMaterials() throws InterruptedException
{
	Actions act7=new Actions(driver);
   // driver.navigate().refresh();
    JavascriptExecutor js1=(JavascriptExecutor)driver;
    js1.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth;", scrollOpt);
    Thread.sleep(1000);
    materialMenu.click();
	Thread.sleep(1000);
	act7.moveToElement(dltMaterial).click().perform();
	Thread.sleep(1000);
	act7.moveToElement(MatdltOpt).click().perform();
}

public void openmaterial1() throws InterruptedException
{
Actions ac=new Actions(driver);
ac.moveToElement(openMaterial).doubleClick().perform();
Thread.sleep(2000);
ac.moveToElement(addMaterial).click().perform();
ac.moveToElement(nameMaterial).click().sendKeys(" New_Materials 115").perform();
ac.moveToElement(price).click().sendKeys("2000").perform();
ac.moveToElement(unit).click().sendKeys("mm").perform();
//ac.moveToElement(MaterialDescription).click().sendKeys("Description for matrial").perform();
Thread.sleep(1000);
ac.moveToElement(submitButton).click().perform();
Thread.sleep(2000);
materialBack.click();
}
public void material2() throws InterruptedException
{
	Actions ac=new Actions(driver);
module.click();
Thread.sleep(2000);
ac.moveToElement(addmodule).click().perform();
ac.moveToElement(nameMaterial).click().sendKeys(" _New module 115").perform();
ac.moveToElement(price).click().sendKeys("2000").perform();
ac.moveToElement(unit).click().sendKeys("mm").perform();
//ac.moveToElement(MaterialDescription).click().sendKeys("Description for module").perform();
Thread.sleep(1000);
ac.moveToElement(submitButton).click().perform();
Thread.sleep(2000);
ac.moveToElement(moduleback).click().perform();
}
public void material3() throws InterruptedException
{
	Actions ac=new Actions(driver);
inverter.click();
Thread.sleep(2000);
ac.moveToElement(addinv).click().perform();
ac.moveToElement(nameMaterial).click().sendKeys(" _new inverter 115").perform();
ac.moveToElement(price).click().sendKeys("2000").perform();
ac.moveToElement(unit).click().sendKeys("mm").perform();
//ac.moveToElement(MaterialDescription).click().sendKeys("Description for Inverter").perform();
Thread.sleep(1000);
ac.moveToElement(submitButton).click().perform();
Thread.sleep(2000);
ac.moveToElement(inverterBAck).click().perform();
}
public void material4() throws InterruptedException
{
	Actions ac=new Actions(driver);
rail.click();
Thread.sleep(2000);
ac.moveToElement(addrail).click().perform();
ac.moveToElement(nameMaterial).click().sendKeys(" _New rail 115").perform();
ac.moveToElement(price).click().sendKeys("2000").perform();
ac.moveToElement(unit).click().sendKeys("mm").perform();
//ac.moveToElement(MaterialDescription).click().sendKeys("Description for matrial").perform();
Thread.sleep(1000);
ac.moveToElement(submitButton).click().perform();
Thread.sleep(2000);
ac.moveToElement(railBack).click().perform();
}
public void material5() throws InterruptedException
{
	Actions ac=new Actions(driver);
battery.click();
Thread.sleep(2000);
ac.moveToElement(addbattery).click().perform();
ac.moveToElement(nameMaterial).click().sendKeys(" _New battery 115").perform();
ac.moveToElement(price).click().sendKeys("2000").perform();
ac.moveToElement(unit).click().sendKeys("mm").perform();
//ac.moveToElement(MaterialDescription).click().sendKeys("Description for matrial").perform();
Thread.sleep(1000);
ac.moveToElement(submitButton).click().perform();
Thread.sleep(2000);
ac.moveToElement(batteryBack).click().perform();
}
public void material6() throws InterruptedException
{
Actions ac=new Actions(driver);
EvCharger.click();
Thread.sleep(2000);
ac.moveToElement(addev).click().perform();
ac.moveToElement(nameMaterial).click().sendKeys(" _New ev  charger 115").perform();
ac.moveToElement(price).click().sendKeys("2000").perform();
ac.moveToElement(unit).click().sendKeys("mm").perform();
//ac.moveToElement(MaterialDescription).click().sendKeys("Description for matrial").perform();
Thread.sleep(1000);
ac.moveToElement(submitButton).click().perform();
Thread.sleep(2000);
ac.moveToElement(evback).click().perform();
}
public void material7() throws InterruptedException
{
	Actions ac=new Actions(driver);
generator.click();
Thread.sleep(2000);
ac.moveToElement(addgenerator).click().perform();
ac.moveToElement(nameMaterial).click().sendKeys(" _New generatorw 115").perform();
ac.moveToElement(price).click().sendKeys("2000").perform();
ac.moveToElement(unit).click().sendKeys("mm").perform();
//ac.moveToElement(MaterialDescription).click().sendKeys("Description for matrial").perform();
Thread.sleep(1000);
ac.moveToElement(submitButton).click().perform();
Thread.sleep(2000);
ac.moveToElement(generatorback).click().perform();
}
public void material8() throws InterruptedException
{
Actions ac=new Actions(driver);
Attachments.click();
Thread.sleep(2000);
ac.moveToElement(addAttachmnts).click().perform();
ac.moveToElement(nameMaterial).click().sendKeys(" _New attachment 115").perform();
ac.moveToElement(price).click().sendKeys("2000").perform();
ac.moveToElement(unit).click().sendKeys("mm").perform();
//ac.moveToElement(MaterialDescription).click().sendKeys("Description for matrial").perform();
Thread.sleep(1000);
ac.moveToElement(submitButton).click().perform();
Thread.sleep(2000);
ac.moveToElement(AttBack).click().perform();
}
}
