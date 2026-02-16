package pagePackageCRM;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProjectCreatePage 
{
	    WebDriver driver;
	 
	    @FindBy(xpath = "/html/body/div[1]/div[4]/div[2]/div[1]/div[1]/div[3]/button[2]")WebElement createPrjBtn;
	    @FindBy(xpath = "//input[@value='residential']")WebElement radioBtn;
	    @FindBy(xpath = "//input[@placeholder='Search Address Here ...']")WebElement srch;
	    @FindBy(xpath="//li[text()='South Alley']")WebElement place;
	    @FindBy(xpath="//input[@name='customerInfo.pContact.firstName']") WebElement firstName;
	    @FindBy(xpath="//input[@name='customerInfo.pContact.lastName']")WebElement lastname;
	    @FindBy(xpath="//input[@name='customerInfo.pContact.email']") WebElement email;
	    @FindBy(xpath="//input[@placeholder='Phone Number']")WebElement Phno;
	    @FindBy(xpath="//button[text()='Next']")WebElement nextBtn;
	    @FindBy(xpath="//input[@placeholder='Due date']") WebElement dueDate;
	    @FindBy(xpath = "//h2[@class='react-datepicker__current-month']")WebElement monthYear;
	    @FindBy(xpath = "//button[@aria-label='Next Month']")WebElement nextArrow;
	    @FindBy(xpath = "//div[@class='react-datepicker__month']")List<WebElement> allDates;
	    @FindBy(xpath="//textarea[@name='description']")WebElement description;
	    @FindBy(xpath="//button[text()='Save']")WebElement save;
	    @FindBy(xpath="//p[text()='Project Assigning']")WebElement textreturn; 
	   // @FindBy(xpath="/html/body/div/div[4]/div[2]/a")WebElement backtohome;
	    
	    public ProjectCreatePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	 
	    public void createPrjtClick()
	    {
	    	createPrjBtn.click();
	    	String exptext="Add Project Details";
	    	String act=textreturn.getText();
	    	System.out.println(act);
	    	Assert.assertEquals(exptext, act);    
	    }
	        public void createProject(String location,String fname,String lname,String emailId, String phone,String descriptionText) throws InterruptedException 
	        {
	            radioBtn.click();
	            Thread.sleep(1000);
	            srch.sendKeys(location);
	            new Actions(driver).moveToElement(place).click().perform();
	            srch.sendKeys(Keys.ENTER);
	            firstName.sendKeys(fname);
	            lastname.sendKeys(lname);
	            email.sendKeys(emailId);
	            Phno.sendKeys(phone);
	            nextBtn.click();
	            dueDate.click();
	            selectDueDate("March 2026","8");
	            description.sendKeys(descriptionText);

	            save.click();
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
	   
	
}
