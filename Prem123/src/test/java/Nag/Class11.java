package Nag;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class11 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(60));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.findElement(By.tagName("button")).click();

		driver.findElement(By.xpath("(//p[contains(text(),'Catalog')])[1]")).click();

		driver.findElement(By.xpath("(//p[contains(text(),'Products')])[1]")).click();

		driver.findElement(By.xpath("//button[@name='download-catalog-pdf']/preceding-sibling::a")).click();

		driver.quit();

	}

}

