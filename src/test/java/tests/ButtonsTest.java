package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

public class ButtonsTest {

    @Test
    public void clickButtonTest() {
        // Sayfayı aç
        open("https://demoqa.com/elements");

        // "Buttons" öğesine tıkla
        $("[href='#buttons']").click();

        // "Click Me" düğmesine tıkla
        $("#doubleClickBtn").doubleClick();

        // Görünen mesajı al ve kontrol et
        $("#doubleClickMessage").shouldHave(Condition.text("You have done a double click"));
    }
}

