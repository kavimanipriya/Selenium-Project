package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// Setup the driver
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// load the url

		driver.get("http://leaftaps.com/opentaps/");

		// how to maximize the browser
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
		// Get the title of the application

		String title = driver.getTitle();
		System.out.println(title);

		// Enter the username
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoCSR");

		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// click on the login button
		driver.findElement(By.className("decorativeSubmit")).click();

		// click on CRM/SFA

		driver.findElement(By.linkText("CRM/SFA")).click();

		// click on Leads
		driver.findElement(By.linkText("Leads")).click();

		// click on create leads
	
		driver.findElement(By.linkText("Create Lead")).click();
		//enter the details
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kavimanipriya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		

		//select option from dropdown
		WebElement source =driver.findElement(By.id("createLeadForm_dataSourceId"));
		
				Select dd =new Select(source);
				
		//dd.selectByIndex(3);
		dd.selectByValue("LEAD_WEBSITE");
		
		// to submit the details
		
		driver.findElement(By.name("submitButton")).click();
		// closing the browser
		driver.close();

	}

}
