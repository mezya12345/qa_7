package ru.mail.data;

public class VisaCard extends Card {

    public VisaCard() {
        super(PaymentSystem.UNION_PAY);
    }

    protected boolean isCountryValidForTheseCard(Country country) {
        return true;
    }
}
