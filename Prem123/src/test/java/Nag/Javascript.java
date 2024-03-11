package Nag;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		Thread.sleep(5000);

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

		jsExecutor.executeScript("document.getElementById('Email').value='admin@yourstore.com';");

		Thread.sleep(5000);

		jsExecutor.executeScript("document.getElementById('Email').style.border=\"5px red solid\";");

		Thread.sleep(5000);

		jsExecutor.executeScript("document.getElementById('Email').style.background=\"yellow\";");

		Thread.sleep(5000);

		jsExecutor.executeScript("document.getElementsByTagName('button')[0].click();");

		Thread.sleep(5000);

		jsExecutor.executeScript("window.scrollTo(0, 800);");

		Thread.sleep(5000);

		jsExecutor.executeScript("window.scrollBy(0, 800);");

		Thread.sleep(5000);

		jsExecutor.executeScript("document.getElementsByClassName('card-title')[10].scrollIntoView();");

		Thread.sleep(5000);

		driver.quit();

	}

}

