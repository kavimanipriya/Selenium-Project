package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnxPath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads')]")).click();
		driver.findElement(By.linkText("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		driver.findElement(By.id("//input[@id='createLeadForm_firstName']")).sendKeys("Kmp");
		driver.findElement(By.id("//input[@id='createLeadForm_lastName']")).sendKeys("Guna");
		driver.findElement(By.name("submitButton")).click();
		driver.close();
		
			
			
	}

}
