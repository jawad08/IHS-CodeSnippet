package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InitiateBrowser {

    static WebDriver driver;

    public static WebDriver startBrowser(String browserName, String baseURL){
        if(browserName.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(baseURL);
        }
        else {
            System.out.println("Programmed only for Chrome for this example. Please use Chrome");
        }

        return driver;
    }
}
