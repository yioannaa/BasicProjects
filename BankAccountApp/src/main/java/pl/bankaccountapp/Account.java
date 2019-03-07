package pl.bankaccountapp;

public abstract class Account implements BaseRate {

    String name;
    String socialSecurityNumber = ;
    double balance;
    static int index = 10000;
    String accountNumber;
    double rate;

    public Account (String name, String socialSecurityNumber, double initDeposit){

        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        balance = initDeposit;

        index++;

        this.accountNumber = setAcoountNUmber();
        System.out.println(accountNumber);

    }

    private String setAcoountNUmber(){
        String lastTwoOfSsN = socialSecurityNumber.substring(socialSecurityNumber.length()-2, socialSecurityNumber.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random()*Math.pow(10,3));

        return lastTwoOfSsN+uniqueID+randomNumber;
    }

}
