import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tendableWeb {
	private WebDriver driver;
	

	public static void main(String[] args) {
		//public static WebDriver driver;
		//public static String driverPath = "";
		//System.setProperty(null, null)
		System.setProperty("webDriver.chrome.driver","\"C:\\Users\\prati\\chromedriver\\chromedriver.exe\"");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tendable.com");
		WebElement clickOurStory= driver.findElement(By.xpath("//a[normalize-space()='Our Story']"));
		clickOurStory.click();
		boolean present;
		present= driver.findElement(By.xpath("//a[normalize-space()='Request A Demo']")).isDisplayed();
		if(present) 
		{
			System.out.println("Rquest buttom present");
		}
		else 
		{
			System.out.println("Request button not present");
		}
		WebElement clickOurSolutions= driver.findElement(By.xpath("//a[normalize-space()='Our Solution']"));
		clickOurSolutions.click();
		present= driver.findElement(By.xpath("//a[normalize-space()='Request A Demo']")).isDisplayed();
		if(present) 
		{
			System.out.println("Rquest buttom present");
		}
		else 
		{
			System.out.println("Request button not present");
		}
		WebElement clickOrSolutions1= driver.findElement(By.xpath("//a[normalize-space()='Why Tendable?']"));
		clickOrSolutions1.click();
		present= driver.findElement(By.xpath("//a[normalize-space()='Request A Demo']")).isDisplayed();
		if(present) 
		{
			System.out.println("Rquest buttom present");
		}
		else 
		{
			System.out.println("Request button not present");
		}
		WebElement contactUS= driver.findElement(By.xpath("//a[normalize-space()='Contact Us']"));
		contactUS.click();
		WebElement marketingContact= driver.findElement(By.xpath("(//button[@class='body-button bg-plain-600 toggle-control'])[1]"));
		marketingContact.click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-fullName']")).sendKeys("Pratik Vankore");
		driver.findElement(By.xpath("//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-organisationName']")).sendKeys("ABC");
		driver.findElement(By.xpath("//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-cellPhone']")).sendKeys("8793130819");
		WebElement emailField = driver.findElement(By.xpath("//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-email']"));
		emailField.sendKeys("pratikvankore@gmail.com");
		//WebElement agreeButton = driver.findElement(By.xpath("(//input[@id='form-input-consentAgreed-0'])[1]"));
		//agreeButton.click();
		//WebElement submitButton= driver.findElement(By.xpath("(//button[@data-freeform-action='submit'])[1]"));
		//submitButton.click();
		emailField.sendKeys(Keys.ENTER);
		System.out.println("clicked submit button with no messege");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String error = driver.findElement(By.xpath("//div[@class='ff-form-errors']")).getText();
		//System.out.println(error);
		String ExpError = "Sorry, there was an error submitting the form. Please try again.";
		if(error.equals(ExpError))
		{
			System.out.println("Error is displayed as message field left empty.");
		}
		else 
		{
			System.out.println("its a bug, as Error is not being displayed as message field left empty.");
		}
		 WebElement errorMessage = driver.findElement(By.xpath("//div[@class='ff-form-errors']"));
	        if (errorMessage.isDisplayed()) {
	            // If error message is displayed, mark test as PASS
	            Assert.assertTrue(true, "Error message is displayed when the Message field is empty. Test PASSED.");
	        } else {
	            // If error message is not displayed, mark test as FAIL
	            Assert.fail("Error message is not displayed when the Message field is empty. Test FAILED.");
	        }
	        driver.quit();	
	}
	@Test	
	 public void errormessage1()
	 {
		System.setProperty("webDriver.chrome.driver","\"C:\\Users\\prati\\chromedriver\\chromedriver.exe\"");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tendable.com");
		WebElement clickOurStory= driver.findElement(By.xpath("//a[normalize-space()='Our Story']"));
		clickOurStory.click();
		boolean present;
		present= driver.findElement(By.xpath("//a[normalize-space()='Request A Demo']")).isDisplayed();
		if(present) 
		{
			System.out.println("Rquest buttom present");
		}
		else 
		{
			System.out.println("Request button not present");
		}
		WebElement clickOurSolutions= driver.findElement(By.xpath("//a[normalize-space()='Our Solution']"));
		clickOurSolutions.click();
		present= driver.findElement(By.xpath("//a[normalize-space()='Request A Demo']")).isDisplayed();
		if(present) 
		{
			System.out.println("Rquest buttom present");
		}
		else 
		{
			System.out.println("Request button not present");
		}
		WebElement clickOrSolutions1= driver.findElement(By.xpath("//a[normalize-space()='Why Tendable?']"));
		clickOrSolutions1.click();
		present= driver.findElement(By.xpath("//a[normalize-space()='Request A Demo']")).isDisplayed();
		if(present) 
		{
			System.out.println("Rquest buttom present");
		}
		else 
		{
			System.out.println("Request button not present");
		}
		WebElement contactUS= driver.findElement(By.xpath("//a[normalize-space()='Contact Us']"));
		contactUS.click();
		WebElement marketingContact= driver.findElement(By.xpath("(//button[@class='body-button bg-plain-600 toggle-control'])[1]"));
		marketingContact.click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-fullName']")).sendKeys("Pratik Vankore");
		driver.findElement(By.xpath("//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-organisationName']")).sendKeys("ABC");
		driver.findElement(By.xpath("//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-cellPhone']")).sendKeys("8793130819");
		WebElement emailField = driver.findElement(By.xpath("//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-email']"));
		emailField.sendKeys("pratikvankore@gmail.com");
		//WebElement agreeButton = driver.findElement(By.xpath("(//input[@id='form-input-consentAgreed-0'])[1]"));
		//agreeButton.click();
		//WebElement submitButton= driver.findElement(By.xpath("(//button[@data-freeform-action='submit'])[1]"));
		//submitButton.click();
		emailField.sendKeys(Keys.ENTER);
		System.out.println("clicked submit button with no messege");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String error = driver.findElement(By.xpath("//div[@class='ff-form-errors']")).getText();
		//System.out.println(error);
		String ExpError = "Sorry, there was an error submitting the form. Please try again.";
		if(error.equals(ExpError))
		{
			System.out.println("Error is displayed as message field left empty.");
		}
		else 
		{
			System.out.println("its a bug, as Error is not being displayed as message field left empty.");
		}
		 WebElement errorMessage = driver.findElement(By.xpath("//div[@class='ff-form-errors']"));
	        if (errorMessage.isDisplayed()) {
	            // If error message is displayed, mark test as PASS
	            Assert.assertTrue(true, "Error message is displayed when the Message field is empty. Test PASSED.");
	        } else {
	            // If error message is not displayed, mark test as FAIL
	            Assert.fail("Error message is not displayed when the Message field is empty. Test FAILED.");
	        }
	        driver.quit(); 
	 }
	@Test
    public void errormessage2()
    {
		System.setProperty("webDriver.chrome.driver","\"C:\\Users\\prati\\chromedriver\\chromedriver.exe\"");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tendable.com");
		WebElement clickOurStory= driver.findElement(By.xpath("//a[normalize-space()='Our Story']"));
		clickOurStory.click();
		boolean present;
		present= driver.findElement(By.xpath("//a[normalize-space()='Request A Demo']")).isDisplayed();
		if(present) 
		{
			System.out.println("Rquest buttom present");
		}
		else 
		{
			System.out.println("Request button not present");
		}
		WebElement clickOurSolutions= driver.findElement(By.xpath("//a[normalize-space()='Our Solution']"));
		clickOurSolutions.click();
		present= driver.findElement(By.xpath("//a[normalize-space()='Request A Demo']")).isDisplayed();
		if(present) 
		{
			System.out.println("Rquest buttom present");
		}
		else 
		{
			System.out.println("Request button not present");
		}
		WebElement clickOrSolutions1= driver.findElement(By.xpath("//a[normalize-space()='Why Tendable?']"));
		clickOrSolutions1.click();
		present= driver.findElement(By.xpath("//a[normalize-space()='Request A Demo']")).isDisplayed();
		if(present) 
		{
			System.out.println("Rquest buttom present");
		}
		else 
		{
			System.out.println("Request button not present");
		}
		WebElement contactUS= driver.findElement(By.xpath("//a[normalize-space()='Contact Us']"));
		contactUS.click();
		WebElement marketingContact= driver.findElement(By.xpath("(//button[@class='body-button bg-plain-600 toggle-control'])[1]"));
		marketingContact.click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-fullName']")).sendKeys("Pratik Vankore");
		driver.findElement(By.xpath("//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-organisationName']")).sendKeys("ABC");
		driver.findElement(By.xpath("//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-cellPhone']")).sendKeys("8793130819");
		WebElement emailField = driver.findElement(By.xpath("//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-email']"));
		emailField.sendKeys("pratikvankore@gmail.com");
		//WebElement agreeButton = driver.findElement(By.xpath("(//input[@id='form-input-consentAgreed-0'])[1]"));
		//agreeButton.click();
		//WebElement submitButton= driver.findElement(By.xpath("(//button[@data-freeform-action='submit'])[1]"));
		//submitButton.click();
		emailField.sendKeys(Keys.ENTER);
		System.out.println("clicked submit button with no messege");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String error = driver.findElement(By.xpath("//div[@class='ff-form-errors']")).getText();
		//System.out.println(error);
		String ExpError = "Sorry, there was an error submitting the form. Please try again.";
		if(error.equals(ExpError))
		{
			System.out.println("Error is displayed as message field left empty.");
		}
		else 
		{
			System.out.println("its a bug, as Error is not being displayed as message field left empty.");
		}
		 WebElement errorMessage = driver.findElement(By.xpath("//div[@class='ff-form-errors']"));
	        if (errorMessage.isDisplayed()) {
	            // If error message is displayed, mark test as PASS
	            Assert.assertTrue(true, "Error message is displayed when the Message field is empty. Test PASSED.");
	        } else {
	            // If error message is not displayed, mark test as FAIL
	            Assert.fail("Error message is not displayed when the Message field is empty. Test FAILED.");
	        }
	        driver.quit();
    }
	@Test
    public void errormessage3()
    {
		System.setProperty("webDriver.chrome.driver","\"C:\\Users\\prati\\chromedriver\\chromedriver.exe\"");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tendable.com");
		WebElement clickOurStory= driver.findElement(By.xpath("//a[normalize-space()='Our Story']"));
		clickOurStory.click();
		boolean present;
		present= driver.findElement(By.xpath("//a[normalize-space()='Request A Demo']")).isDisplayed();
		if(present) 
		{
			System.out.println("Rquest buttom present");
		}
		else 
		{
			System.out.println("Request button not present");
		}
		WebElement clickOurSolutions= driver.findElement(By.xpath("//a[normalize-space()='Our Solution']"));
		clickOurSolutions.click();
		present= driver.findElement(By.xpath("//a[normalize-space()='Request A Demo']")).isDisplayed();
		if(present) 
		{
			System.out.println("Rquest buttom present");
		}
		else 
		{
			System.out.println("Request button not present");
		}
		WebElement clickOrSolutions1= driver.findElement(By.xpath("//a[normalize-space()='Why Tendable?']"));
		clickOrSolutions1.click();
		present= driver.findElement(By.xpath("//a[normalize-space()='Request A Demo']")).isDisplayed();
		if(present) 
		{
			System.out.println("Rquest buttom present");
		}
		else 
		{
			System.out.println("Request button not present");
		}
		WebElement contactUS= driver.findElement(By.xpath("//a[normalize-space()='Contact Us']"));
		contactUS.click();
		WebElement marketingContact= driver.findElement(By.xpath("(//button[@class='body-button bg-plain-600 toggle-control'])[1]"));
		marketingContact.click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-fullName']")).sendKeys("Pratik Vankore");
		driver.findElement(By.xpath("//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-organisationName']")).sendKeys("ABC");
		driver.findElement(By.xpath("//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-cellPhone']")).sendKeys("8793130819");
		WebElement emailField = driver.findElement(By.xpath("//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-email']"));
		emailField.sendKeys("pratikvankore@gmail.com");
		//WebElement agreeButton = driver.findElement(By.xpath("(//input[@id='form-input-consentAgreed-0'])[1]"));
		//agreeButton.click();
		//WebElement submitButton= driver.findElement(By.xpath("(//button[@data-freeform-action='submit'])[1]"));
		//submitButton.click();
		emailField.sendKeys(Keys.ENTER);
		System.out.println("clicked submit button with no messege");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String error = driver.findElement(By.xpath("//div[@class='ff-form-errors']")).getText();
		//System.out.println(error);
		String ExpError = "Sorry, there was an error submitting the form. Please try again.";
		if(error.equals(ExpError))
		{
			System.out.println("Error is displayed as message field left empty.");
		}
		else 
		{
			System.out.println("its a bug, as Error is not being displayed as message field left empty.");
		}
		 WebElement errorMessage = driver.findElement(By.xpath("//div[@class='ff-form-errors']"));
	        if (errorMessage.isDisplayed()) {
	            // If error message is displayed, mark test as PASS
	            Assert.assertTrue(true, "Error message is displayed when the Message field is empty. Test PASSED.");
	        } else {
	            // If error message is not displayed, mark test as FAIL
	            Assert.fail("Error message is not displayed when the Message field is empty. Test FAILED.");
	        }
	        driver.quit();
    }
	

}
