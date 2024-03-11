package New1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		String val = driver.getTitle();
		Thread.sleep(5000);
		System.out.println(val);

		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);

		String url = driver.getCurrentUrl();
		System.out.println(url);
		String sourceCode = driver.getPageSource();
		Thread.sleep(5000);

		System.out.println(sourceCode);
		String WindwID = driver.getWindowHandle();
		Thread.sleep(5000);
		System.out.println(WindwID);

		driver.quit();

	}

}
