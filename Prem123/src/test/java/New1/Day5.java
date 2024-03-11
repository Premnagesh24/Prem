package New1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(5000);

		boolean val = driver.findElement(By.id("Email")).isDisplayed();

		boolean val2 = driver.findElement(By.id("RememberMe")).isSelected();

		boolean val3 = driver.findElement(By.tagName("buttons")).isEnabled();

		System.out.println("Email is appearing? " + val);

		System.out.println("Remember me Checkbox is Selected? " + val2);

		System.out.println("Login Button is Enabled? " + val3);

		driver.quit();

	}

}
