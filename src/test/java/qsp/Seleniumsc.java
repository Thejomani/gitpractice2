package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumsc {
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();

      
        driver.manage().window().maximize();

        
        driver.get("https://www.google.com");

       Thread.sleep(5);
        driver.quit();
    }
}
