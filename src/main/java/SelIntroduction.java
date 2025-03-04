import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// this step is optional System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\hp\\Desktop\\Eclipse\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
		driver.quit();
	}

}