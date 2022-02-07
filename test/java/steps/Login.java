package steps;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
public ChromeDriver driver;
	
	@Given("Launch the Browser")
	public void launch_the_browser() {
		  WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
	}

	@Given("Load the URL")
	public void load_the_url() {
		driver.get("http://leaftaps.com/opentaps");
}

	@Given("Enter UserName as {string}")
	public void enter_user_name(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName);
		
	}

	@Given("Enter Password as {string}")
	public void enter_password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@Given("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
}
