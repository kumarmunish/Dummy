import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\project\\workspace\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
    	//driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
        driver.getCurrentUrl();
		
	}

}
