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
@FindBy(xpath="//p[text()='Anjana K K']")WebElement prj;
@FindBy(xpath="//button[text()='Add Multiple Stages']")WebElement addMultiStg;
@FindBy(xpath="(//span[.//input[@name='gilad']])[2]")WebElement stg1;
@FindBy(xpath="(//span[.//input[@name='gilad']])[3]")WebElement stg2;
@FindBy(xpath="(//span[.//input[@name='gilad']])[4]")WebElement stg3;
public void prjClick()
{
	prjClick.click();
}
public void openProject()
{
	prj.click();
	addMultiStg.click();
	stg1.click();
	stg2.click();
	stg3.click();
	
}

}
