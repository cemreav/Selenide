package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class WebTablesTest {

    @Test
    public void addAndEditRecordTest() {
        // Sayfayı aç
        open("https://demoqa.com/webtables");

        // "ADD" düğmesine tıkla
        $("#addNewRecordButton").click();

        // Yeni kayıt eklemek için gerekli alanları doldur
        $("#firstName").setValue("John");
        $("#lastName").setValue("Doe");
        $("#userEmail").setValue("john.doe@example.com");
        $("#age").setValue("25");
        $("#salary").setValue("50000");
        $("#department").setValue("IT");
        $("#submit").click();

        // Eklenen kaydı bul ve düzenle
        $$("#app > div > div > div.row > div > div > div.react-contextmenu.react-contextmenu--visible > ul > li").last().click(); // Son eklenen kaydı seç
        $("#edit-record-2").click(); // Düzenle düğmesine tıkla

        // Düzenleme için gerekli alanları güncelle
        $("#salary").setValue("55000");
        $("#submit").click();

        // Güncellenen kaydın görüntülenip görüntülenmediğini kontrol et
        $("[data-testid='cell-salary']").shouldHave(Condition.text("55000"));
    }
}
