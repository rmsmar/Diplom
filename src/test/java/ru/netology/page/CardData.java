package ru.netology.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CardData {
    private SelenideElement cardNumber = $("[placeholder='0000 0000 0000 0000']");
    private SelenideElement cardExpirationMonth = $("[placeholder='08']");
    private SelenideElement cardExpirationYear = $("[placeholder='22']");
    private SelenideElement holder = $$(".input__inner").find(Condition.text("Владелец")).$(".input__control");
    private SelenideElement cvcCode = $("[placeholder='999']");
    private SelenideElement successNotification = $(withText("Успешно"));
    private SelenideElement errorNotification = $(withText("Ошибка"));
    private SelenideElement buttonContinue = $$(".button__text").find(Condition.text("Продолжить"));
    private SelenideElement wrongFormatNotification = $(".input__sub");

    public void fillCardInformationForSelectedWay(DataHelper.CardInformation cardInformation) {
        cardNumber.setValue(cardInformation.getNumber());
        cardExpirationMonth.setValue(cardInformation.getMonth());
        cardExpirationYear.setValue(cardInformation.getYear());
        holder.setValue(cardInformation.getHolder());
        cvcCode.setValue(cardInformation.getCvc());
        buttonContinue.click();
    }

    public void checkIfPaymentSuccessful() {
        successNotification.waitUntil(Condition.visible, 15000);
    }

    public void checkIfPaymentNotSuccessful() {
        errorNotification.waitUntil(Condition.visible, 15000);
    }

    public void checkIfWrongFormatOfField() {
        wrongFormatNotification.shouldBe(Condition.visible);
    }
}
