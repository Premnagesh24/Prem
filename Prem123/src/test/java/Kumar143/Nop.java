package Kumar143;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(60));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.findElement(By.tagName("button")).click();

		driver.findElement(By.xpath("(//p[contains(text(),'Catalog')])[1]")).click();
		
		String b ="//p[contains(text(),'Catalog')])[3]";
		switch(b){
		case "//p[contains(text(),'Catalog')])[1]" :
			System.out.println("Dashboard");
			break;
		case "//p[contains(text(),'Catalog')])[2]" :
			System.out.println("Catalog");
			break;
		case "//p[contains(text(),'Catalog')])[3]" :
			System.out.println("Sales");
			break;
		case "//p[contains(text(),'Catalog')])[4]" :
			System.out.println("Customers");
			break;
		case "//p[contains(text(),'Catalog')])[5]" :
			System.out.println("Promotions");
			break;
		case "//p[contains(text(),'Catalog')])[6]" :
			System.out.println("Conent managemer");
			break;
		case "//p[contains(text(),'Catalog')])[7]" :
			System.out.println("Configuration");
			break;
		case "//p[contains(text(),'Catalog')])[8]" :
			System.out.println("System");
			break;
		case "//p[contains(text(),'Catalog')])[9]" :
			System.out.println("Reports");
			break;
		case "//p[contains(text(),'Catalog')])[10]" :
			System.out.println("Help");
			break;
			default:{
			System.out.println("Please check the number");

		}
	}
	}}
//
