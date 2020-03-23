import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class testA {
    @Test
    public void ttt(){
        open("https://www.google.com/");
        Assert.assertTrue(false);
    }
}
