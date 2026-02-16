package pagePackageCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectPage 
{
	WebDriver driver;
	public ProjectPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//a[.//span[text()='Projects']]")WebElement prjClick;
@FindBy(xpath="//a[@href='/projects/8964?statusId=7455']")WebElement prj;

}
