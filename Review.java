package assignment3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Review {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("(//div[@class='subSectionBlock']//a)[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> list= new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		driver.switchTo().window(list.get(0));
		driver.findElement(By.xpath("(//div[@class='subSectionBlock']//a)[2]")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		ArrayList<String> list1= new ArrayList<String>(windowHandles1);
		driver.switchTo().window(list1.get(1));
		driver.findElement(By.xpath("(//div[@class='gwtWidget subSectionBlock']//tr)[6]//a")).click();
		driver.switchTo().window(list.get(0));
		driver.findElement(By.className("buttonDangerous")).click();
		driver.switchTo().alert().accept();
		
		
	}

}