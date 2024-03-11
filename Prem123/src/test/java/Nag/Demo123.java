package Nag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo123 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.xpath("email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password"));
		driver.findElement(By.id("Password")).sendKeys("admin");
		driver.findElement(By.tagName("button")).click();
		
		
	}

}
