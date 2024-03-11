package New1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(5000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[contains(text(), ' Sales')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[contains(text(), ' Discounts')]")).click();
		Thread.sleep(5000);
		WebElement Nag = driver.findElement(By.xpath("//select[@id='IsActiveId']"));
		Select Selection = new Select(Nag);
		Selection.selectByVisibleText("Active only");
		Thread.sleep(3000);
		Selection.selectByVisibleText("Inactive only");
		Thread.sleep(3000);

	}

}
