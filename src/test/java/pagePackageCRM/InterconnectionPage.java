package pagePackageCRM;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InterconnectionPage 
{
WebDriver driver;
public InterconnectionPage(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver,this);
}
@FindBy(xpath="//button[.//div[text()='Interconnection']]")WebElement intercntn;
@FindBy(xpath="//span[@class='_editButton_167q4_37']")WebElement editUtil;
@FindBy(xpath="//button[@aria-label='Open']")WebElement utilbtn;
@FindBy(xpath="//li[text()='South Central']")WebElement utilOpt;
//@FindBy(xpath="//span[text()='PV Meter Required?']")WebElement pvMeter;
@FindBy(xpath="(//div[.//span[text()='Battery Allowed?']]//textarea[@class='_input_167q4_119 _textarea_167q4_135'])[2]")WebElement battery;
@FindBy(xpath="//div[@class='_buttonContainer_167q4_21']//span[@class='_saveButton_167q4_30']")WebElement saveU;
@FindBy(xpath="(//div[.//h4[text()='Interconnection']]//span[contains(@class,'_editButton')])[2]")WebElement ic;
@FindBy(xpath = "//h2[contains(@class,'react-datepicker__current-month')]")WebElement monthYear1;
@FindBy(xpath = "//button[.//span[text()='Previous Month']]")WebElement nextArrow1;
@FindBy(xpath="//span[contains(@class,'react-datepicker__navigation-icon--next')]")WebElement nextarrow2;
@FindBy(xpath = "//div[contains(@class,'react-datepicker__day') and not(contains(@class,'outside-month'))]")List<WebElement> allDate1;
@FindBy(xpath="//span[text()='Interconnection Submitted Date ']/following::input[contains(@class,'form_date_picker')]")WebElement Isd;
@FindBy(xpath="//span[text()='Interconnection Follow Up Date']/following::input[contains(@class,'form_date_picker')]")WebElement Ifd;
@FindBy(xpath="//span[text()='ETA for Interconnection Approval Date']/following::input[contains(@class,'form_date_picker')]") WebElement etaD;
@FindBy(xpath="//span[text()='Interconnection Approved Date']/following::input[contains(@class,'form_date_picker')]")WebElement iad;
@FindBy(xpath="//span[text()='Interconnection Rejected Date']/following::input[contains(@class,'form_date_picker')]")WebElement ird;
@FindBy(xpath="//span[text()='Interconnection Resubmitted Date']/following::input[contains(@class,'form_date_picker')]")WebElement ResubmitDate;
@FindBy(xpath="//input[@name='interconnectionApplicationNumber']")WebElement InterconnectnNbr;
@FindBy(xpath="//input[@name='interconnectionApplicationCost']")WebElement IntercntnCost;
@FindBy(xpath="//input[@name='interconnectionRejectionReason']")WebElement rejectReasn;
@FindBy(xpath="//input[@name='interconnectionNotes']")WebElement notes;
@FindBy(xpath="(//button[contains(@class,'_saveButton')])[1]")WebElement saveI;
@FindBy(xpath="(//div[.//h4[text()='PTO']]//span[contains(@class,'_editButton')])[3]")WebElement EditPto;
@FindBy(xpath="//span[text()='PTO Submitted Date']/following::input[contains(@class,'form_date_picker')]")WebElement ptoDate;
@FindBy(xpath="//span[text()='PTO Follow Up Date']/following::input[contains(@class,'form_date_picker')]")WebElement followDate;
@FindBy(xpath="//span[text()='ETA for PTO Approval Date']/following::input[contains(@class,'form_date_picker')]")WebElement etaDate;
@FindBy(xpath="//span[text()='PTO Approved Date']/following::input[contains(@class,'form_date_picker')]")WebElement ApprovalDAte;
@FindBy(xpath="//span[text()='PTO Rejection Date']/following::input[contains(@class,'form_date_picker')]")WebElement rejectnDate;
@FindBy(xpath="//span[text()='PTO Rejection Resubmitted Date']/following::input[contains(@class,'form_date_picker')]")WebElement resubmit;
@FindBy(xpath="//input[@name='ptoRejectionReason']")WebElement reason;
@FindBy(xpath="(//button[contains(@class,'_saveButton')])[1]")WebElement savePTO;
@FindBy(xpath="//div[@class='_mainContainer_4ta1u_1']")WebElement scroll;

public void interconnectionClick()
{
intercntn.click();
}

public void utility() throws InterruptedException
{ 
	Thread.sleep(1000);
	editUtil.click();
	utilbtn.click();
	utilOpt.click();
	battery.clear();
    battery.sendKeys("yes");
    saveU.click();
}
public void interconnectiondata() throws InterruptedException
{
Thread.sleep(1000);
ic.click();
Isd.clear();
Isd.click();
selectDueDate1("February 2026", "1");
Ifd.clear();
Ifd.click();
selectDueDate2("February 2026", "2");
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", scroll);

etaD.clear();
etaD.click();
selectDueDate2("February 2026", "3");
iad.clear();
iad.click();
selectDueDate2("February 2026", "4");
ird.clear();
ird.click();
selectDueDate2("February 2026", "5");
ResubmitDate.click();
selectDueDate2("February 2026", "7");
InterconnectnNbr.sendKeys("2324544620");
IntercntnCost.sendKeys("20000");
rejectReasn.sendKeys(" Reason for rejection");
notes.sendKeys("Notes for Interconnection");
Thread.sleep(1000);
//Actions ac=new Actions(driver);
//ac.moveToElement(saveI).click().perform();
saveI.click();
}
public void selectDueDate1(String expectedMonthYear, String day) throws InterruptedException 
{
    while (!monthYear1.getText().trim().equals(expectedMonthYear)) 
    {
        nextArrow1.click();
    }
  
    for (WebElement date :allDate1)
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
 
public void selectDueDate2(String expectedMonthYear, String day) throws InterruptedException 
{
    while (!monthYear1.getText().trim().equals(expectedMonthYear)) 
    {
        nextarrow2.click();
    }
  
    for (WebElement date :allDate1)
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
public void ptoDetails() throws InterruptedException
{
Thread.sleep(1000);
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", scroll);
//js.executeScript("window.scrollBy(0,600)",scroll);
EditPto.click();
ptoDate.click();
selectDueDate2("February 2026", "3");
followDate.click();
selectDueDate2("February 2026", "6");
etaDate.click();
selectDueDate2("February 2026", "5");
ApprovalDAte.click();
selectDueDate2("February 2026", "7");
rejectnDate.click();
selectDueDate2("February 2026", "18");
resubmit.click();
selectDueDate2("February 2026", "17");
Thread.sleep(1000);
reason.sendKeys("Reason for rejection");
savePTO.click();
}
}
