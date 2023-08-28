package com.example;

/**
 * Hello world!
 */
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {
	
		

			// Creating an instance of Firefox Browser
			WebDriver driver = new ChromeDriver();
			String iamneo = "http://iamneo.ai";
			String facebookUrl = "https://www.facebook.com";

			public void invokeBrowser() {
				System.setProperty("webdriver.gecko.driver",
						"C:\\SelinumDrivers\\geckodriver.exe");
				//System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM SOFTWARES\\chromedriver.exe");
				driver = new FirefoxDriver();

				driver.manage().window().maximize();

				driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

				driver.get(iamneo);

				
			}

			public void navigateCommands() {
				driver.navigate().to(facebookUrl);
				driver.navigate().back();

				String currentUrl = driver.getCurrentUrl();

				System.out.println("Current URL :: " + currentUrl);
				//driver.navigate().back();

				//driver.navigate().refresh();
				driver.navigate().forward();
				driver.navigate().refresh();
				 
				//driver.close();
			}
			public void quitDriver()
			{
				driver.quit();
			}

			public static void main(String[] args) {
				NavigateWebsites nw = new NavigateWebsites();

				nw.invokeBrowser();
				nw.navigateCommands();
                 nw.quitDriver();
			}

	}
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
