package heritage.firstHeritage.program;

import heritage.firstHeritage.entities.Account;
import heritage.firstHeritage.entities.BusinessAccount;
import heritage.firstHeritage.entities.SavingsAccount;
import heritage.firstHeritage.entities.SavingsAccountPlus;

public class Program {
    public static void main(String[] args) {
        Account acc1 = new Account(1001, "Marcos", 10000.0);
        acc1.withdraw(2000.0);

        BusinessAccount bacc1 = new BusinessAccount(1002, "Maria", 10000.0, 5000.0);
        bacc1.withdraw(2000.0);

        SavingsAccount sacc1 = new SavingsAccount(1003, "João", 10000.0, 0.01);
        sacc1.withdraw(2000.0);

        System.out.println(acc1.getBalance());
        System.out.println(bacc1.getBalance());
        System.out.println(sacc1.getBalance());
    }
}
