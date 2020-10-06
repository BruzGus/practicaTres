package browser;

import org.openqa.selenium.WebDriver;

public class FactoryBrowser {

    public static IBrowser make(String option){
        IBrowser browser;
        switch (option.toLowerCase()){
            case "chrome":
                browser = new Chrome();
                break;
            case "firefox":
                browser = new Firefox();
                break;
            case "owasp":
                browser = new ChromeZap();
                break;
            default:
                browser = new Chrome();
                break;

        }
        return browser;
    }
}
