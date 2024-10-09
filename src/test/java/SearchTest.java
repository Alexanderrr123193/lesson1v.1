import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
public class SearchTest {
    @Test
    void successfulSearchTest() {
        Configuration.pageLoadStrategy = "eager";
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        // Проверка наличия результатов поиска
        $("[id=search]").shouldBe(visible);
        $("[id=search]").shouldHave(text("https://ru.selenide.org"));
    }
}

