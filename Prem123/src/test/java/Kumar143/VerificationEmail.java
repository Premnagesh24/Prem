package Kumar143;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationEmail {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

       boolean appear = driver.findElement(By.id("Email")).isDisplayed();
       
       if(appear==true) {
    	   System.out.println("Login page got loaded successfully");
    	   driver.findElement(By.tagName("button"));
       }
       else {
    	   System.out.println("Page refresh is succesfully");
    	   driver.navigate().refresh();
     
       }
       driver.quit();
	}

}
