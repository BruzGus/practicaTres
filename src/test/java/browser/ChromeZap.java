package browser;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ChromeZap implements IBrowser {
    @Override
    public WebDriver create() {
        String driverPath = "C:\\Users\\augus\\IdeaProjects\\modulo4\\practicaTres\\src\\test\\resources\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);

        Proxy proxy = new Proxy();
        proxy.setHttpProxy("127.0.0.1:8888");
        proxy.setSslProxy("127.0.0.1:8888");

        ChromeOptions options = new ChromeOptions();
        options.setCapability("credential_enable_service",false);  // preferencias
        options.setProxy(proxy);                                                     // proxy
        options.addArguments("ignore-certificate-errors");                           // argumentos

        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        return driver;
    }
}
