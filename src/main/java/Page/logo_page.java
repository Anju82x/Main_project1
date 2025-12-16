package Page;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class logo_page {
	
	WebDriver driver;
    
	@FindBy(xpath ="//img[@src='https://cdn6.agoda.net/images/kite-js/logo/agoda/color-default.svg']") WebElement logo1;
	
	
	public logo_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

	 //For checking the logo is displayed or not
	 public void logo() throws InterruptedException
	 {
		 Boolean a= logo1.isDisplayed();
		 Assert.assertTrue(a);
		 System.out.println("The image is displayed=" +a);
		 Thread.sleep(2000);
		
    }
	 
}
