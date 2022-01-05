package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1FbNewAccount {

	public static void main(String[] args) {
		//Download and setup the path
		WebDriverManager.chromedriver().setup();
		//Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL https://en-gb.facebook.com
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		//Add implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//create  new account
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//form[@id='reg']/div//input[@name='firstname']")).sendKeys("Priya");
		driver.findElement(By.xpath("//form[@id='reg']/div//input[@name='lastname']")).sendKeys("G");
		driver.findElement(By.xpath("//form[@id='reg']/div//input[@name='reg_email__']")).sendKeys("9994709881");
		driver.findElement(By.xpath("//form[@id='reg']/div//input[@name='reg_passwd__']")).sendKeys("pranav@kavi");
		// Handle all three drop downs
		
		WebElement day = driver.findElement(By.xpath("//div[@id='birthday_wrapper']//select[@id='day']"));
		Select d = new Select(day);
		d.selectByValue("7");
		
		WebElement month = driver.findElement(By.xpath("//div[@id='birthday_wrapper']//select[@id='month']"));
		Select m = new Select(month);
		m.selectByVisibleText("Nov");
		
		WebElement year = driver.findElement(By.xpath("//div[@id='birthday_wrapper']//select[@id='year']"));
		Select y = new Select(year);
		y.selectByVisibleText("1990");
		
		//Select the radio button "Female"
		driver.findElement(By.xpath("//span[@data-type='radio']//label[text()='Female']/following-sibling::input[@name='sex']")).click();
		
	
		
	}
	
	}


