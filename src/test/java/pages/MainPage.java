package pages;

import control.Button;
import org.openqa.selenium.By;

public class MainPage {
    public Button loginButton = new Button(By.xpath("//ul/li[1]/a[@href='/users/showlogin']"),"[LOGIN] button on Main Page");

    public MainPage(){}

}
