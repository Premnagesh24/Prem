package New1;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day10 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		
		Actions action =new Actions(driver);
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();

		Thread.sleep(3000);

		Actions action1 = new Actions(driver);

		action1.moveToElement(driver.findElement(By.xpath("//span[contains(text(), 'Electronics')]"))).perform();

		Thread.sleep(5000);

		action1.moveToElement(driver.findElement(By.xpath("//span[contains(text(), 'Women')]"))).perform();

		Thread.sleep(5000);
		
		action1.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Sarees')]"))).perform();
		
		Thread.sleep(4000);
		
		action1.click().perform();
		
		Thread.sleep(7000);

		driver.quit();

	}
	}


