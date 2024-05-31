import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tendableWeb {

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
		
		driver.findElement(By.xpath("//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-fullName']")).sendKeys("Pratik Vankore");
		driver.findElement(By.xpath("//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-organisationName']")).sendKeys("ABC");
		driver.findElement(By.xpath("//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-cellPhone']")).sendKeys("8793130819");
		driver.findElement(By.xpath("//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-email']")).sendKeys("pratikvankore@gmail.com");
		WebElement AgreeRadioButton= driver.findElement(By.xpath("//form[@id='contactMarketingPipedrive-163701']//label[contains(text(),'I Agree')]"));
		AgreeRadioButton.click();
		WebElement submitButton= driver.findElement(By.xpath("(//button[@data-freeform-action='submit'])[1]"));
		submitButton.click();
	}

}
