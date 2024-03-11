package Nag;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class10 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/alerts");

		Thread.sleep(7000);

//		driver.findElement(By.id("alertButton")).click();
//
//		Thread.sleep(3000);
//
//		Alert popup = driver.switchTo().alert();
//		
//		Thread.sleep(3000);
//
//		popup.accept();
//		
//		Thread.sleep(3000);
//
//		driver.switchTo().defaultContent();
//
//		Thread.sleep(3000);

//		driver.findElement(By.id("confirmButton")).click();
//		
//		Thread.sleep(3000);
//		
//		Alert popup2 = driver.switchTo().alert();
//		
//		popup2.dismiss();
//		
//		Thread.sleep(3000);
//		
//		driver.switchTo().defaultContent();
//		
		Thread.sleep(3000);

		driver.findElement(By.id("promtButton")).click();

		Thread.sleep(3000);

		Alert popup = driver.switchTo().alert();

		Thread.sleep(3000);

		String val = popup.getText();

		System.out.println(val);

		Thread.sleep(3000);

		popup.sendKeys("Hello Darling");

		Thread.sleep(3000);

		popup.accept();

		Thread.sleep(3000);

		driver.switchTo().defaultContent();

		Thread.sleep(3000);

		driver.quit();

	}

}



