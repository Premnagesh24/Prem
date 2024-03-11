package New1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(5000);
		driver.findElement(By.tagName("button")).click();

		driver.findElement(By.xpath("//p[contains(text(), ' Catalog')]")).click();

		driver.findElement(By.xpath("//p[contains(text(), ' Products')]")).click();
		
		driver.findElement(By.xpath("//button[@name='download-catalog-pdf']/preceding::a[1]")).click();
		driver.quit();
	}

}
