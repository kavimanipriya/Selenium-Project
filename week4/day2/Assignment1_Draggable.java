package week4.day2;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Assignment1_Draggable {

		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://jqueryui.com/draggable");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebElement frame1 = driver.findElement(By.tagName("iframe"));
			driver.switchTo().frame(frame1);
			WebElement dragEle = driver.findElement(By.id("draggable"));
			
			Actions builder = new Actions(driver);
			builder.dragAndDropBy(dragEle, 50, 20).click().build().perform();
			driver.switchTo().parentFrame();
			System.out.println(" Dragging completed");
			//driver.close();
			}

	}