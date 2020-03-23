import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class testA {
    @Test
    public void ttt(){
        open("https://www.google.com/");
        $(By.name("q")).shouldNot(Condition.exist);
    }
}
