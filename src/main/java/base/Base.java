package base;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Base {

		public static WebDriver driver;
		
		public static void dr() {
			driver = new ChromeDriver();
		}
			public static void url(String url) {
				driver.get(url);
		 }
		
	 public static void maximize() {
		driver.manage().window().maximize();
	}
	 public static void waits(int a) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));	
	 }
	 
	 public static void refresh() {
			driver.navigate().refresh();
	 }
	 
	 public static void scrollFoot(WebElement foo) throws InterruptedException {
			JavascriptExecutor jj = (JavascriptExecutor)driver;	
		      jj.executeScript("arguments[0].scrollIntoView()",foo);
			}
	public static void hover(WebElement a1) {
		Actions mouse = new Actions(driver);
		mouse.moveToElement(a1).perform();
	}
	 public static void windows(int a) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list= new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(a));
	}
	 public static void ss(String imgName) throws Exception {
		 TakesScreenshot screenshot= (TakesScreenshot) driver;
		   File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		   File folder= new File("C:\\Users\\chezh\\eclipse-workspace\\Makemy\\target"+imgName+".jpeg");
		   Files.copy(screenshotAs,folder);
		
	}

}
