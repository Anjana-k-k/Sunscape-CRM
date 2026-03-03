package pagePackageCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoAssignProjectPage
{
WebDriver driver;
public AutoAssignProjectPage(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver,this);
}
@FindBy(xpath="//button[text()='+']")WebElement autoAssign;
@FindBy(xpath="//div[@id='status-select']")WebElement status;
@FindBy(xpath="//li[text()='NEW']")WebElement statusOpt;
@FindBy(xpath="//label[text()='Enter username']/following::input[@type='text' and @required][1]")WebElement username;
@FindBy(xpath="//li[text()='Gokul - Krishna']")WebElement user;
@FindBy(xpath="//button[.//span[text()='Save']]")WebElement save;

@FindBy(xpath="//button[.//div[text()='Group']]")WebElement group;
@FindBy(xpath="//label[text()='Enter group name']/following::input[@type='text' and @required][1]")WebElement grpMenu;
@FindBy(xpath="//li[text()='Account Manager']")WebElement grpOpt;
@FindBy(xpath="//span[@class='_modalHeaderButton_1f8j3_21']")WebElement close;

public void user()
{
autoAssign.click();
status.click();
statusOpt.click();
username.click();
user.click();
save.click();
}
public void group() throws InterruptedException
{
	group.click();
	status.click();
	statusOpt.click();
	grpMenu.click();
	grpOpt.click();
	Thread.sleep(1000);
	save.click();
	Thread.sleep(1000);
	close.click();
}
}
