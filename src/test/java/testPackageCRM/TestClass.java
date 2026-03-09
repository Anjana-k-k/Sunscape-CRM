package testPackageCRM;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePackage.BaseClassCRM;
import pagePackageCRM.ActivityPage;
import pagePackageCRM.AddFinance;
import pagePackageCRM.AutoAssignProjectPage;
import pagePackageCRM.ChecklistPage;
import pagePackageCRM.FilesPage;
import pagePackageCRM.FinancePage;
import pagePackageCRM.GroupsPage;
import pagePackageCRM.HOAPage;
import pagePackageCRM.IntegrationsPage;
import pagePackageCRM.InterconnectionPage;
import pagePackageCRM.LeadPage;
import pagePackageCRM.LoginPage;
import pagePackageCRM.MaterialsPage;
import pagePackageCRM.MaterialsProjectPage;
import pagePackageCRM.MyOrganization;
import pagePackageCRM.OfficeAndSource;
import pagePackageCRM.PermittingPage;
import pagePackageCRM.ProjectCreatePage;
import pagePackageCRM.ProjectPage;
import pagePackageCRM.PropertydetailsPage;
import pagePackageCRM.ReminderPage;
import pagePackageCRM.RolesPage;
import pagePackageCRM.StackholdersPage;
import pagePackageCRM.SuperdashboardPage;
import pagePackageCRM.UsersPage;
import pagePackageCRM.WorkflowPage;
import pagePackageCRM.projectClickpage;
import pagePackageCRM.systemDetailsPage;
import utilityPackageCRM.CreatepageUtility;
import utilityPackageCRM.LoginUtility;
class TestClass extends BaseClassCRM
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

	@DataProvider(name = "projectData")
	public Object[][] projectData()
	{
	    return CreatepageUtility.getProjectData("./testdata/CreateProjectData.xlsx", "Sheet1");
	}

	@Test(dataProvider = "projectData", priority = 2,enabled = true)
	public void createProjectUsingExcel(String location, String fname, String lname,String email, String phone, String description) throws InterruptedException 
	{
	    if (!isLoginSuccessful) 
	    {
	        throw new SkipException("Skipping Project Creation: Login failed");
	    }
	    ProjectCreatePage project = new ProjectCreatePage(driver);
	    project.createPrjtClick();
	    project.createProject(location, fname, lname, email, phone, description);
	}

	@Test(priority = 3,enabled = true)
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

	@Test(priority = 4,enabled = true)
	public void usersTest() {

	    if (!isLoginSuccessful) {
	        throw new SkipException(
	            "Skipping Users & Groups test: Login failed"
	        );
	    }
	    UsersPage ug = new UsersPage(driver);

	    try {
	        test.info("Opening Users module and inviting user");
            ug.users("anjanaworkesr26@gmail.com");
	        test.info("Opening Users module and inviting user");
	        ug.Userremaining();
	        test.pass("Users & Groups operations completed successfully");

	    } catch (Exception e)
	    {
	        test.fail("Users test failed: " + e.getMessage());
	        throw new RuntimeException(e);
	    }
	}
	
	@Test(priority = 5,enabled = true)
    public void groupsTest() throws Exception {

        if (!isLoginSuccessful) {
            throw new SkipException("Skipping Groups test: Login failed");
        }
        driver.navigate().refresh();
        GroupsPage group = new GroupsPage(driver);

        try {
            test.info("Opening Groups module and creating group");
            group.groups();
            test.pass("Group created, user added, and group deleted successfully");

        } catch (Exception e) {
            test.fail("Groups test failed: " + e.getMessage());
            throw e;
        }
    }
	
	
	@Test(priority = 6,enabled = true)
	public void workflowCreationTest() 
	{
	    if (!isLoginSuccessful)
	    {
	        throw new SkipException("Skipping Workflow Creation: Login failed");
	    }
	    //driver.navigate().refresh();
    	
	    WorkflowPage workflow = new WorkflowPage(driver);
	    try 
	    {
	    	 
	    test.info("Clicking Workflow option");
        workflow.workflowclick();
        test.info("Creating workflow");
        workflow.workflowCreation();
        driver.navigate().refresh();
        test.info("Deleting workflow");
        workflow.deleteworkflow();
        test.info("Opening workflow and performing status & checklist actions");
        workflow.openworkflow();
        test.pass("Workflow test executed successfully");

    } catch (Exception e) 
	    {
        test.fail("Workflow test failed: "+ e.getMessage());
        throw new RuntimeException(e);
	    }
	}
	@Test(priority = 7,enabled = true)
	public void materialsTest() 
	{
	    if (!isLoginSuccessful)
	    {
	        throw new SkipException("Skipping Materials test: Login failed");
	    }

	    MaterialsPage materials = new MaterialsPage(driver);
	    try 
	    { 
	        test.info("Opening Materials module");
	        materials.materialsClick();
	        test.info("Creating material type");
	        materials.createMaterials();         
            test.info("Delete Materials");
            materials.deleteMaterials();
            driver.navigate().refresh();
	        test.info("Opening material and adding item");
            materials.openmaterial1();
            Thread.sleep(1000);
	        materials.material2();
            Thread.sleep(500);
	        materials.material3();
	        Thread.sleep(500);
	        materials.material4();
	        Thread.sleep(500);
	        materials.material5();
	        Thread.sleep(500);
	        materials.material6();
	        Thread.sleep(500);
	        materials.material7();
	        Thread.sleep(500);
	        materials.material8();
	        test.pass("Materials test completed successfully");

	    } catch (Exception e) {
	        test.fail("Materials test failed: " + e.getMessage());
	        throw new RuntimeException(e);
	    }
	}
	@Test(priority = 8,enabled = true)
	public void financeTest() throws Exception {

	    if (!isLoginSuccessful) {
	        throw new SkipException("Skipping Finance test: Login failed");
	    }
	    driver.navigate().refresh();
	    FinancePage finance = new FinancePage(driver);
	    try {
	    	
	        test.info("Opening Finance module");
	        finance.financeClick();
	        finance.createfinance();
	        test.pass("Finance created successfully"); 
	        driver.navigate().refresh();
	        test.info("Delete Finance module");
	        finance.deleteFinance();
	        test.pass("Finance deleted successfully");   
	    } catch (Exception e) {
	        test.fail("Finance test failed: " + e.getMessage());
	        throw e;
	    }
	}

	@Test(priority = 9,enabled = true)
	public void officeAndSourceTest() throws Exception 
	{
	   if (!isLoginSuccessful) 
	    {
	        throw new SkipException("Skipping Office & Source test: Login failed");
	    }

	    OfficeAndSource office = new OfficeAndSource(driver);

	    try {

     		driver.navigate().refresh();
	        test.info("Opening Office & Source module");
	        office.clickOffice();
        
	        test.info("Creating a new Office");
	        office.createOffice();
	        test.info("Delete Office");
	        //office.deleteOffice();
	        test.info("Creating a new source");
	        office.createsource();
	        test.info("Delete Office");
	        //office.deleteSource();

	        test.pass("Office created successfully");

	    } catch (Exception e) {
	        test.fail("Office & Source test failed: " + e.getMessage());
	        throw e;
	    }
	}
	@Test(priority = 10,enabled = true)
	public void rolesTest() throws Exception 
	{
	    if (!isLoginSuccessful) 
	    {
	        throw new SkipException("Skipping Roles test: Login failed");
	    }

      driver.navigate().refresh();
	    RolesPage roles = new RolesPage(driver);

	    try {

	        test.info("Opening Roles module");
	        roles.clickRole();

	        test.info("Creating a new Role");
	        roles.createRole();
	        test.info("Deleting the Role");
	        roles.deleterole();
	        test.info("Adding user to the Role");
	        driver.navigate().refresh();
	        roles.aduser();
	        test.pass("Roles test completed successfully");

	    } catch (Exception e) {

	        test.fail("Roles test failed: " + e.getMessage());
	        throw e;
	    }
	}
	@Test(priority = 11,enabled = true)
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
	@Test(priority = 12,enabled = true)
	public void projectClickTest() throws Exception
	{
	    if (!isLoginSuccessful)
	    {
	        throw new SkipException("Skipping Project click test: Login failed");
	    }

	    driver.navigate().refresh();
	    projectClickpage projectPage = new projectClickpage(driver);

	    try
	    {
	        test.info("Clicking Projects module");
	        projectPage.prjClick();

	        test.info("Opening specific project");
	        projectPage.openProject();

	        test.pass("Project opened successfully");
	    }
	    catch (Exception e)
	    {
	        test.fail("Project click test failed: " + e.getMessage());
	        throw e;
	    }
	}

	@Test(priority = 13,enabled = true)
	public void projectTest() throws Exception 
	{
	    if (!isLoginSuccessful) 
	    {
	        throw new SkipException("Skipping Project test: Login failed");
	    }
	    driver.navigate().refresh();
	    ProjectPage project = new ProjectPage(driver);

	    try {
	        
	        test.info("add stages to Project");
	        project.addStages();
	        driver.navigate().refresh();
	        test.info("Add comments");
	        project.comment();
	        test.info("Delete comments");
	        project.dltComment();
	        test.info("Remove Stages");
	        project.stgremove();
	        test.info("Send Email");
	        project.emailOption();
	        test.info("Call");
	        project.callOption();
	        driver.navigate().refresh();
	        test.info("SMS");
	        project.smsOption();
	        test.info("Appointments");
	        project.appointments();
	        test.pass("Project test completed successfully");
	    } catch (Exception e) 
	    {
	        test.fail("Project test failed: " + e.getMessage());
	        throw e;
	    }
	}
	@Test(priority = 14,enabled = true)
	public void filesUploadTest() throws Exception
	{
	    if (!isLoginSuccessful)
	    {
	        throw new SkipException("Skipping Files upload test: Login failed");
	    }

	    driver.navigate().refresh();
	    FilesPage filesPage = new FilesPage(driver);

	    try
	    {
	        test.info("Opening Files module");
	        filesPage.clickfile();
	        test.info("Uploading file using window-based popup");
	        filesPage.robocls();
	        Thread.sleep(1000);
	        test.info("Download File");
	        filesPage.filedwnld();
//	        test.info("delete File");
//	        filesPage.deleteFile();
	        test.info("new folder");
	        filesPage.newfolders();
	        test.info("Delete folder");
	        //filesPage.deletefolders();
	        test.pass("File uploaded successfully");

	    }
	    catch (Exception e)
	    {
	        test.fail("Files upload test failed: " + e.getMessage());
	        throw e;
	    }
	}
	@Test(priority = 15,enabled = true)
	public void systemDetailsTest() throws Exception
	{
	    if (!isLoginSuccessful)
	    {
	        throw new SkipException("Skipping System Details test: Login failed");
	    }

	    driver.navigate().refresh();
	    systemDetailsPage systemPage = new systemDetailsPage(driver);

	    try
	    {
	    	test.info("Opening System Details module");
	        systemPage.systemclick();
	        test.info("Edit PV Deatils");
	        systemPage.pvdetails();
	        Thread.sleep(2000);        
	        test.info("Edit ESS Deatils");
	        systemPage.energySS();      
	        Thread.sleep(2000);
	        test.info("Edit Racking Deatils");
	        systemPage.rackingDetails();
	        Thread.sleep(2000);
	        test.info("Edit Electrical Deatils");
	        systemPage.electrical();
	        Thread.sleep(2000);
	        test.info("Edit Structiural Deatils");
	        systemPage.structuralDetails();
	        Thread.sleep(2000);
	        test.info("Edit Ev charger Deatils");
	        systemPage.evcharger();
	        Thread.sleep(2000);
	        test.info("Edit existing PV Deatils");
	        systemPage.existingPv();  
	        Thread.sleep(2000);
	        systemPage.generator();
	        test.pass("System Details (PV Details) updated successfully");
	    }
	    catch (Exception e)
	    {
	        test.fail("Add Finance test failed: " + e.getMessage());
	        throw e;
	    }
	}
	@Test(priority = 17,enabled = true)
	public void permittingDetailsTest() throws Exception
	{
	    if (!isLoginSuccessful)
	    {
	        throw new SkipException("Skipping Permitting test: Login failed");
	    }

	    driver.navigate().refresh();
	    PermittingPage permittingPage = new PermittingPage(driver);

	    try
	    {
	        test.info("Opening Permitting module");
	        permittingPage.permitClick();

	        test.info("Entering AHJ Permitting details");
	        permittingPage.ahjDetails();
	        Thread.sleep(1000);
	        permittingPage.permitting();
	        test.pass("Permitting details saved successfully");
	    }
	    catch (Exception e)
	    {
	        test.fail("Permitting test failed: " + e.getMessage());
	        throw e;
	    }
	}
	@Test(priority = 18,enabled = true)
    public void interconnectionDetailsTest() throws Exception
    {
        if (!isLoginSuccessful)
        {
            throw new SkipException("Skipping Interconnection test: Login failed");
        }

        driver.navigate().refresh();

        InterconnectionPage interconnectionPage =new InterconnectionPage(driver);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try
        {
            test.info("Opening Interconnection module");
            interconnectionPage.interconnectionClick();

            test.info("Updating utility and battery details");
            interconnectionPage.utility();
            Thread.sleep(1000);
            interconnectionPage.interconnectiondata();
            Thread.sleep(1000);
            interconnectionPage.ptoDetails();
            test.pass("Interconnection details updated successfully");
        }
        catch (Exception e)
        {
            test.fail("Interconnection test failed: " + e.getMessage());
            throw e;
        }    
    
    }
	    @Test(priority = 19,enabled = true)
	    public void hoaDetailsTest() throws Exception
	    {
	        if (!isLoginSuccessful)
	        {
	            throw new SkipException("Skipping HOA test: Login failed");
	        }

	        driver.navigate().refresh();

	        HOAPage hoaPage = new HOAPage(driver);

	        try
	        {
	            test.info("Opening HOA module");
	            hoaPage.hoaClick();

	            test.info("Updating HOA details");
	            hoaPage.hoaUpdate();

	            test.pass("HOA details updated and saved successfully");
	        }
	        catch (Exception e)
	        {
	            test.fail("HOA test failed: " + e.getMessage());
	            throw e;
	        }
	    }
	 @Test(priority = 20,enabled =true)
	    public void stakeholdersDetailsTest() throws Exception
	    {
	        if (!isLoginSuccessful)
	        {
	            throw new SkipException("Skipping Stakeholders test: Login failed");
	        }

	        driver.navigate().refresh();

	        StackholdersPage stakeholdersPage =new StackholdersPage(driver);

	        try
	        {
	            test.info("Opening Stakeholders module");
	            stakeholdersPage.stackClick();

	            test.info("Updating Stakeholders details");
	            stakeholdersPage.stackdetails();

	            test.pass("Stakeholders details updated successfully");
	        }
	        catch (Exception e)
	        {
	            test.fail("Stakeholders test failed: " + e.getMessage());
	            throw e;
	        }
	    }
	
	
	@Test(priority = 21,enabled = true)
    public void reminderCreationTest() throws Exception
    {
        if (!isLoginSuccessful)
        {
            throw new SkipException("Skipping Reminder test: Login failed");
        }

        driver.navigate().refresh();

        ReminderPage reminderPage = new ReminderPage(driver);

        try
        {
            test.info("Opening Reminder module");
            reminderPage.reminders();

            test.pass("Reminder created successfully");
        }
        catch (Exception e)
        {
            test.fail("Reminder test failed: " + e.getMessage());
            throw e;
        }
    }
	
	 @Test(priority = 22,enabled = true)
	    public void activityProjectProgressTest() throws Exception
	    {
	        if (!isLoginSuccessful)
	        {
	            throw new SkipException("Skipping Activity test: Login failed");
	        }

	        driver.navigate().refresh();

	        ActivityPage activityPage = new ActivityPage(driver);

	        try
	        {
	            test.info("Opening Activity module");
	            activityPage.activities();

	            test.pass("Activity → Project Progress opened successfully");
	        }
	        catch (Exception e)
	        {
	            test.fail("Activity test failed: " + e.getMessage());
	            throw e;
	        }
	    }
	 @Test(priority = 23,enabled = true)
	    public void autoAssignUserAndGroupTest() throws Exception
	    {
	        if (!isLoginSuccessful)
	        {
	            throw new SkipException("Skipping Auto Assign test: Login failed");
	        }

	        AutoAssignProjectPage autoAssign = new AutoAssignProjectPage(driver);

	        try
	        {
	            test.info("Starting Auto Assign to User");
	            autoAssign.user();
	            test.pass("Project successfully auto-assigned to User");

	            Thread.sleep(1000);

	            test.info("Starting Auto Assign to Group");
	            autoAssign.group();
	            test.pass("Project successfully auto-assigned to Group");
	        }
	        catch (Exception e)
	        {
	            test.fail("Auto Assign User/Group failed: " + e.getMessage());
	            throw e;
	        }
	    }
	 @Test(priority = 24,enabled = true)
	    public void materialsBomTest() throws Exception
	    {
	        if (!isLoginSuccessful)
	        {
	            throw new SkipException("Skipping Materials BOM test: Login failed");
	        }

	        driver.navigate().refresh();

	        MaterialsProjectPage materialsPage =new MaterialsProjectPage(driver);

	        try
	        {
	            test.info("Opening Materials module");
	            materialsPage.materialsclick();

	            test.info("Adding BOM details");
	            materialsPage.bomData();
	            materialsPage.deleteBom();
	            Thread.sleep(2000);
	            materialsPage.adder();
	            materialsPage.dltAdder();
	            Thread.sleep(1000);
	            materialsPage.labels();
	            test.pass("Materials BOM added successfully");
	        }
	        catch (Exception e)
	        {
	            test.fail("Materials BOM test failed: " + e.getMessage());
	            throw e;
	        }
	    }
	 @Test(priority = 25)
	    public void propertyDetailsTest() throws Exception
	    {
	        if (!isLoginSuccessful)
	        {
	            throw new SkipException("Skipping Property Details test: Login failed");
	        }

	        PropertydetailsPage propertyPage = new PropertydetailsPage(driver);

	        try
	        {
	            test.info("Opening Property Details section");
	            propertyPage.propertyDetails();
	            test.pass("Property Details updated successfully");
	        }
	        catch (Exception e)
	        {
	            test.fail("Property Details update failed: " + e.getMessage());
	            throw e;
	        }
	    }
	 @Test(priority = 26,enabled = true)
		public void createLeadTest() {

	        if (!isLoginSuccessful) {
	            throw new SkipException("Skipping Create Lead test: Login failed");
	        }
        driver.navigate().refresh();
	        LeadPage leadPage = new LeadPage(driver);

	        try {
	        	    leadPage.leadClick();
		            leadPage.createLead();
		            leadPage.openLeads();
	                leadPage.assignLeads();
	                leadPage.Energy();
		            leadPage.robocls();
		            leadPage.filedownload();
		            leadPage.appointments();
		            leadPage.reminderLead();
		            leadPage.activities();
		            leadPage.convertToproject();
	                leadPage.MenuList();


	        } catch (Exception e) {
	        	test.fail("My Organization test failed: " + e.getMessage());
		        throw new RuntimeException(e);
		        }
	    }
	 @Test(priority = 27, enabled = true)
		public void superDashboardTest() throws Exception {

		    if (!isLoginSuccessful) {
		        throw new SkipException("Skipping Super Dashboard test: Login failed");
		    }

		    driver.navigate().refresh();

		    SuperdashboardPage dashboard = new SuperdashboardPage(driver);

		    try {
		        test.info("Opening Super Dashboard module");
		        dashboard.dashboardClick();
		        test.pass("Super Dashboard opened successfully");

		        test.info("Selecting organization from menu");
		        dashboard.selectOrg();
		        test.pass("Organization selected and applied successfully");

		    } catch (Exception e) {
		        test.fail("Super Dashboard test failed: " + e.getMessage());
		        throw e;
		    }
		}
	 @Test(priority = 28, enabled = true)
		public void integrationsTest() throws Exception {

		    if (!isLoginSuccessful) {
		        throw new SkipException("Skipping Integrations test: Login failed");
		    }

		    driver.navigate().refresh();

		    IntegrationsPage integration = new IntegrationsPage(driver);

		    try {

		        test.info("Opening Integrations module");
		        integration.clickIntegration();
		        test.pass("Integrations toggled successfully");

		    } catch (Exception e) {

		        test.fail("Integrations test failed: " + e.getMessage());
		        throw e;
		    }
		}
}

	
