package pl.bankaccountapp;

public class BankAccountApp {

    public static void main(String[] args) {

        Checking checacc1 = new Checking("Tim Wilson", "786345231", 1500);

        Saving savacc1 = new Saving("Rita Mayer", "890579235", 2500);

        checacc1.showInfo();
        System.out.println("************");
        savacc1.showInfo();

    }
}
