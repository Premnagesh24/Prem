package Nag;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {
	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		Thread.sleep(5000);

		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");

		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys("admin");

		driver.findElement(By.tagName("button")).click();

		Thread.sleep(7000);

		driver.findElement(By.partialLinkText("copyright rem")).click();

		Thread.sleep(5000);

		driver.quit();

	}

}


