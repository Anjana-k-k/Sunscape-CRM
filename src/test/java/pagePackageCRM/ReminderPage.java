package pagePackageCRM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReminderPage 
{
WebDriver driver;
public ReminderPage(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver,this);
}
@FindBy(xpath="//button[.//div[text()='Reminder']]")WebElement reminder;
@FindBy(xpath="//button[text()='Reminder']")WebElement addReminder;
@FindBy(xpath="(//input[@type='text'])[4]")WebElement timeInput;
@FindBy(xpath="//ul[@class='react-datepicker__time-list']")WebElement scroll;
@FindBy(xpath="//li[text()='5:00 PM']") WebElement time;
@FindBy(xpath="//textarea[@name='message']")WebElement description;
@FindBy(xpath="//button[.//span[text()='Create']]")WebElement create;
public void reminders()
{
	driver.navigate().refresh();
	reminder.click();
    addReminder.click();
    timeInput.click();
    time.click();
    description.sendKeys("This is a description for Reminder");
    create.click();
}
}
