package marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		/*
		 * WebDriverManager.firefox().setup(); FirefoxDriver driver = new
		 * FirefoxDriver(); Testcase 2 (RedBus) 01) Launch Firefox / Chrome 02) Load
		 * https://www.redbus.in/ 03) Type "Chennai" in the FROM text box hint:
		 * Sendkeys(Keys.ENTER) 04) Type "Bangalore" in the TO text box 05) Select
		 * tomorrow's date in the Date field 06) Click Search Buses 07) Print the number
		 * of buses shown as results (104 Buses found) 08) Choose SLEEPER in the left
		 * menu 09) Print the name of the second resulting bus 10) Click the VIEW SEATS
		 * of that bus 11) Take screenshot and close browser
		 */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5);
		WebElement from = driver.findElement(By.xpath("//input[@id='src']"));
		from.sendKeys("Chennai");
		driver.findElement(By.xpath("//li[@data-id='123']")).click();
		from.sendKeys(Keys.TAB);
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[@data-id='122']")).click();
		to.sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//td[text()='7']")).click();
		driver.findElement(By.id("search_btn")).click();
		String noofbus = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println(noofbus);
		driver.findElement(By.xpath("//label[@title='SLEEPER']")).click();
		String busname = driver.findElement(By.xpath("(//div[contains(@class,'travels lh-24')])[2]")).getText();
		System.out.println(busname);
		driver.findElement(By.xpath("(//div[text()='View Seats'])[2]")).click();
		File source = driver.getScreenshotAs(OutputType.FILE);
        //Create physicalFile
        File dest=new File("./snaps/screenshort.png");
        //copy the source to destination
        FileUtils.copyFile(source, dest);

}
}