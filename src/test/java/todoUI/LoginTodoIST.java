package todoUI;

import control.Label;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.junit4.DisplayName;
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
    @DisplayName("Verify the Login on page TODOISL.COM with user and password")
    @Description("This test case is to verify the attack of vulnerability using user and password")
    @Owner("BRYAN AUGUSTO CRUZ CASTRO")
    public void testLoginTodoISL(){

        mainPage.loginButton.click();

        loginPage.email.type("bryan.cc.652@gmail.com");
        loginPage.password.type("13r4An13r4An");
        loginPage.loginButton.click();

        Assert.assertTrue("ERROR: No se puede realizar el login",todoPage.todayLabel.isDisplayed());
    }

    @After
    public void After(){
        Session.getInstance().closeBrowser();

    }

}
