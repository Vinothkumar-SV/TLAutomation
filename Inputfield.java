package week1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Inputfield {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.leafground.com/input.xhtml  ");
		driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']")).sendKeys("Vinothh Kumar");
		WebElement element = driver.findElement(By.xpath("//input[@value='Chennai']"));
		element.clear();
		element.sendKeys("Trichy");
		String txt = driver.findElement(By.xpath("//h5[text()='Verify if text box is disabled']")).getText();
		System.out.println(txt);

		WebElement ele = driver.findElement(By.xpath("//input[@value='Can you clear me, please?']"));
		ele.clear();
		ele.sendKeys("vinoth Kumar");
		ele.getAttribute("value");

		WebElement rerive = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']"));
		rerive.sendKeys(Keys.CONTROL + "a");
		rerive.sendKeys(Keys.CONTROL + "c");
		rerive.clear();
		rerive.sendKeys(Keys.CONTROL + "v");

		driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys("vinothkumarsv9@gmial.com",
				Keys.TAB);
		driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).sendKeys("I Am Automation tester");
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys("vinoth Kumar",
				Keys.CONTROL + "a");
		driver.findElement(By.xpath("(//span[@class='ql-picker-label'])[1]")).click();
		driver.findElement(By.xpath("(//span[@data-value='monospace'])[1]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'col-12 mb-2')]//input[1]")).sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//span[@class='ui-float-label']//input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("vinoth");
		driver.findElement(By.xpath("//span[@role='listbox']//li[4]")).click();
		driver.findElement(By.xpath("//span[contains(@class,'p-datepicker ui-calendar')]//input[1]"))
				.sendKeys("03/18/1995");
		driver.findElement(By.xpath("//span[contains(@class,'ui-spinner ui-widget')]//input[1]")).sendKeys("10");
		driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-n']")).click();
		driver.findElement(By.xpath("//input[@id='j_idt106:slider']")).sendKeys("35");
		driver.findElement(By.xpath("//input[contains(@class,'ui-inputfield ui-keyboard-input')]")).click();
		driver.findElement(By.xpath("//button[text()='9']")).click();
		driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).sendKeys("I am redy to Automate",
				Keys.CONTROL + "a");
		driver.findElement(By.xpath("(//span[@class='ql-picker-label'])[6]")).click();
		driver.findElement(By.xpath("(//span[@data-value='monospace'])[2]")).click();

	}
}
