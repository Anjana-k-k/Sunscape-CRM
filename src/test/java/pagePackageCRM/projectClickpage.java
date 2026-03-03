package pagePackageCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class projectClickpage 
{
	WebDriver driver;
	public projectClickpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//a[.//span[text()='Projects']]")WebElement prjClick;
@FindBy(xpath="//p[text()='Anjana K K']")WebElement prj;
	public void prjClick()
	{
		prjClick.click();
	}
	public void openProject()
	{
		prj.click();
	}
}
