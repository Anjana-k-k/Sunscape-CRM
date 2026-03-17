package pagePackageCRM;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PermittingPage 
{
WebDriver driver;
public PermittingPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//button[.//div[text()='Permitting']]") WebElement permittingBtn;
@FindBy(xpath="//div[@class='_buttonContainer_19xap_22']")WebElement editAhj;
@FindBy(xpath="//button[@aria-label='Open']")WebElement ahjName;
@FindBy(xpath="//li[text()='Hocking County']")WebElement opt;
@FindBy(xpath="//span[text()='Permit Required?']/following::textarea[@class='_input_19xap_115 _textarea_19xap_131']") WebElement permit;
@FindBy(xpath="//span[text()='General Requirements']/following::textarea[@class='_input_19xap_115 _textarea_19xap_131']")WebElement general;
@FindBy(xpath="//div[@class='_buttonContainer_19xap_22']//span[@class='_saveButton_19xap_31']")WebElement save;

@FindBy(xpath="//span[@class='_editButton_i7bns_37']")WebElement editPermit;
@FindBy(xpath="//span[text()='Permit Submitted Date']/following::input[contains(@class,'form_date_picker')][1]")WebElement psDate;
@FindBy(xpath = "//h2[contains(@class,'react-datepicker__current-month')]")
WebElement monthYear1;

@FindBy(xpath = "//span[contains(@class,'react-datepicker__navigation-icon--next')]")WebElement nextArrow1;

@FindBy(xpath = "//div[contains(@class,'react-datepicker__day') and not(contains(@class,'outside-month'))]")
List<WebElement> allDate1;
@FindBy(xpath="//span[text()='Permitting Follow Up Date']/following::input[contains(@class,'form_date_picker')][1]")WebElement pfdate;
@FindBy(xpath="//span[@class='react-datepicker__navigation-icon react-datepicker__navigation-icon--next']")WebElement nextArrow2;
@FindBy(xpath="//span[@class='react-datepicker__navigation-icon react-datepicker__navigation-icon--next']")WebElement nextArrow3;
@FindBy(xpath="//span[text()='ETA for Permit Approval Date']/following::input[contains(@class,'form_date_picker')][1]")WebElement ETAdate;
@FindBy(xpath="//span[text()='Permit Approved Date']/following::input[contains(@class,'form_date_picker')][1]")WebElement pAdate;
@FindBy(xpath="//span[text()='Permit Rejected Date']/following::input[contains(@class,'form_date_picker')][1]")WebElement prjdate;
@FindBy(xpath="//span[text()='Permit Resubmitted Date']/following::input[contains(@class,'form_date_picker')][1]")WebElement prsdate;
@FindBy(xpath="//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium _saveButton_i7bns_30 css-mfslm7']")
WebElement save2;
@FindBy(xpath="//div[@class='_mainContainer_4ta1u_1']")WebElement scroll;
@FindBy(xpath="//span[text()='Building Permit Number']")WebElement buildingpermit;
@FindBy(xpath="//span[text()='Electrical Permit Number']")WebElement electricatpermit;
@FindBy(xpath="//span[text()='Zoning Permit Number']")WebElement zoningPermit;
@FindBy(xpath="//span[text()='Building Permit Cost']")WebElement buildingcost;
@FindBy(xpath="//span[text()='Electrical Permit Cost']")WebElement electricalcost;
@FindBy(xpath="//span[text()='Zoning Permit Cost']")WebElement zoningcost;
@FindBy(xpath="//span[text()='Other Permit Number']")WebElement otherPermit;
@FindBy(xpath="//span[text()='Other Permit Cost']")WebElement otherPermitcost;
@FindBy(xpath="//span[text()='Permitting Notes']")WebElement othernotes;
@FindBy(xpath="//span[text()='Permit Rejection Reason']")WebElement reason;
public void permitClick()
{
permittingBtn.click();	
}
public void ahjDetails() throws InterruptedException
{
 editAhj.click();
 Thread.sleep(1000);
 ahjName.click();
 opt.click();
 permit.sendKeys("Yes");
 general.sendKeys("general requirements");
save.click();
}

public void permitting() throws InterruptedException
{
Thread.sleep(1000);
editPermit.click();
psDate.click();
selectDueDate1("February 2026", "10");
Thread.sleep(1000);
pfdate.click();
selectDueDate2("February 2026", "12");
Thread.sleep(1000);
ETAdate.click();
selectDueDate2("February 2026", "12");
Thread.sleep(1000);
pAdate.click();
selectDueDate2("February 2026", "12");
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,500)");
Thread.sleep(1000);
prjdate.click();
selectDueDate2("February 2026", "12");
Thread.sleep(1000);
prsdate.click();
selectDueDate2("February 2026", "12");
Actions act=new Actions(driver);
act.moveToElement(buildingpermit).sendKeys("343243303").perform();
 act.moveToElement(electricatpermit).sendKeys("5678647980").perform();
 Thread.sleep(1000);
 act.moveToElement(zoningPermit).sendKeys("4578765407").perform();
 act.moveToElement(buildingcost).sendKeys("300000").perform();
 act.moveToElement(electricalcost).sendKeys("300000").perform();
 act.moveToElement(zoningcost).sendKeys("300000").perform();
 act.moveToElement(otherPermit).sendKeys("345678765").perform();
 act.moveToElement(otherPermitcost).sendKeys("300000").perform();
act.moveToElement(othernotes).sendKeys("permitting Notes").perform();
act.moveToElement(reason).sendKeys("reason for rejection").perform();
act.moveToElement(save2).click().perform();
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
    new Actions(driver).sendKeys("\t").perform();
    Thread.sleep(500);
}


public void selectDueDate2(String expectedMonthYear, String day) throws InterruptedException 
{
    while (!monthYear1.getText().trim().equals(expectedMonthYear)) 
    {
        nextArrow2.click();
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
    new Actions(driver).sendKeys("\t").perform();
    Thread.sleep(500);
}

}