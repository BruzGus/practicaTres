package control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;

public class ControlSelenium {
    protected WebElement webElement;
    protected By locator;
    
    public ControlSelenium (By locator){
        this.locator = locator;
    }

    protected void findElement(){
        this.webElement = Session.getInstance().getDriver().findElement(this.locator);
    }

    public void click(){
        this.findElement();
        this.webElement.click();
    }

    public void type(String value){
        this.findElement();
        this.webElement.sendKeys(value);
    }

    public boolean isDisplayed(){
        this.findElement();
        return this.webElement.isDisplayed();
    }




}
