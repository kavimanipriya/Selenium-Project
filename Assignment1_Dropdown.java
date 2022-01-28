package week4.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1_Dropdown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions builder = new Actions(driver);

		driver.findElement(By.xpath("//option[text()='Select your programs']")).click();
		WebElement option1 = driver.findElement(By.xpath("(//option[text()='Selenium'])[6]"));
		WebElement option2 = driver.findElement(By.xpath("(//option[text()='UFT/QTP'])[6]"));
		builder.keyDown(Keys.CONTROL).click(option1).click(option2).keyUp(Keys.CONTROL).perform();
		System.out.println("Action completed");
		driver.close();

}
}