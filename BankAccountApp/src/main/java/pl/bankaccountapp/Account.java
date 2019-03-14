package pl.bankaccountapp;

public abstract class Account implements BaseRate {

    private String name;
    private String socialSecurityNumber;
    private double balance;
    private static int index = 10000;
    protected String accountNumber;
    protected double rate;

    public Account (String name, String socialSecurityNumber, double initDeposit){

        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        balance = initDeposit;

        index++;
        this.accountNumber = setAcoountNumber();
        setRate();
    }

    public abstract void setRate();

    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance = balance + accruedInterest;
        System.out.println("Accrued interest $: " + accruedInterest);
        printBalance();
    }

    private String setAcoountNumber(){
        String lastTwoOfSsN = socialSecurityNumber.substring(socialSecurityNumber.length()-2, socialSecurityNumber.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random()*Math.pow(10,3));

        return lastTwoOfSsN+uniqueID+randomNumber;
    }

    public void deposit (double amount){
        balance = balance + amount;
        System.out.println("Depositing $: " + amount);
        printBalance();
    }

    public void withdraw (double amount){
        balance = balance - amount;
        System.out.println("Withdrawing $: " + amount);
        printBalance();
    }

    public void transfer (String toWhere, double amount){
        balance = balance - amount;
        System.out.println("Transfering $ " + amount + " to " + "toWhere");
        printBalance();
    }

    public void printBalance (){
        System.out.println("Your balance is now: $" + balance);
    }

    public void showInfo(){
        System.out.println(
                "NAME: " + name +
                 "\nACCOUNT NUMBER: " + accountNumber +
                 "\nBALANCE: " + balance +
                 "\nRATE: " + rate + "%"
        );
    }

}
