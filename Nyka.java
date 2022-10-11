package assignment2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nyka {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//a[text()='brands']"))).build().perform();
		//driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");
		Actions ad = new Actions(driver);
		ad.click(driver.findElement(By.xpath("(//div[@class='css-ov2o3v']//a)[2]"))).build().perform();
		
		WebElement eleBrand = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(eleBrand).perform();
		//driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		//Click L'Oreal Paris
		driver.findElement(By.xpath("(//a[contains(text(),'Oreal Paris')])[1]")).click();
		//Check the title contains L'Oreal Paris(Hint-GetTitle)
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("L'Oreal Paris"))
		{
			System.out.println("Title contains L'Oreal Paris");
		}
		else
		{
			System.out.println("Title does not have L'Oreal Paris");
		}		
		//Click sort By and select customer top rated
		driver.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		Thread.sleep(7000);	
		//Click Category and click Hair->Click haircare->Shampoo
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		Thread.sleep(2000);	
		//Click->Concern->Color Protection
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//div[@class='control-indicator checkbox active']")).click();
		
		
		
		Thread.sleep(2000);
		//check whether the Filter is applied with Shampoo
		String filter = driver.findElement(By.xpath("//span[text()='Shampoo']")).getText();
		System.out.println(filter);
		if(filter.contains("Shampoo"))
		{
			System.out.println("Shampoo is filtered");
		}
		Thread.sleep(3000);
		//Click on L'Oreal Paris Colour Protect Shampoo
		driver.findElement(By.xpath("//div[contains(text(),'Oreal Paris Colour Protect Shampoo')]")).click();
		Thread.sleep(4000);
		//GO to the new window and select size as 175ml
		Set<String> windowHandles = driver.getWindowHandles();
		java.util.List<String> window = new ArrayList<String>(windowHandles);
		System.out.println(window);
		driver.switchTo().window(window.get(1));
		WebElement findElement = driver.findElement(By.xpath("//select[@title='SIZE']"));
		Select dropdown = new Select(findElement);
		dropdown.selectByVisibleText("175ml");
		//Print the MRP of the product
		String mrp = driver.findElement(By.xpath("//span[contains(text(),'MRP:')]/following::span[1]")).getText().substring(1);
		System.out.println(mrp);	
		//Click on ADD to BAG
		driver.findElement(By.xpath("(//span[contains(text(),'ADD TO BAG')])[1]")).click();
		//Go to Shopping Bag 
		driver.findElement(By.xpath("//button[@type='button']")).click();	
		//Print the Grand Total amount
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		String grandTotal = driver.findElement(By.xpath("//div[@class='first-col']/div[@class='value']")).getText().substring(1);
		System.out.println(grandTotal);		
		//Click Proceed
		driver.findElement(By.xpath("//span[text()='PROCEED']")).click();		
		//Click on Continue as Guest
		driver.findElement(By.xpath("//button[@type='button'][@class='btn full big']")).click();		
		//Check if this grand total is the same in step 14
		String total = driver.findElement(By.xpath("//div[text()='Grand Total']/following-sibling::div")).getText().substring(1);
		System.out.println(total);
		if(total.equals(grandTotal))
		{
			System.out.println("Total is same");
		}
		else
		{
			System.out.println("Total is different");
		}
		//Close all windows
		Thread.sleep(2000);
		driver.quit();
	}

}