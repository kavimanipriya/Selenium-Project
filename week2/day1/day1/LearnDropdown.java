package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {

	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver= new ChromeDriver();
			driver.get("http://www.leafground.com/pages/Dropdown.html");
			driver.manage().window().maximize();
			
			//locate the ele with select tag
			WebElement	dd= driver.findElement(By.id("dropdown1"));
			
			//create the object for Select class
			Select dropdown= new Select (dd);
			
			//choose the option
			
			//dropdown.selectByVisibleText("Appium");
			//dropdown.selectByValue("2");
			//dropdown.selectByIndex(0);
			
			int size=dropdown.getOptions().size();
			dropdown.selectByIndex(size-2);
			WebElement SelectedElement =dropdown.getFirstSelectedOption();
			
			
			
			
	}

}
