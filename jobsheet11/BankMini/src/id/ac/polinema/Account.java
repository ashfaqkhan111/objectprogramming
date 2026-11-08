package jobsheet11.BankMini.src.id.ac.polinema;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private String accountNumber;
    private String owner;
    private double balance;

    private List<Transaction> history = new ArrayList<>();

    public Account(String accountNumber, String owner, double balance){
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;

    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getOwner(){
        return owner;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;

            history.add(new Transaction("DEPOSIT", amount));
        }
    }

    public boolean withdraw(double amount){
        if (amount > 0 && canWithdraw(amount)){
            balance -= amount;

            history.add(new Transaction("WITHDRAW", amount));
            return true;
        }
        return false;
    }

    private boolean canWithdraw(double amount){
        return balance >= amount;
    }

    public List<Transaction>getHistory(){
        return history;
    }
    
}
