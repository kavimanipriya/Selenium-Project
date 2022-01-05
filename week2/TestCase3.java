package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) {
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
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("KMPriya");
		String firstName1 = firstName.getAttribute("value");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gunasekaran");
		WebElement dd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown = new Select(dd);
		dropdown.selectByIndex(7);
		WebElement dd1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropdown1 = new Select(dd1);
		dropdown1.selectByIndex(3);
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("KMPriya");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Gunasekaran");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("11/07/90");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("QA Architect");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10.5");
		driver.findElement(By.id("createLeadForm_currencyUomId"));
		WebElement dd2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown2 = new Select(dd2);
		dropdown2.selectByValue("IND_TELECOM");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
		WebElement dd3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdown3 = new Select(dd3);
		dropdown3.selectByIndex(3);
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("2");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("YES");
		driver.findElement(By.id("createLeadForm_description"))
				.sendKeys("sampletestdescription to display");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Kindly note the following fields are mandatory to display in this application");
		// Contact Information
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9994709881");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("78");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Kavi");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("07");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("kavipriya.com");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testkavi@gmail.com");
		// Primary Address
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Alpha");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Beta");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("32");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("lakepark view");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Plano");
		WebElement dd4 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown4 = new Select(dd4);
		dropdown4.selectByIndex(2);
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("75080");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("7689");
		// print the firstName
		System.out.println(firstName1);

		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
