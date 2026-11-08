package jobsheet11.BankMini.src.id.ac.polinema;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;

public class InMemoryAccountRepository implements AccountRepository{

    private Map<String, Account> accounts = new LinkedHashMap<>();

    @Override 
    public void save(Account account){
        accounts.put(account.getAccountNumber(), account);
    }

    @Override 
    public Account findByAccountNumber(String accountNumber){
        return accounts.get(accountNumber);
    }

    @Override 
    public List<Account> findAll(){
        return new ArrayList<>(accounts.values());
    }


    
}
