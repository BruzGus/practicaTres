package todoUI;

import control.Label;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.TodoPage;
import session.Session;

public class LoginTodoIST {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    TodoPage todoPage = new TodoPage();


    @Before
    public void Before(){
        Session.getInstance().getDriver().get("https://todoist.com/");
    }

    @Test
    public void testLoginTodoISL(){

        mainPage.loginButton.click();

        loginPage.email.type("bryan.cc.652@gmail.com");
        loginPage.password.type("13r4An13r4An");
        loginPage.loginButton.click();

        Assert.assertTrue(todoPage.todayLabel.isDisplayed());




    }

    @After
    public void After(){
        Session.getInstance().closeBrowser();

    }

}
