package Kumar143;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForEach {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
  List<WebElement> allinputs=driver.findElements(By.xpath("//Input"));
		
 for (WebElement input :allinputs )  {
	 
	 String val =input.getAttribute("name");
	 System.out.println(val);
	}
 Thread.sleep(5000);
 driver.quit();
	}
}
