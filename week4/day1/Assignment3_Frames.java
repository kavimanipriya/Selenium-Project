package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3_Frames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.switchTo().frame("frame1");
		WebElement topic = driver.findElement(By.xpath("//b[@id='topic']/following::input"));
		topic.sendKeys("This is handled by selenium ");
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='animals']"));
		Select dropdown1 = new Select(dropdown);
		dropdown1.selectByIndex(3);
		driver.close();

	}

}
