package pl.bankaccountapp;

public abstract class Account implements BaseRate {

    String name;
    String socialSecurityNumber;
    double balance;
    static int index = 10000;
    String accountNumber;
    double rate;

    public Account (String name, String socialSecurityNumber, double initDeposit){

        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        balance = initDeposit;

        index++;
        this.accountNumber = setAcoountNumber();
        setRate();
    }

    public abstract void setRate();



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

    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("withdrawing $: " + amount);
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
