package New1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wrong {

	public static void main(String[] args) {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Petla nageswarao\\Downloads\\chromedriver_win32");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		boolean val = driver.findElement(By.id("Email")).isDisplayed();

		boolean val2 = driver.findElement(By.id("Remember")).isSelected();

		boolean val3 = driver.findElement(By.tagName("button")).isEnabled();

		System.out.println("Email is appearing? " + val);

		System.out.println("Remember me Checkbox is Selected? " + val2);

		System.out.println("Login Button is Enabled? " + val3);

		driver.quit();

	}

}
