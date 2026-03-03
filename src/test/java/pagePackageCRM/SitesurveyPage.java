package pagePackageCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SitesurveyPage 
{
	WebDriver driver;
public SitesurveyPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//button[.//div[text()='Site Survey']]")WebElement sitesurvey;
public void sitesurvey()
{
sitesurvey.click();	
}


}
