package Nag;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class6 {
	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.findElement(By.tagName("button")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[contains(text(), 'Help')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[contains(text(), ' Training')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[contains(text(), 'Documentation')]")).click();

		Thread.sleep(2000);

		Set<String> allIds = driver.getWindowHandles();

		System.out.println(allIds);

		Thread.sleep(5000);

		driver.quit();

	}

}
