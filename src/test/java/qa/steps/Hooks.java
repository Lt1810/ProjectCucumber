package qa.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import qa.utils.Constants1;

public class Hooks {
	@Before
	public void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Constants1.driver = new ChromeDriver();
		Constants1.driver.manage().window().maximize();
		Constants1.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
	
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		Constants1.driver.quit();
	}
}
