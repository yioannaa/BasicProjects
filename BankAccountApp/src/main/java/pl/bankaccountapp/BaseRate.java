package pl.bankaccountapp;

public interface BaseRate {

    default double getBaseRate(){
        return 2.5;
    }

}
