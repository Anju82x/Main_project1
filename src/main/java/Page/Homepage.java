package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
		
   WebDriver driver;
   WebDriverWait wait;
	
	@FindBy(xpath ="//input[@aria-label='Enter a destination or property']")WebElement place1;
	@FindBy(xpath ="//div[contains(@data-selenium,'checkInText')]") WebElement startdate;
	@FindBy(xpath ="//div[contains(@data-selenium,'checkOutText')]") WebElement enddate;
	@FindBy(xpath ="//span[@data-selenium='adultValue']") WebElement person1;
	@FindBy(xpath = "//button[@data-element-name='search-button']") WebElement button;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	//For entering the place
	public void place(String place) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		place1.sendKeys(place);
		
	
     }
	 
	// For selecting checkin date
	 public void date() 
	 
	 {
		 wait.until(ExpectedConditions.elementToBeClickable(startdate)).click();	 
	 }
	 
	//For selecting checkout date
	 public void date1() 
	 {
		 wait.until(ExpectedConditions.elementToBeClickable(enddate)).click();
     }
	 
	//For selecting no.of person
	 public void person() 
	 {
		wait.until(ExpectedConditions.elementToBeClickable(person1)).click();
		
     }
	  
	//For clicking the details
	 public void button() 
	 {
		 wait.until(ExpectedConditions.elementToBeClickable(button)).click();
		
     }
	  
	
 }



