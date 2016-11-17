package com.greenfox.bx;

/**
 * Created by ${SzilviaB} on 2016. 11. 16..
 */
public class CreditCardReservation implements CreditCardy, Reservationy {
    CreditCard creditCard;
    Reservation reservation;

    public CreditCardReservation(String dowBooking,String nameCardholder, String codeAccount) {
        this.creditCard = new CreditCard(nameCardholder, codeAccount);
        this.reservation = new Reservation(dowBooking);
    }


    @Override
    public void setSumCVV(int sumCVV) {
        this.creditCard.setSumCVV(sumCVV);
    }

    @Override
    public int getSumCVV() {
        return this.creditCard.getSumCVV();
    }

    @Override
    public void setNameCardholder(String nameCardholder) {
        this.creditCard.setNameCardholder(nameCardholder);

    }

    @Override
    public String getNameCardholder() {
        return this.creditCard.getNameCardholder();
    }

    @Override
    public void setCodeAccount(String codeAccount) {
        this.creditCard.setCodeAccount(codeAccount);
    }

    @Override
    public String getCodeAccount() {
        return this.creditCard.getCodeAccount();
    }

    @Override
    public int cumeSumCVV(String codeAccount) {
        return 0;
    }

    @Override
    public boolean ValidCard(String codeAccount, int sumCVV) {
        return true;
    }

    @Override
    public void setDowBooking(String dowBooking) {
        this.reservation.setDowBooking(dowBooking);
    }

    @Override
    public String getDowBooking() {
        return this.reservation.getDowBooking();
    }

    @Override
    public void setCodeBooking(String codeBooking) {
        this.reservation.setCodeBooking(codeBooking);
    }

    @Override
    public String getCodeBooking() {
        return this.reservation.getCodeBooking();
    }

    @Override
    public boolean PlaceReserved(String dowBooking, String codeBooking) {
        return true;
    }

    @Override
    public boolean PlaceCancelled(String dowBooking, String codeBooking) {
        return true;
    }

    @Override
    public String toString() {
        return String.format("Booking# %s for %s paid by Name=%s CC#=%s CVV=%d", getCodeBooking(), getDowBooking(), getNameCardholder(), getCodeAccount(), getSumCVV());
    }


}
