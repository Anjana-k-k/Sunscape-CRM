package pagePackageCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuperdashboardPage 
{
 WebDriver driver;
 public SuperdashboardPage(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
 }
 @FindBy(xpath="//a[.//span[text()='Super Dashboard']]")WebElement sDashboard;
 @FindBy(xpath="//span[text()='All selected']")WebElement allMenu;
 @FindBy(xpath="(//input[@class='PrivateSwitchBase-input css-j8yymo'])[1]")WebElement selectAll;
 @FindBy(xpath="(//input[@class='PrivateSwitchBase-input css-j8yymo'])[2]")WebElement org1;
 @FindBy(xpath="//button[text()='Apply']")WebElement apply;
 
 public void dashboardClick()
 {
	sDashboard.click(); 
 }
 public void selectOrg()
 {
	 allMenu.click();
	 selectAll.click();
	 org1.click();
	 apply.click();
 }
}
