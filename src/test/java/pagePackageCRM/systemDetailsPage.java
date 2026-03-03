package pagePackageCRM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class systemDetailsPage 
{
WebDriver driver;
public systemDetailsPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//button[.//div[text()='System Details']]")WebElement system;

@FindBy(xpath="//button[.//div[.//p[text()='PV Details']]]")WebElement pvDetailBtn;
@FindBy(xpath="//span[@class='_editButton_pkyov_37']")WebElement editPv;
@FindBy(xpath="//input[@name='moduleCount']")WebElement  moduleCount;
@FindBy(xpath="(//button[@title='Open'])[1]")WebElement moduleMenu;
@FindBy(xpath="//div[text()='M1']")WebElement moduleM;
@FindBy(xpath="//input[@name='moduleWattage']")WebElement mWattage;
@FindBy(xpath="//input[@name='inverterCount']")WebElement iCount;
@FindBy(xpath="(//button[@title='Open'])[2]")WebElement iMenu;
@FindBy(xpath="//div[text()=' _new inverter11 ']")WebElement iManufacture;
@FindBy(xpath="//input[@name='dcSystemSize']")WebElement dc;
@FindBy(xpath="//input[@name='annualProduction']")WebElement aProduction;
@FindBy(xpath="//input[@name='annualConsumption']")WebElement aConsumption;
@FindBy(xpath="//input[@name='offset']")WebElement offset;
@FindBy(xpath="//input[@name='systemCost']")WebElement sCost;
@FindBy(xpath="//textarea[@name='additionalPvNotes']")WebElement addNotes;
@FindBy(xpath="//button[text()='Update']")WebElement updatePv;


@FindBy(xpath="//button[.//div[.//p[text()='Racking Details']]]")WebElement racking;
//@FindBy(xpath="//span[@class='_editButton_pkyov_37']")WebElement editRack;
@FindBy(xpath="//button[.//p[text()='Racking Details']]//span[contains(@class,'editButton')]")
WebElement editRack;
@FindBy(xpath="(//button[@title='Open'])")WebElement rckmenu;
@FindBy(xpath="//div[text()=' _New rail 107']")WebElement rail1;
@FindBy(xpath="(//button[@title='Open'])[2]")WebElement atMenu;
@FindBy(xpath="//div[text()=' _New attachment']")WebElement at1;
@FindBy(xpath="(//button[@title='Open'])[3]")WebElement Rsize ;
@FindBy(xpath="//div[text()='16']")WebElement size;
@FindBy(xpath="//textarea[@name='additionalRackingNotes']")WebElement rcnotes ;
@FindBy(xpath="//button[text()='Update']")WebElement updateRc ;


@FindBy(xpath="(//input[@type='checkbox'])[1]")WebElement ess;
@FindBy(xpath="//button[.//div[.//p[text()='Energy Storage System (ESS)']]]")WebElement EssBtn;
//@FindBy(xpath="//span[@class='_editButton_pkyov_37']")WebElement editEss;
@FindBy(xpath = "//button[.//p[text()='Energy Storage System (ESS)']]//span[contains(@class,'editButton')]")
WebElement editEss;
@FindBy(xpath="//input[@name='batteryCount']")WebElement Bcount;
@FindBy(xpath="(//button[@title='Open'])[1]")WebElement Bmanufacturer;
@FindBy(xpath="//div[text()=' New battery']")WebElement bm;
@FindBy(xpath="(//button[@title='Open'])[2]")WebElement midMenu;
@FindBy(xpath="//div[text()='Gateway 3']")WebElement MID;
@FindBy(xpath="(//button[@title='Open'])[3]")WebElement backupmenu;
@FindBy(xpath="//div[text()='Partial']")WebElement partial;
@FindBy(xpath="(//button[@title='Open'])[4]")WebElement ArbitrageMenu;
@FindBy(xpath="//div[text()='Grid Tied']")WebElement ArbitrageOpt;
@FindBy(xpath="(//button[@title='Open'])[5]")WebElement proposeMenu;
@FindBy(xpath="//div[text()='West Wall']")WebElement prOpt;
@FindBy(xpath="//textarea[@name='additionalEssNotes']")WebElement adNotes;
@FindBy(xpath="//button[text()='Update']")WebElement updateEss;
@FindBy(xpath="//a[text()='Back to Home']")WebElement backbtn;


//electrical Details
@FindBy(xpath="//button[.//div[.//p[text()='Electrical Details']]]")WebElement electrical;
@FindBy(xpath = "//button[.//p[text()='Electrical Details']]//span[contains(@class,'editButton')]")
WebElement editElec;
//@FindBy(xpath="//span[@class='_editButton_pkyov_37']")WebElement editELec;
@FindBy(xpath="(//button[@title='Open'])[9]")WebElement serviceMenu;
@FindBy(xpath="//div[text()='Overhead']")WebElement service;
@FindBy(xpath="(//button[@title='Open'])[10]")WebElement utility;
@FindBy(xpath="//div[text()='West Wall']")WebElement utilOpt;
@FindBy(xpath="(//button[@title='Open'])[11]")WebElement msp;
@FindBy(xpath="//div[text()='North Wall']")WebElement mspOpt;
@FindBy(xpath="(//button[@title='Open'])[12]")WebElement msprating;
@FindBy(xpath="//div[text()='100A']")WebElement msprOpt;
@FindBy(xpath="(//button[@title='Open'])[13]")WebElement mainBreaker;
@FindBy(xpath="//div[text()='125A']")WebElement mainOpt;
@FindBy(xpath="(//button[@title='Open'])[14]")WebElement mainService;
@FindBy(xpath="//div[text()='1PH']")WebElement mainsOpt;
@FindBy(xpath="(//button[@title='Open'])[15]")WebElement serviceVoltage;
@FindBy(xpath="//div[text()='120/240 1PH']")WebElement serviceOpt;
@FindBy(xpath="(//button[@title='Open'])[16]")WebElement feederType;
@FindBy(xpath="//div[text()='Aluminium']")WebElement feederOpt;
@FindBy(xpath="(//button[@title='Open'])[17]")WebElement pvLocatn;
@FindBy(xpath="//div[text()='Roof']")WebElement pvlOpt;
@FindBy(xpath="(//button[@title='Open'])[18]")WebElement pvPoint;
@FindBy(xpath="//div[text()='MSP']")WebElement pvpOpt;
@FindBy(xpath="(//input[@type='checkbox'])[2]")WebElement chk1;
@FindBy(xpath="//input[@name='mspSize']")WebElement sizeMsp;
@FindBy(xpath="(//input[@type='checkbox'])[3]")WebElement chk2;
@FindBy(xpath="//input[@name='mainBreakerDerateSize']")WebElement mainbreakers;
@FindBy(xpath="(//input[@type='checkbox'])[4]")WebElement chk3;
@FindBy(xpath="//textarea[@name='additionalElectricalNotes']")WebElement addtNotes;
@FindBy(xpath="(//button[text()='Update'])[3]")WebElement updateELec;

//structural Details
@FindBy(xpath="//button[.//div[.//p[text()='Structural Details']]]")WebElement structural;
//@FindBy(xpath="//span[@class='_editButton_pkyov_37']")WebElement sEdit;
@FindBy(xpath = "//button[.//p[text()='Structural Details']]//span[contains(@class,'editButton')]")
WebElement structuralEdit;
@FindBy(xpath="(//button[@title='Open'])[19]")WebElement roofmenu;
@FindBy(xpath="//div[text()='Tile-S']")WebElement roofOpt;
@FindBy(xpath="//input[@name='roofAge']")WebElement roofAge ;
@FindBy(xpath="(//button[@title='Open'])[20]")WebElement framing;
@FindBy(xpath="//div[text()='Truss']")WebElement frameopt ;
@FindBy(xpath="(//button[@title='Open'])[21]")WebElement rafterSize ;
@FindBy(xpath="//div[text()='2x2']")WebElement rafterOpt;
@FindBy(xpath="(//button[@title='Open'])[22]")WebElement rafterSpace ;
@FindBy(xpath="//div[text()='16']")WebElement rafterSOpt;
@FindBy(xpath="//textarea[@name='additionalFramingNotes']")WebElement addSNotes ;
@FindBy(xpath="(//button[text()='Update'])[4]")WebElement UpdateStr;


//Ev charger
@FindBy(xpath="(//input[@type='checkbox'])[2]")WebElement evChk ;
@FindBy(xpath="//button[.//div[.//p[text()='EV Charger']]]")WebElement EvClick;
@FindBy(xpath = "//button[.//p[text()='EV Charger']]//span[contains(@class,'editButton')]")
WebElement evEdit;
//@FindBy(xpath="//span[@class='_editButton_pkyov_37']")WebElement evEdit ;
@FindBy(xpath="(//button[@title='Open'])[1]")WebElement evMenu;
@FindBy(xpath="//div[text()=' New ev  charger']")WebElement evOpt ;
@FindBy(xpath="//input[@name='evChargerSize']")WebElement evChargerSize;
@FindBy(xpath="//textarea[@name='additionalEvNotes']")WebElement evNotes ;
@FindBy(xpath="//button[text()='Update']")WebElement updateEv;

//existing PV
@FindBy(xpath="(//input[@type='checkbox'])[3]")WebElement exChk;
@FindBy(xpath="//button[.//div[.//p[text()='Existing PV system']]]")WebElement existingPv;
@FindBy(xpath = "//button[.//p[text()='Existing PV system']]//span[contains(@class,'editButton')]")
WebElement editExistingPv;
@FindBy(xpath="//input[@name='existingModuleCount']")WebElement moduleC;
//@FindBy(xpath="//span[@class='_editButton_pkyov_37']")WebElement editExPv;
@FindBy(xpath="(//button[@title='Open'])[1]")WebElement Modulemenu ;
@FindBy(xpath="//div[text()='M1']")WebElement moduleOpt ;
@FindBy(xpath="//input[@name='inverterCount']")WebElement inverterC;
@FindBy(xpath="(//button[@title='Open'])[2]")WebElement ExInverter ;
@FindBy(xpath="//div[text()=' _new inverter11 ']")WebElement exIopt ;
@FindBy(xpath="(//button[@title='Open'])[3]")WebElement exNew ;
@FindBy(xpath="//div[text()='Separate']")WebElement exNewOpt;
@FindBy(xpath="(//button[@title='Open'])[4]")WebElement exbattery;
@FindBy(xpath="//div[text()=' _New battery 11']")WebElement exBatteryOpt ;
@FindBy(xpath="//textarea[@name='additionalExistingSystemNotes']")WebElement exSystemNotes;
@FindBy(xpath="//button[text()='Update']")WebElement updateEx ;

//

@FindBy(xpath="//button[.//div[.//p[text()='Existing Generator']]]")WebElement  exGenerator;
@FindBy(xpath = "//button[.//p[text()='Existing Generator']]//span[contains(@class,'editButton')]")
WebElement editExistingGenerator;
//@FindBy(xpath="//span[@class='_editButton_pkyov_37']")WebElement gManufacturer;
@FindBy(xpath="(//button[@title='Open'])[5]")WebElement Gmenu ;
@FindBy(xpath="//div[text()='Generator 1']")WebElement gManufacOpt ;
@FindBy(xpath="//input[@name='existingGeneratorAtsMtsModel']")WebElement atsMtsmodel;
@FindBy(xpath="//input[@name='existingGeneratorAtsMtsRating']")WebElement atsMtsRating;
@FindBy(xpath="//input[@name='existingGeneratorAtsMainBreaker']")WebElement AtsMainBreaker;
@FindBy(xpath="//input[@name='existingGeneratorMtsPortableBreaker']")WebElement mtsbreaker ;
@FindBy(xpath="//textarea[@name='additionalGeneratorNotes']")WebElement addGenNotes;
@FindBy(xpath="(//button[text()='Update'])[2]")WebElement updategen;

//additional details
@FindBy(xpath="//button[.//div[.//p[text()='Additional fields']]]") WebElement additional;
@FindBy(xpath="//div[@class='_mainContainer_4ta1u_1']")WebElement scroll;

@FindBy(xpath="//a[text()='Back to Home']")WebElement backtohome;

public void systemclick()

{
	system.click();	
}
public void pvdetails() throws InterruptedException
{
pvDetailBtn.click();
editPv.click();
moduleCount.sendKeys("2");
moduleMenu.click();
moduleM.click();
mWattage.sendKeys("240");
iCount.sendKeys("2");
iMenu.click();
iManufacture.click();
dc.sendKeys("240");
aProduction.sendKeys("20000");
aConsumption.sendKeys("15000");
sCost.sendKeys("20000");
addNotes.sendKeys("This is the notes for pv details");
Thread.sleep(2000);
updatePv.click();
}
public void rackingDetails() throws InterruptedException
{
Actions act=new Actions(driver);
racking.click();
editRack.click();
 act.moveToElement(rckmenu).click().perform();
 act.moveToElement(rail1).click().perform();
act.moveToElement(atMenu).click().perform();
act.moveToElement(at1).click().perform();
act.moveToElement(Rsize).click().perform();
act.moveToElement(size).click().perform();
rcnotes.sendKeys("This additional notes for racking details");
Thread.sleep(2000);
updateRc.click();

//backtohome.click();
}

public void energySS() throws InterruptedException
{
	Thread.sleep(1000);
	ess.click();
	EssBtn.click();
	Thread.sleep(1000);
	editEss.click();
	Bcount.sendKeys("2");;
	Bmanufacturer.click();
	bm.click();
	midMenu.click();
	MID.click();
	backupmenu.click();
	partial.click();
	ArbitrageMenu.click();
	ArbitrageOpt.click();

JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", scroll);

	proposeMenu.click();
	prOpt.click();
	adNotes.sendKeys("Additional notes for Ess");;
	updateEss.click();

}
public void electrical() throws InterruptedException
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", scroll);
electrical.click();
Thread.sleep(1000);
editElec.click();
Thread.sleep(1000);
serviceMenu.click();
service.click();
utility.click();
utilOpt.click();
msp.click();
mspOpt.click();
msprating.click();
msprOpt.click();
mainBreaker.click();
mainOpt.click();
mainService.click();
mainsOpt.click();
serviceVoltage.click();
serviceOpt.click();
feederType.click();
feederOpt.click();
pvLocatn.click();
pvlOpt.click();
pvPoint.click();
pvpOpt.click();
chk1.click();
sizeMsp.sendKeys("240");
chk2.click();
mainbreakers.sendKeys("240");
chk3.click();
addtNotes.sendKeys("Notes for electricals details");
updateELec.click();

}
public void structuralDetails() throws InterruptedException
{
	structural.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", scroll);
	Thread.sleep(1000);
   structuralEdit.click();
   Thread.sleep(1000);
	roofmenu.click();
	roofOpt.click();
	roofAge.sendKeys("20");
	framing.click();
	frameopt.click();
	rafterSize.click();
	rafterOpt.click();
	rafterSpace.click();
	rafterSOpt.click();
	addSNotes.sendKeys("Notes for Structural Details");
	
	UpdateStr.click();
}
public void evcharger() throws InterruptedException
{
evChk.click();
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", scroll);
Thread.sleep(1000);
EvClick.click();
Thread.sleep(1000);
evEdit.click();
Thread.sleep(1000);
evMenu.click();
evOpt.click();
evChargerSize.sendKeys("2000");
evNotes.sendKeys("Notes for EV details");
updateEv.click();
}
public void existingPv() throws InterruptedException
{
   
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", scroll);
	exChk.click();
	Thread.sleep(1000);
	existingPv.click();
	editExistingPv.click();
	Thread.sleep(1000);
	moduleC.sendKeys("1");
	Modulemenu.click();
	moduleOpt.click();
	inverterC.sendKeys("1");
	ExInverter.click();
	exIopt.click();
	exNew.click();
	exNewOpt.click();
	exbattery.click();
	exBatteryOpt.click();
	exSystemNotes.sendKeys("Notes for Existing PV");
	updateEx.click();
}
public void generator() throws InterruptedException
{
	exGenerator.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", scroll);
	Thread.sleep(1000);
	editExistingGenerator.click();
	Gmenu.click();
	gManufacOpt.click();
	Thread.sleep(1000);
	atsMtsmodel.sendKeys("MODEL 02");
    atsMtsRating.sendKeys("20");
    AtsMainBreaker.sendKeys("240");
    mtsbreaker.sendKeys("Existing breaker");
    addGenNotes.sendKeys("Notes for Existing generator");
    updategen.click();	
}
}
