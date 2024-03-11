package Nag;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4 {
	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		Thread.sleep(7000);

		driver.findElement(By.xpath("//input[@name='Email']")).clear();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("admin@yourstore.com");

		driver.findElement(By.xpath("//input[@id='Password']")).clear();
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(5000);

		driver.quit();

	}

}
