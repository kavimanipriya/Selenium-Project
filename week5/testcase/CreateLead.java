package week5.testcase;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
	
@Test(dataProvider="fetchData")
	public void createLead(String cName,String fName,String lName)  {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kavi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		driver.findElement(By.name("submitButton")).click();
		//driver.close();
}
@DataProvider (name ="fetchData")
public String [][] sendData(){


String [][] data =new String [2][3];
data[0][1]="Testleaf";
data[0][2]="Kavi";
data[0][3]="G";

data[1][0]="Lennox";
data[0][2]="Priya";
data[0][3]="V";
 return data;

}
}

/*WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
*/
