package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2_DuplicateLead {

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();

	driver.get( "http://leaftaps.com/opentaps/control/login");
	
		driver.manage().window().maximize();
		//getting error on this line
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement userName=driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("testlf@gmail.com");
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
		
		String firstentry = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
        System.out.println(firstentry);
        
        WebElement leadText=driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a[1]"));
        leadText.click();
        
        driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
        String titleExpected="Duplicate Lead";
        System.out.println(driver.getTitle());
        
        if(driver.getTitle().contains(titleExpected))
        {
        	System.out.println("Title matches");
        	        	
        }else
        	System.out.println("Title not match");
        
        driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
        String captuLead=driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
        if(captuLead.equals(firstentry))
        {
        	System.out.println("Both IDs are same");
        }else
        	System.out.println("Both IDs are not same");
        driver.close();
        }

	}


