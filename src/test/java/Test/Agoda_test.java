package Test;

import java.io.IOException;
import java.time.Duration;
import org.testng.annotations.Test;
import Base.base;
import Page.select_page;
import Page.Homepage;
import Page.flag_page;
import Page.logo_page;
import Page.navigate_page;


public class Agoda_test extends base {


	
	
   @Test(priority = 0)
	
   //Logo verifying
	public void  logoverify() throws InterruptedException
	{
    	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		test = extent.createTest("Logo verfication");
		logo_page obj =new logo_page(driver);
		
		obj.logo();	
	}

	
	@Test(priority = 1)
	
	//Data entering
	public void  home() 
	
	{
		test = extent.createTest("Searching");
		Homepage obj1 =new Homepage(driver);
		
		obj1.place("Thrissur");
		obj1.date();
		obj1.date1();
		obj1.person(); 
		obj1.button();
		

}
	
	@Test(priority = 2)
	
	//Screenshot
	public void  Screen() throws IOException 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		test = extent.createTest("Screenshot");
		select_page obj2 =new select_page(driver);
		
		obj2.Screenshot();

  }
	@Test(priority = 3)
	
	//Language
	public void  flag() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 test = extent.createTest("Language selecting");
	     flag_page obj3=new flag_page(driver);
	     
	     obj3.language();
	     obj3.country();

	}
	
	@Test(priority = 4)
	
	//Navigation
	public void navigate() throws InterruptedException
	{
		test = extent.createTest("Page navigation");
		navigate_page obj4 = new navigate_page(driver);
		
		obj4.back();
		obj4.refresh();
		obj4.back1();
	}
	
	
	
	
}
