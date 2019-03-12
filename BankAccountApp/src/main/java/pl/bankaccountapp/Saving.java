package pl.bankaccountapp;

public class Saving extends Account {

    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    public Saving (String name, String socialSecirityNumber, double initDeposit){
        super (name, socialSecirityNumber, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate(){
        rate = getBaseRate()- .25;
    }

    public void setSafetyDepositBox (){
        safetyDepositBoxID = (int) (Math.random()* Math.pow(10,3));
        safetyDepositBoxKey = (int) (Math.random() + Math.pow(10,4));
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Your saving account features: " +
                "\nSafety Deposit Box ID: " + safetyDepositBoxID +
                "\nSafety Deposit Box Key: " + safetyDepositBoxKey
        );

    }




}

