package assignment3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Led {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Type your name
		driver.findElement(By.xpath("//input[@id='j_idt88:name']")).sendKeys("Gomathy Shri");
		// Append Country to this City
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys(",India");
		boolean enabled = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']")).isEnabled();
		if (enabled == false) {
			System.out.println("Textbox is disabled");
		} else {
			System.out.println("Textbox is enabled");
		}
		// Clear the typed text
		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
		String text = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']"))
				.getAttribute("Value");
		System.out.println(text);
		Thread.sleep(10000);

		WebElement emailElement = driver
				.findElement(By.xpath("//div[@class='col-12']//input[@placeholder='Your email and tab']"));
		emailElement.click();
		emailElement.sendKeys("gomathyshri.v19@gmail.com", Keys.TAB);

		driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
		WebElement ErrorMsgWebElement = driver
				.findElement(By.xpath("//span[@class='ui-message-error-icon']/following-sibling::span"));

		String ageErrorMsg = ErrorMsgWebElement.getText();
		String str = "Age is mandatory";
		if (ageErrorMsg.equals(str)) {
			System.out.println("Error Message is printed");
		}

		driver.findElement(By.xpath("//input[@id='j_idt106:float-input']")).click();

		WebElement oldLabel = driver.findElement(By.xpath("//label[text()='Username']"));
		org.openqa.selenium.Point location = oldLabel.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println(x);
		System.out.println(y);

		driver.findElement(By.xpath("//input[@id='j_idt106:float-input']")).click();
		WebElement newLabel = driver.findElement(By.xpath("//label[text()='Username']"));
		org.openqa.selenium.Point location2 = newLabel.getLocation();
		int x1 = location2.getX();
		int y1 = location2.getY();
		System.out.println(x1);
		System.out.println(y1);

	}

}