package pagePackageCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertydetailsPage 
{
WebDriver driver;
public PropertydetailsPage(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver,this);
}
@FindBy(xpath="//h4[normalize-space()='Property Details']/following-sibling::span[contains(@class,'editButton')]")WebElement PropertyEdit;
@FindBy(xpath="//span[normalize-space()='Property Type']/following::input")WebElement propertyType;
@FindBy(xpath="//span[normalize-space()='Year Built']/following::input")WebElement yearbuilt;
@FindBy(xpath="//span[normalize-space()='Area']/following::input")WebElement area;
@FindBy(xpath="//span[normalize-space()='Home Type']/following::input")WebElement homeType;
@FindBy(xpath="//span[normalize-space()='Architectural Style']/following::input")WebElement style;
@FindBy(xpath="//span[normalize-space()='Foundation']/following::input")WebElement foundation ;
@FindBy(xpath="//span[normalize-space()='Roof']/following::input")WebElement roof ;
@FindBy(xpath="//span[normalize-space()='Wall']/following::input")WebElement wall;
@FindBy(xpath="//div[contains(@class,'_buttonContainer')]//span[contains(@class,'_saveButton')]")WebElement save;

public void propertyDetails()
{
PropertyEdit.click();
propertyType.sendKeys("Type 1");
yearbuilt.sendKeys("2006");
area.sendKeys("Area 1");
homeType.sendKeys("Home Type 1");
style.sendKeys("style 1");
foundation.sendKeys(" foundation 1");
roof.sendKeys("roof 1");
wall.sendKeys("Wall 1");
save.click();
}
}