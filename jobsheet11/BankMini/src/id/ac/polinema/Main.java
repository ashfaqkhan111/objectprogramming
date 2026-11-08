package jobsheet11.BankMini.src.id.ac.polinema;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        AccountRepository repository = new InMemoryAccountRepository();

        Bank bank = new Bank(repository);

        Account a1 = new Account("A001", "Ashfaq khan", 500000);
         Account a2 = new Account("A002", "Ali", 600000);
          Account a3 = new Account("A003", "Ahmad", 900000);

        bank.addAccount(a1);
        bank.addAccount(a2);
        bank.addAccount(a3);

        a3.withdraw(20000);
        a3.deposit(14000);

        bank.printAllAccounts();

        System.out.println("\n Transaction History: ");
        bank.printHistory("A003");

        System.out.println("\nTotal assets: "+bank.totalAssets());
    }
}
