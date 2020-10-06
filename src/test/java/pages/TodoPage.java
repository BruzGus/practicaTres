package pages;

import control.Label;
import org.openqa.selenium.By;

public class TodoPage {
    public Label todayLabel = new Label(By.xpath("//*[@id=\"agenda_view\"]/header/div/h1/span"));

    public TodoPage(){}
}
