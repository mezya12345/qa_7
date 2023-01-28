package ru.mail;

import ru.mail.data.Card;
import ru.mail.data.MasterCard;
import ru.mail.data.VisaCard;

import static ru.mail.data.Country.RU;

public class Main {
//    public static void main(String[] args) {
//        Card visaCard = new VisaCard();
//        visaCard.setBalance(100);
//        visaCard.payCountry(RU, 75);
//        System.out.println(visaCard.getBalance());
//    }

    public static void main(String[] args) {
        invoke(new MasterCard());
    }

    public static void invoke(Card card) {
        card.setBalance(100);
        card.payCountry(RU, 75);
        System.out.println(card.getBalance());
    }
}