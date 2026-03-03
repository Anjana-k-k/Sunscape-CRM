package pagePackageCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityPage
{
WebDriver driver;
public ActivityPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//button[.//div[text()='Activity']]")WebElement activityOpt;
@FindBy(xpath="//button[text()='Activity']")WebElement activity;
@FindBy(xpath="//button[text()='Project Progress']")WebElement progress;
@FindBy(xpath="//span[@class='MuiAccordionSummary-expandIconWrapper css-f8wb7g']")WebElement stages;
public void activities() throws InterruptedException
{
activityOpt.click();
activity.click();
Thread.sleep(1000);
progress.click();
stages.click();

}
}
