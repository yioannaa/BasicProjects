package pl.bankaccountapp;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
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


        List<Account>accounts = new LinkedList<Account>();
        List<String[]> newAccountHolders = Reader.read(file);
        for (String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String socialSecurityNumber = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);

            if (accountType.equals("Savings")){
                accounts.add(new Saving(name, socialSecurityNumber, initDeposit));
            }else if (accountType.equals("Checking")){
                accounts.add(new Checking(name, socialSecurityNumber, initDeposit));
            }else{
                System.out.println("ERROR");
            }
        }

        for (Account acc : accounts){
            System.out.println("\n**************************");
            acc.showInfo();
        }

    }
}
