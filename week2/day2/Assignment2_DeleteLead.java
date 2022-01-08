package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2_DeleteLead {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.id("username"));

		userName.sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
	
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);

		WebElement gridvalue = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a[1]"));
		String firstlead = gridvalue.getText();
		System.out.println(firstlead);
		gridvalue.click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(firstlead);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement noValue = driver.findElement(By.xpath("//div[contains(text(),'No records')]"));
		String expectedvalue= noValue.getText();
		if (expectedvalue.contains("No records to display")) {
			System.out.println("Lead ID is deleted");
		} else
			System.out.println("Lead ID not deleted");
		driver.close();
	}
}
