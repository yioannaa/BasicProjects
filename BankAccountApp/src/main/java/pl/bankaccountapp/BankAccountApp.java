package pl.bankaccountapp;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BankAccountApp {

//    public static Path file = Paths.get("NewBankAccounts.csv");



    public static void main(String[] args) {

        String file = "BankAccountApp\\NewBankAccounts.csv";

//        Checking checacc1 = new Checking("Tim Wilson", "786345231", 1500);
//
//        Saving savacc1 = new Saving("Rita Mayer", "890579235", 2500);
//
//        checacc1.showInfo();
//        checacc1.deposit(3000);
//        checacc1.withdraw(200);
//        checacc1.compound();
//        System.out.println("             ");
//        System.out.println("************");
//        savacc1.showInfo();
//        savacc1.compound();


        List<String[]> newAccountHolders = Reader.read(file);
        for (String[] accountHolder : newAccountHolders) {
            System.out.println("NEW ACCOUNT");
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);
        }





    }
}
