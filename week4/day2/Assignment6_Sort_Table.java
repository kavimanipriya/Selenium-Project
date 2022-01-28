package week4.day2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Assignment6_Sort_Table {

		public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://www.leafground.com/pages/sorttable.html");
			//driver.manage().window().maximize();

			int row = driver.findElements(By.xpath("//table//tr")).size();

			List<String> Names = new ArrayList<String>();
			for (int i = 1; i < row; i++) {
			String names = driver.findElement(By.xpath("//table//tr[" + i + "]//td[2]")).getText();
			Names.add(names);
			Collections.sort(Names);
			}
			System.out.println(Names);
			driver.findElement(By.xpath("//th[text() = 'Name']")).click();

			int rows1 = driver.findElements(By.xpath("//table//tr")).size();
			List<String> Name1 = new ArrayList<String>();
			for (int i = 1; i < rows1; i++) {
			String n1 = driver.findElement(By.xpath("//table//tr[" + i + "]//td[2]")).getText();
			Name1.add(n1);
			}
			System.out.println(Name1);

			if (Names.equals(Name1)) {
				System.out.println("Both  names are same");
			} else {
				System.out.println("Both names are not same");
			}
		}
	}

