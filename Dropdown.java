package week1.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node010eue2ttokg0f1dyt0bi6nszc5263801.node0");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		Select tool = new Select(driver.findElement(By.xpath("//select[@class='ui-selectonemenu']")));
		tool.selectByIndex(1);

		driver.findElement(By.xpath("//label[text()='Select Country']")).click();

		driver.findElement(By.xpath("//li[text()='India']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Choose Course']")).sendKeys("Playwright");
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		driver.findElement(By.xpath("//li[text()='English']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[4]")).click();

		driver.findElement(By.xpath("//li[text()='Two']")).click();

		/*
		 * Actions ac = new Actions(driver);
		 * ac.click(driver.findElement(By.xpath("//li[text()='India']"))).build().
		 * perform();
		 * 
		 * driver.findElement(By.xpath("//label[text()='Select City']")).click();
		 * Actions city = new Actions(driver); city.click(driver.findElement(By.
		 * xpath("//ul[@role='listbox']//li[text()='Select City']"))).build().perform();
		 * 
		 * Actions cit = new Actions(driver);
		 * cit.click(driver.findElement(By.xpath("//li[text()='Chennai']"))).build().
		 * perform();
		 * 
		 * 
		 * driver.findElement(By.xpath("//label[@id='j_idt87:country_label']")).click();
		 * driver.findElement(By.xpath("//li[text()='Germany']")).click();
		 * Thread.sleep(5000); List<WebElement> cityElements =
		 * driver.findElements(By.xpath("//div[@id='j_idt87:city_panel']//li")); for
		 * (WebElement webElement : cityElements) {
		 * 
		 * System.out.println(webElement.getText()); } System.out.println(cityElements);
		 * 
		 * driver.findElement(By.xpath("//button[@type='button']")).click(); Actions
		 * course = new Actions(driver); course.click(driver.findElement(By.
		 * xpath("//li[@data-item-label='Selenium WebDriver']"))).build().perform();
		 * 
		 * driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		 * Actions lang = new Actions(driver);
		 * lang.click(driver.findElement(By.xpath("//li[text()='English']"))).build().
		 * perform();
		 * 
		 */
	}

}
