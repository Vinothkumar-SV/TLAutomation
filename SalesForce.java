package selenium.week2.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		
        //setup the path	
		
//disable notifications

//create instance

//manage ur window

//add wait

            // Login to https://login.salesforce.com

//enter username

//enter password

//click login button

                          //Click on toggle menu button from the left corner

                          //Click view All and click Sales from App Launcher

                          //Click on Opportunity tab 

//Click on Accounts tab

//Click on New button

//Enter 'your name' as account name

//Select Ownership as Public

                          //click save

//verify message
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password#123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(5000);
		//Java Script Exception - so use JavaScript -driver.executeScript("arguments[0].click()", webelement);
		WebElement accounts = driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click()",accounts);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("//Input[@name='Name']")).sendKeys("Gomathy Shri");
		//Ownership dropdown
		WebElement combobox = driver.findElement(By.xpath("//label[text()='Ownership']"));
		driver.executeScript("arguments[0].click()",combobox);
		Thread.sleep(5000);
		WebElement dd = driver.findElement(By.xpath("//span[text()='Public']"));
		driver.executeScript("arguments[0].click()",dd);
		//Save
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		//Success Message
		String message = driver.findElement(By.xpath("//span[text()='Account']/a")).getAttribute("title");
		System.out.println(message);
		if (message.contains("Gomathy Shri")) {
			System.out.println("It is verified");
			}
		else {
			System.out.println("It is not verified");
		}
	}

}
