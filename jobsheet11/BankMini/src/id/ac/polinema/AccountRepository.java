package jobsheet11.BankMini.src.id.ac.polinema;

import java.util.List;

public interface AccountRepository {

    void save(Account account);

    Account findByAccountNumber(String accountNumber);
    
    List<Account> findAll();
    
    
}
