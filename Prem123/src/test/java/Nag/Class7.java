package Nag;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	 public class Class7 {

		public static void main(String[] args) throws Exception {

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

			Thread.sleep(5000);

			driver.findElement(By.tagName("button")).click();

			Thread.sleep(5000);

			driver.findElement(By.xpath("(//p[contains(text(), 'Catalog')])[1]")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("(//p[contains(text(), 'Products')])[1]")).click();

			Thread.sleep(5000);

			WebElement category = driver.findElement(By.id("SearchCategoryId"));

			Select selection = new Select(category);

			selection.selectByVisibleText("Electronics");

			Thread.sleep(3000);

			selection.selectByVisibleText("Books");

			Thread.sleep(3000);

			selection.selectByVisibleText("Jewelry");

			Thread.sleep(3000);

			selection.selectByValue("13");

			Thread.sleep(3000);

			selection.selectByIndex(2);

			Thread.sleep(7000);

			driver.quit();

		}

	}

