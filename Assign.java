package assignment3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.chittorgarh.com/");
		options.addArguments("disable notifications");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@title='Stock Market']"));
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']"));
		Thread.sleep(8000);
		List<WebElement> elements = driver.findElements(
				By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr//th[3]"));
		Thread.sleep(8000);
		int size = elements.size();
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < size; i++) {
			String text = driver.findElement(By.xpath(
					"//table[@class='table table-bordered table-condensed table-striped']//tr[" + i + "]//th[3]"))
					.getText();
			list.add(text);
		}
		System.out.println(list);
		HashSet<String> set = new HashSet<String>(list);
		int size2 = set.size();
		if (size == size2) {
			System.out.println("there are duplicates");
		} else {
			System.out.println("No duplicates");
		}

	}

}