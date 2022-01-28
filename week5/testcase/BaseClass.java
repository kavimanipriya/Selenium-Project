package week5.testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public ChromeDriver driver;
	public string fileName;
	@Parameters ({"url","userName","password"})
		@BeforeMethod
	  public void beforeMethod(String cName,String fName,String lName ) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }

	@DataProvider (name="fetchData")
	public String[][] sendData() throws IOException
	return ReadExcel.readExcel(fileName);
	
	
}
