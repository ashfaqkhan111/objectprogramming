package jobsheet11.BankMini.src.id.ac.polinema;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Bank {

    private AccountRepository accountRepository;
    
    public Bank(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    public boolean addAccount(Account account){
        if (accountRepository.findByAccountNumber(account.getAccountNumber()) != null){
            return false;
        }
        accountRepository.save(account);
        return true;
    }

    public Account findAccount(String accountNumber){
        return accountRepository.findByAccountNumber(accountNumber);
    }

    public void printAllAccounts(){
        for(Account account : accountRepository.findAll()){
            System.out.println(account.getAccountNumber()+" - "+account.getOwner()+" - "+account.getBalance());
        }
    }

    public void printHistory(String accountNumber){
        Account account = findAccount(accountNumber);

        if(account == null){
            System.out.println("Account Not Found!");
            return;
        }

        for (Transaction transaction : account.getHistory()){
            System.out.println(account.getAccountNumber()+ " "+transaction);
        }
    }

    public double totalAssets(){
        double total = 0;

        for (Account account : accountRepository.findAll()){
            total += account.getBalance();
        }

        return total;
    }
    
}
