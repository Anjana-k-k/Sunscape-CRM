package pagePackageCRM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class FilesPage 
{
  WebDriver driver;
  public FilesPage(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
  }
  @FindBy(xpath="//button[.//div[text()='Files']]") WebElement filesOpt;
  @FindBy(xpath="//button[.//span[text()='Upload']]")WebElement uploadBtn;
  @FindBy(xpath="//button[text()='Select file']")WebElement selectFile;
  @FindBy(xpath="(//button[.//span[text()='Upload']])[2]")WebElement upload;
  @FindBy(xpath="(//button[@aria-label='more'])[5]")WebElement more;
  @FindBy(xpath="//li[text()='Download']")WebElement download;
  @FindBy(xpath="//li[text()='Delete']")WebElement delete;
  @FindBy(xpath="//button[text()='Delete']")WebElement deleteOpt;
  @FindBy(xpath="//button[text()='New Folder']")WebElement newFolder;
  @FindBy(xpath="//input[@placeholder='Folder Name']")WebElement fName;
  @FindBy(xpath="//span[@class='_greenTick_h8cmp_49']")WebElement tick;
  @FindBy(xpath="(//button[@aria-label='more'])[6]")WebElement folderMenu;
  @FindBy(xpath="//li[text()='Download']")WebElement downloadFolder;
  @FindBy(xpath="//li[text()='Delete']")WebElement deletefolder;
  @FindBy(xpath="//button[text()='Delete']")WebElement deleteOpt1;
  @FindBy(xpath="//div[@class='_mainContainer_4ta1u_1']")WebElement scroll;
  public void clickfile()
  {
	  filesOpt.click();
  }
  public void robocls() throws AWTException, InterruptedException
  {
	  uploadBtn.click();
	  selectFile.click();
	  fileupload("C:\\Users\\kanjana\\Downloads\\BOM (14).pdf");
      Thread.sleep(2000);
      upload.click();
      
  }
  private void fileupload(String fp) throws AWTException
  {
      StringSelection str = new StringSelection(fp);
      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

      Robot ob = new Robot();
      ob.delay(2000);

      ob.keyPress(KeyEvent.VK_CONTROL);
      ob.keyPress(KeyEvent.VK_V);
      ob.keyRelease(KeyEvent.VK_V);
      ob.keyRelease(KeyEvent.VK_CONTROL);

      ob.delay(1000);

      ob.keyPress(KeyEvent.VK_ENTER);
      ob.keyRelease(KeyEvent.VK_ENTER);
  }
public void filedwnld() throws InterruptedException
{
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
wait.until(ExpectedConditions.visibilityOf(more)).click();
download.click();
Thread.sleep(2000);
}
//public void deleteFile()
//{
//more.click();
//delete.click();
//deleteOpt.click();
//}
public void newfolders()
{
newFolder.click();
fName.sendKeys("Folder 2");
tick.click();

folderMenu.click();
downloadFolder.click();
}
public void deletefolders() throws InterruptedException
{
//	JavascriptExecutor js=(JavascriptExecutor)driver;
//	js.executeScript("window.scrollBy(0,800)","");
	Thread.sleep(1000);
folderMenu.click();
deletefolder.click();
deleteOpt1.click();
}


}
