package com.greenfox.bx;

/**
 * Created by ${SzilviaB} on 2016. 11. 16..
 */
public class CreditCard implements CreditCardy {
    int sumCVV;
    String nameCardholder;
    String codeAccount;

    public CreditCard (String nameCardholder, String codeAccount){
        this.nameCardholder = nameCardholder;
        this.codeAccount = codeAccount;
        this.sumCVV = cumeSumCVV(codeAccount);
    }


    public void setSumCVV(int sumCVV) {
        this.sumCVV = sumCVV;
    }

    @Override
    public int getSumCVV() {
        return sumCVV;
    }

    public void setNameCardholder(String nameCardholder) {
        this.nameCardholder = nameCardholder;
    }

    @Override
    public String getNameCardholder() {
        return nameCardholder;
    }

    @Override
    public void setCodeAccount(String codeAccount) {
        this.codeAccount = codeAccount;
    }

    @Override
    public String getCodeAccount() {
        return codeAccount;
    }

    @Override
    public int cumeSumCVV(String codeAccount) {
        for (int i = 0; i < codeAccount.length(); i++){
            sumCVV += Integer.parseInt(String.valueOf(codeAccount.charAt(i)));
        }

        return sumCVV;
    }


    @Override
    public boolean ValidCard(String codeAccount, int sumCVV) {
        return true;
    }

    public String toString() {
        return String.format("Name=%s CC#=%s CVV=%d", nameCardholder, codeAccount, sumCVV);
    }
}
