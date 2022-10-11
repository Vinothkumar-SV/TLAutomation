package selenium.week2.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceOppourtunity {

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

//Click on New button

//Enter 'your name' as account name

//choose close date

//click stage

                         //click save

//verify message

                        // Close the Browser
	
	public static void main(String[] args) throws InterruptedException {
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
		//Clicking Oppprtunity tab with java script
		WebElement opportunity = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click()",opportunity);
		
		driver.findElement(By.xpath("//div[@title ='New']")).click();
		//Opportunity Name
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Gomathy opp");
		driver.findElement(By.xpath("//input[@placeholder='Search Accounts...']")).sendKeys("Gomathy Shri");
		driver.findElement(By.xpath("//strong[text()='Gomathy']")).click();
		//Close Date
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//span[text()='16']")).click();
		
		//Elder Cousin to younger cousin xpath - Stage Drop Down
		driver.findElement(By.xpath("//label[text()='Stage']/following::button")).click();
//		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//span[text()='Qualification']")).click();
		WebElement stage = driver.findElement(By.xpath("//span[@title='Qualification']"));

		driver.executeScript("arguments[0].click()",stage);
		
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		//Success Message
		String messagetext = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']/a")).getAttribute("title");
		System.out.println(messagetext);		
		if (messagetext.contains("Gomathy")) {
			System.out.println("Message Verified");
		}
		else {
			System.out.println("Message not verified");
		}
			
	}

}
