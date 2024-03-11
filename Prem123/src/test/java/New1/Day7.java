package New1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(5000);
		driver.findElement(By.id("alertButton")).click();
		Alert popup =driver.switchTo().alert();
		popup.accept();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
	
		driver.findElement(By.id("confirmButton")).click();
	
		Thread.sleep(3000);
		
		Alert popup2 = driver.switchTo().alert();
		
		popup2.dismiss();
		
	Thread.sleep(3000);
		
		driver.switchTo().defaultContent();		
		Thread.sleep(3000);

		driver.findElement(By.id("promtButton")).click();

		Thread.sleep(7000);

		Alert popup1 = driver.switchTo().alert();

		Thread.sleep(7000);

		String val = popup1.getText();

		System.out.println(val);

		Thread.sleep(7000);

		popup1.sendKeys("Hello Darling");

		Thread.sleep(7000);

		popup1.accept();

		Thread.sleep(7000);

		driver.switchTo().defaultContent();

		Thread.sleep(7000);

		driver.quit();

	}



		
		
		
		
		
		
		

		
		
		
	}

