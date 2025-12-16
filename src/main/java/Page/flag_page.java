package Page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flag_page {
	
	 WebDriver driver;
	 WebDriverWait wait;
		
		@FindBy(xpath ="//img[@src='https://cdn6.agoda.net/images/mobile/flag-us@2x.png']")WebElement lang;
		@FindBy(xpath ="//p[text()='Italiano']")WebElement country1;
	
		public flag_page(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		}
		
		//Click to change the language
		public void language() throws InterruptedException
		 {
			lang.click();
			Thread.sleep(2000);
	     }
		
		//Select the language by clicking flag
		public void country() throws InterruptedException
		 {
			country1.click();
			Thread.sleep(2000);
	     }
		
}
