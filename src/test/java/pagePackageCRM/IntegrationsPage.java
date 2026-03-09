package pagePackageCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IntegrationsPage
{
 WebDriver driver;
 public IntegrationsPage(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
 }
 
 @FindBy(xpath="//button[.//span[text()='Integrations']]")WebElement integration;
 @FindBy(xpath="(//input[@class='PrivateSwitchBase-input MuiSwitch-input css-j8yymo'])[1]")WebElement twilio;
 @FindBy(xpath="//div[text()='Twilio']")WebElement Opentwilio;
 @FindBy(xpath="//a[text()=' Twilio']")WebElement twilioBackBtn;
 @FindBy(xpath="(//input[@class='PrivateSwitchBase-input MuiSwitch-input css-j8yymo'])[2]")WebElement sitesurvey;
 @FindBy(xpath="(//input[@class='PrivateSwitchBase-input MuiSwitch-input css-j8yymo'])[3]")WebElement FCD;
 @FindBy(xpath="(//input[@class='PrivateSwitchBase-input MuiSwitch-input css-j8yymo'])[4]")WebElement zapier;
 @FindBy(xpath="(//input[@class='PrivateSwitchBase-input MuiSwitch-input css-j8yymo'])[5]")WebElement subcontractor;
 @FindBy(xpath="(//input[@class='PrivateSwitchBase-input MuiSwitch-input css-j8yymo'])[6]")WebElement artemis;
 @FindBy(xpath="(//input[@class='PrivateSwitchBase-input MuiSwitch-input css-j8yymo'])[7]")WebElement scanifly;
 
 public void clickIntegration() throws InterruptedException
 {
	 integration.click();
	 twilio.click();
     Thread.sleep(1000);
	 sitesurvey.click();
	 Thread.sleep(1000);
	 FCD.click();
	 Thread.sleep(1000);
	 zapier.click();
	 Thread.sleep(1000);
	 subcontractor.click();
	 Thread.sleep(1000);
	 artemis.click();
	 Thread.sleep(1000);
	 scanifly.click();
 }
}
