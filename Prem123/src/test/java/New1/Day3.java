package New1;

import java.util.Set;

import javax.swing.plaf.synth.SynthScrollBarUI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		String val = driver.getTitle();
		Thread.sleep(5000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("///p[contains(text(), 'Help')]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//p[contains(text(), ' Training')]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//p[contains(text(), ' Documentation')]")).click();
		Thread.sleep(5000);
		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds);
		Thread.sleep(5000);
		driver.quit();

	}

}
