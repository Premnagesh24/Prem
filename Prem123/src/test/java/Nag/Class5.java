package Nag;

import org.openqa.selenium.chrome.ChromeDriver;

public class Class5 {
	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		String val = driver.getTitle();

		System.out.println(val); // Your store. Login

		String sourceCode = driver.getPageSource();

//		System.out.println(sourceCode);

		String windowId = driver.getWindowHandle();

		System.out.println(windowId);
		
		
		driver.quit();
		


	}

}
