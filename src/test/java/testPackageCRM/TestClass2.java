package testPackageCRM;

import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePackage.BaseClassCRM;
import pagePackageCRM.ChecklistPage;
import pagePackageCRM.FilesPage;
import pagePackageCRM.LeadPage;
import pagePackageCRM.LoginPage;
import pagePackageCRM.MaterialsProjectPage;
import pagePackageCRM.MyOrganization;
import pagePackageCRM.ProjectCreatePage;
import pagePackageCRM.PropertydetailsPage;
import pagePackageCRM.projectClickpage;
import pagePackageCRM.systemDetailsPage;
import utilityPackageCRM.CreatepageUtility;
import utilityPackageCRM.LoginUtility;

public class TestClass2 extends BaseClassCRM
{
	@DataProvider(name = "loginData")
	 public Object[][] getData() 
	  {
		return LoginUtility.getExcelData("./testdata/LoginData.xlsx","Sheet1");
	  }
		@Test(dataProvider = "loginData", priority = 1,enabled = true)
		public void loginUsingExcel(String url, String user, String pass) 
		{
			isLoginSuccessful = false; 
		    LoginPage login = new LoginPage(driver);
		    login.openUrl(url);
		    login.login(user, pass);

		    if (login.isLoginSuccessful()) 
		    {
		        isLoginSuccessful = true;
		        test.pass("Login successful");
		    } 
		    else 
		    {
		        test.fail("Login failed");
		        throw new AssertionError("Login failed");
		    }
		}

//		@DataProvider(name = "projectData")
//		public Object[][] projectData()
//		{
//		    return CreatepageUtility.getProjectData("./testdata/CreateProjectData.xlsx", "Sheet1");
//		}
//
//		@Test(dataProvider = "projectData", priority = 2,enabled = true)
//		public void createProjectUsingExcel(String location, String fname, String lname,String email, String phone, String description) throws InterruptedException 
//		{
//		    if (!isLoginSuccessful) 
//		    {
//		        throw new SkipException("Skipping Project Creation: Login failed");
//		    }
//		    ProjectCreatePage project = new ProjectCreatePage(driver);
//		    project.createPrjtClick();
//		    project.createProject(location, fname, lname, email, phone, description);
//		}
		
		@Test(priority = 2,enabled = true)
		public void myOrganizationTest() 
		{
		    if (!isLoginSuccessful)
		    {
		        throw new SkipException("Skipping My Organization test: Login failed");
		    }
		    MyOrganization myOrg = new MyOrganization(driver);
		    driver.navigate().refresh();
		    try 
		    {
		        test.info("Clicking on My Organization");
		        myOrg.myOrgClick();
		        test.pass("My Organization page opened successfully");

		    } catch (Exception e) {
		        test.fail("My Organization test failed: " + e.getMessage());
		        throw new RuntimeException(e);
		    }
		}
		
		@Test(priority = 3,enabled = true)
		public void checklistTest() throws Exception {
	
		    if (!isLoginSuccessful) {
		        throw new SkipException("Skipping Checklist test: Login failed");
		    }
	        driver.navigate().refresh();
		    ChecklistPage checklist = new ChecklistPage(driver);
	
		    try {
		        test.info("Opening Checklist module");
		        checklist.checklistClick();
		        test.pass("checklist Opened successfully");
	
		        checklist.permit();
		        test.pass("Permit checklist filled successfully");
	            checklist.contractordetails();
	       
		    } catch (Exception e) {
		        test.fail("Checklist test failed: " + e.getMessage());
		        throw e;
		    }
		}
}
