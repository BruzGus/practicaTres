package browser;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Chrome implements IBrowser {
    @Override
    public WebDriver create() {
        String driverPath = "C:\\Users\\augus\\IdeaProjects\\modulo4\\practicaTres\\src\\test\\resources\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        return driver;
    }
}
