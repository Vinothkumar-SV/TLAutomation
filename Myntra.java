package automate;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {
	public static void main(String[] args) throws InterruptedException, IOException {
		
	WebDriverManager.chromedriver().setup();
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
	
			ChromeDriver driver = new ChromeDriver(option);
	        //1) Open https://www.myntra.com/
			driver.get("https://www.myntra.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        //2) Mouse hover on MeN 
			WebElement men = driver.findElement(By.xpath("(//a[@data-group='men'])/parent::div"));
			Actions builder = new Actions(driver);
			builder.moveToElement(men).perform();
		    //3) Click Jackets 
			driver.findElement(By.xpath("//a[text()='Jackets']")).click();
	        //	4) Find the total count of item 
			String count = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
			System.out.println("Total count:"+count);
			// 5) Validate the sum of categories count matches
			
			// 6) Check jackets
			driver.findElement(By.xpath("//label[@class='common-customCheckbox vertical-filters-label']")).click();
	        //	7) Click + More option under BRAND
			driver.findElement(By.xpath("//div[@class='brand-more']")).click();
			// 8) Type Duke and click checkbox
			driver.findElement(By.xpath("//input[@placeholder='Search brand']")).sendKeys("Duke");
			driver.findElement(By.xpath("//label[@class=' common-customCheckbox']")).click();
	        //	9) Close the pop-up x
			driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
	        //	10) Confirm all the Coats are of brand Duke
			// Hint : use List
			Thread.sleep(3000);		
			List<WebElement> coats = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']"));
			for (WebElement string1 : coats) {
				String coats1 = string1.getText();
				System.out.println(coats1);
			}
			    Thread.sleep(2000);
			// 11) Sort by Better Discount
			    driver.findElement(By.xpath("//span[@class='myntraweb-sprite sort-downArrow sprites-downArrow']")).click();
				driver.findElement(By.xpath("//input[@value='discount']")).click();
	        //	12) Find the price of first displayed item
				String text = driver.findElement(By.xpath("//span[@class='product-discountedPrice']")).getText();
				System.out.println("Price"+text);
	        //	Click on the first product
				
				driver.findElement(By.xpath("//img[@title='Duke Men Grey Padded Jacket']")).click();
				Set<String> windows1 = driver.getWindowHandles();
				ArrayList<String> list = new ArrayList<String>(windows1);
				driver.switchTo().window(list.get(1));
				Thread.sleep(3000);
	        //	13) Take a screen shot
				//Thread.sleep(3000);
				File source2 = driver.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
				File dest2=new File("./snaps/screenshort2.png");
				FileUtils.copyFile(source2, dest2);
	        //	14) Click on WishList Now
				driver.findElement(By.xpath("//span[text()='WISHLIST']")).click();
				
	        //	15) Close Browser
	   
		}
	
	
}

