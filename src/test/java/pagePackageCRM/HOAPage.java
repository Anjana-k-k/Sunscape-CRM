package pagePackageCRM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HOAPage 
{
	WebDriver driver;
	public HOAPage(WebDriver driver)
	{
	this.driver=driver;
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//button[.//div[text()='HOA']]")WebElement hoaOpt;
@FindBy(xpath="//div[.//h4[text()='HOA Details']]//span[contains(@class,'_editButton')]")WebElement editHoa;
@FindBy(xpath="//input[@type='checkbox']")WebElement chk;
@FindBy(xpath="//button[@aria-label='Open']")WebElement hoaMenu;
@FindBy(xpath="//div[text()='Contacted']")WebElement hoaOptn;
@FindBy(xpath="//input[@name='hoaName']")WebElement hoaName;
@FindBy(xpath="//input[@name='hoaContactName']")WebElement ctname;
@FindBy(xpath="//input[@name='hoaManagementCompany']")WebElement company;
@FindBy(xpath="//span[text()='HOA Submitted Date']/following::input[contains(@class,'form_date_picker')]")WebElement hoadate;
@FindBy(xpath="//span[text()='HOA Resubmitted Date']/following::input[contains(@class,'form_date_picker')]")WebElement resubmitDate;
@FindBy(xpath="//span[text()='HOA Approved Date']/following::input[contains(@class,'form_date_picker')]")WebElement approvalDAte;
@FindBy(xpath="//input[@name='hoaPhone']")WebElement phone;
@FindBy(xpath="//input[@name='hoaEmail']")WebElement email;
@FindBy(xpath="//textarea[@name='hoaNotes']")WebElement notes;
@FindBy(xpath="//input[@name='hoaFees']")WebElement fees;
@FindBy(xpath="//button[contains(@class,'_saveButton')]")WebElement saves;


@FindBy(xpath = "//h2[contains(@class,'react-datepicker__current-month')]")WebElement monthYear1;
@FindBy(xpath = "//button[.//span[text()='Previous Month']]")WebElement nextArrow1;
@FindBy(xpath="//span[contains(@class,'react-datepicker__navigation-icon--next')]")WebElement nextarrow2;
@FindBy(xpath = "//div[contains(@class,'react-datepicker__day') and not(contains(@class,'outside-month'))]")List<WebElement> allDate1;
public void hoaClick()
{
hoaOpt.click();	
}
public void hoaUpdate() throws InterruptedException
{
	editHoa.click();
	chk.click();
	hoaMenu.click();
	hoaOptn.click();
	hoaName.clear();
	hoaName.sendKeys("Hoa name_");
	ctname.clear();
	ctname.sendKeys("HOA Conatct Name");
	company.clear();
	company.sendKeys("company name");
	phone.clear();
	phone.sendKeys("6786839397");
	email.clear();
	email.sendKeys("abc@gmail.com");
	hoadate.click();
	selectDueDate2("February 2026", "1");
	resubmitDate.click();
	selectDueDate2("February 2026", "4");
	approvalDAte.click();
	selectDueDate2("February 2026", "5");
	fees.sendKeys("300000");
	notes.clear();
	notes.sendKeys("Notes for HOA");
	saves.click();
	
}
public void selectDueDate2(String expectedMonthYear, String day) throws InterruptedException 
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
}
