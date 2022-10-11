package automate;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {
	public static void main(String[] args) throws InterruptedException, IOException {
		//1. Launch https://www.snapdeal.com/
		//2. Go to Mens Fashion
		//3. Go to Sports Shoes
	//	4. Get the count of the sports shoes
	//	5. Click Training shoes
	//	6. Sort by Low to High
	//	7. Check if the items displayed are sorted correctly
	//	8.Select the price range (900-1200)
	//	9.Filter with color Navy 
	//	10 verify the all applied filters 
	//	11. Mouse Hover on first resulting Training shoes
	//	12. click QuickView button
	//	13. Print the cost and the discount percentage
	//	14. Take the snapshot of the shoes.
	//	15. Close the current window
	//	16. Close the main window
	WebDriverManager.chromedriver().setup();

	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");

	ChromeDriver driver = new ChromeDriver(option);

	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement men = driver.findElement(By.linkText("Men's Fashion"));
	Actions builder = new Actions(driver);
	builder.moveToElement(men).perform();
	driver.findElement(By.xpath("//span[@class='linkTest']")).click();
	driver.findElement(By.xpath("//span[@class='category-name category-count']")).click();
	driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
	driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
	driver.findElement(By.xpath("//li[@class='search-li']")).click();
	WebElement click = driver.findElement(By.xpath("//input[@class='input-filter']"));
	click.clear();
	click.sendKeys("900");
	Thread.sleep(3000);
	WebElement click2 = driver.findElement(By.name("toVal"));
	click2.clear();
	click2.sendKeys("1200");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@data-filtername='Color_s']//div")).click();
	driver.findElement(By.xpath("//button[contains(@class,'view-more-button btn')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[@for='Color_s-Yellow']")).click();
	WebElement hover = driver.findElement(By.className("product-title"));
	Actions builder1 = new Actions(driver);
	builder1.moveToElement(hover).perform();
	driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar')]")).click();
	driver.findElement(By.className("product-tuple-description ")).click();
	Set<String> windows1 = driver.getWindowHandles();
	ArrayList<String> list1 = new ArrayList<String>(windows1);
	driver.switchTo().window(list1.get(1));
	Thread.sleep(3000);
	String mrp = driver.findElement(By.xpath("//div[text()='MRP  ']")).getText();
	System.out.println("MRP:" +mrp);
	String price = driver.findElement(By.xpath("//span[text()='Rs. ']")).getText();
	System.out.println("RS:"+price);
	String percentage= driver.findElement(By.xpath("(//span[text()='12'])[2]")).getText();
	System.out.println("percentage ="+percentage);
	driver.switchTo().window(list1.get(0));
	File source1 = driver.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
   
    File dest1=new File("./snaps/screenshort1.png");
  
	FileUtils.copyFile(source1, dest1);
	//driver.switchTo().window(list1.get(0));
	driver.close();
	
 
	
	
	
	
	
}

}