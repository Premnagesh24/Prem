package New1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

	
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(5000);
		
		boolean val = driver.findElement(By.id("Email")).isDisplayed();
		
		boolean val2 = driver.findElement(By.id("Remember")).isSelected();

		boolean val3 = driver.findElement(By.tagName("button")).isEnabled();
		
		System.out.println("Email is appearing? " + val);
		
		System.out.println("Remember me Checkbox is Selected? " + val2);
		
		System.out.println("Login Button is Enabled? " + val3);
		
		driver.quit();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		String val = driver.findElement(By.tagName("Button")).getTagName();
		System.out.println(val);
	
		String val1 = driver.findElement(By.id("Email")).getTagName();
		System.out.println(val1);
		
		String val2 = driver.findElement(By.id("Email")).getAttribute("tagName");
		System.out.println(val2);

		
		  String val3 = driver.findElement(By.id("Email")).getAttribute("class");
		  System.out.println(val3);
		  
		  
		  driver.findElement(By.id("Email")).clear();
		  driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		  driver.findElement(By.id("Password")).clear();
		  driver.findElement(By.id("Password")).sendKeys("admin", Keys.TAB, Keys.TAB,
		  Keys.ENTER);
		 */

	}

}
