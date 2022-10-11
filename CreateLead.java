package week1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String titleOfThePage1 = driver.getTitle();
		System.out.println(titleOfThePage1);
		// 4. Enter UserName
		WebElement userNameTextBox = driver.findElement(By.id("username"));
		userNameTextBox.sendKeys("demosalesManager");

		// 5. Enter Password
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		passwordTextBox.sendKeys("crmsfa");

		// 6. Click Login
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();

		// 7. Click CRM/SFA
		WebElement linkText = driver.findElement(By.linkText("CRM/SFA"));
		linkText.click();

		// 8. Click Contacts Tab
		WebElement clickContactTab = driver.findElement(By.linkText("Contacts"));
		clickContactTab.click();

		// 9. Click Create Contact
		WebElement clickCreateContactLink = driver.findElement(By.linkText("Create Contact"));
		clickCreateContactLink.click();

		WebElement firstNameField = driver.findElement(By.id("firstNameField"));
		firstNameField.sendKeys("Vinoth Kumar");
		String myname = firstNameField.getAttribute("value");
		System.out.println("Entered Firstname is :  " + myname);

		WebElement lastNameField = driver.findElement(By.id("lastNameField"));
		lastNameField.sendKeys("Sanmugaraj");
		String lName = lastNameField.getAttribute("value");
		System.out.println("Entered Last name is : " + lName);
		WebElement clickCreateContactButton = driver.findElement(By.name("submitButton"));
		clickCreateContactButton.click();

		WebElement printFirstNameField = driver.findElement(By.id("viewContact_firstName_sp"));
		String firstName = printFirstNameField.getText();
		System.out.println("Output in First Name is : " + firstName);

		String titleOfThePage = driver.getTitle();
		System.out.println("Title of the page is " + titleOfThePage);

		driver.close();

	}

}
