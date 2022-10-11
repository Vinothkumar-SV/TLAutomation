package week1.assignment;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Textbox {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[@class='col-12']//input[@placeholder='Babu Manickam']"))
				.sendKeys("Vinoth Kumar");
		WebElement city = driver.findElement(By.xpath("//div[@class='col-12']//input[@value='Chennai']"));
		city.clear();
		city.sendKeys("Vinoth Kumar");
		driver.findElement(By.xpath("//h5[text()='Verify if text box is disabled']")).getText();
		WebElement clr = driver
				.findElement(By.xpath("//div[@class='col-12']//input[@value='Can you clear me, please?']"));
		clr.clear();
		clr.sendKeys("Automation Test Engineer");
		driver.findElement(By.xpath("//div[@class='col-12']//input[@value='My learning is superb so far.']")).getText();
		driver.findElement(By.xpath("//div[@class='col-12']//input[@placeholder='Your email and tab']"))
				.sendKeys("vinoth@gmail.com", Keys.TAB);
		driver.findElement(By.xpath("//div[@class='col-12']//textarea[@placeholder='About yourself']"))
				.sendKeys("I am Automation Tester");
		driver.findElement(By.xpath("(//div[@class='ql-container ql-snow']//div[@contenteditable='true'])[1]")).click();

		WebElement TX = driver
				.findElement(By.xpath("(//div[@class='ql-container ql-snow']//div[@contenteditable='true'])[1]"));
		TX.click();
		TX.sendKeys("Hai This is Vinoth Kumar");
		TX.getText();
		TX.clear();
		WebElement tes = driver
				.findElement(By.xpath("(//div[@class='ql-container ql-snow']//div[@contenteditable='true'])[1]"));
		tes.click();
		tes.sendKeys("Hai This is Vinoth Kumar");

		WebElement element = driver
				.findElement(By.xpath("//div[@class='col-12 mb-2 lg:col-8']//input[@role='textbox']"));

		element.sendKeys("", Keys.ENTER);

		// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));

		driver.findElement(By.xpath("//span[text()='Age is mandatory']")).getText();

		WebElement ele = driver.findElement(By.xpath("//span[@class='ui-float-label']//input[@role='textbox']"));
		ele.click();
		ele.sendKeys("", Keys.TAB);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Vinoth kumar");
		Thread.sleep(200);
		WebElement lst = driver.findElement(By.xpath("//ul[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']//li[@data-item-label='vinoth3']"));
		java.util.List<WebElement> lts = lst.findElements(By.xpath("//ul[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']//li[@data-item-label='vinoth3']"));
		lts.get(3).click();
		
		

	}
}
