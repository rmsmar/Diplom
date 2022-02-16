package ru.netology.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;

public class TripPage {
    private SelenideElement buttonBuyByDebit = $$(".button__text").find(Condition.text("Купить"));
    private SelenideElement buttonBuyCredit = $$(".button__text").find(Condition.text("Купить в кредит"));

    public CardData selectBuyByDebitCard() {
        buttonBuyByDebit.click();
        return new CardData();
    }

    public CardData selectBuyByCreditCard() {
        buttonBuyCredit.click();
        return new CardData();
    }
}
