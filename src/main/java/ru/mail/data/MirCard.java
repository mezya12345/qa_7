package ru.mail.data;

public class MirCard extends Card implements ICard {

    public MirCard() {
        super(PaymentSystem.MIR);
    }

    protected boolean isCountryValidForTheseCard(Country country) {
        if (country == Country.RU)
            return true;
        else
            return false;
    }
}
