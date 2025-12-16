package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	
   public WebDriver driver;
   
   ExtentHtmlReporter report;
   public ExtentTest test;
   public ExtentReports extent;
	
   @BeforeTest
   public void setup()
	{
		report= new ExtentHtmlReporter("./Reports/myreports.html");
		report.config().setDocumentTitle("Automation Testing");
		report.config().setReportName("Functional Testing");
		report.config().setTheme(Theme.DARK);
		
		extent =new ExtentReports();
		extent.attachReporter(report);
		
		extent.setSystemInfo("Hostname", "Localhost");
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("TesterName", "Anju C A");
		extent.setSystemInfo("Browser", "Chrome");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.agoda.com/en-in/?cid=1844104&ds=HX1u7b8otPStgcdq");
		driver.manage().window().maximize();
		
	}
   
   /*@BeforeMethod
   
   public void start()

   {
	   driver.get("https://www.agoda.com/en-in/?cid=1844104&ds=HX1u7b8otPStgcdq");
   }*/
   
   @AfterMethod
	
	public void browserclose(ITestResult result) 
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(com.aventstack.extentreports.Status.FAIL, "Test case Failed" +result.getName());
			test.log(com.aventstack.extentreports.Status.FAIL, "Test case Failed" +result.getThrowable());
		}
		else if (result.getStatus()==ITestResult.SKIP)
		{
			test.log(com.aventstack.extentreports.Status.SKIP, "Test case Skipped" +result.getName());
			test.log(com.aventstack.extentreports.Status.SKIP, "Test case Skipped" +result.getThrowable());
		}
		else if (result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(com.aventstack.extentreports.Status.PASS, "Test case Failed" +result.getName());
		}
	}
   
   @AfterTest
	public  void browserclose()

	{
	   extent.flush();
	   driver.quit();	
	
	}
   

}