package com.austinegwa64.javacurrencyconverter.ConverterClasses;

/**
 * Created by gwaza on 5/13/2018.
 */

public class Constants {
    private int dollar = 100;
    private int Euro = 130;
    private int SA_Rand= 30;

    public Constants(int dollar, int euro, int SA_Rand) {
        this.dollar = dollar;
        Euro = euro;
        this.SA_Rand = SA_Rand;
    }

    public Constants() {
    }

    public int getDollar() {
        return dollar;
    }

    public void setDollar(int dollar) {
        this.dollar = dollar;
    }

    public int getEuro() {
        return Euro;
    }

    public void setEuro(int euro) {
        Euro = euro;
    }

    public int getSA_Rand() {
        return SA_Rand;
    }

    public void setSA_Rand(int SA_Rand) {
        this.SA_Rand = SA_Rand;
    }
}
