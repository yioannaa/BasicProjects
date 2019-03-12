package pl.bankaccountapp;

public class Checking extends Account {

    int debitCardNumber;
    int debitCardPIN;

    public Checking (String name, String socialSecirityNumber, double initDeposit){
        super (name, socialSecirityNumber, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate(){
        rate = getBaseRate()*0.15;
    }

    private void setDebitCard(){
        debitCardNumber = (int) (Math.random()* Math.pow(10, 12));
        debitCardPIN =(int) (Math.random()* Math.pow(10, 4));
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Your checking account features: " +
                "\nDEBIT CARD NUMBER: " + debitCardNumber +
                "\nDEBIT CARD PIN: " + debitCardPIN
        );
    }

}
