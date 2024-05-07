package heritage.firstHeritage.program;

import heritage.firstHeritage.entities.Account;
import heritage.firstHeritage.entities.BusinessAccount;
import heritage.firstHeritage.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc1;

        BusinessAccount bacc1 = new BusinessAccount(1002, "Maria", 10000.0, 5000.0);
        acc1 = bacc1;
        
        acc1.withdraw(1000.00);
        System.out.println(acc1.getBalance());
        System.out.println(bacc1.getBalance());
        

        SavingsAccount sacc1 = new SavingsAccount(1003, "João", 10000.0, 0.01);
        


        System.out.println(acc1.getBalance());
        System.out.println(bacc1.getBalance());
        System.out.println(sacc1.getBalance());
    }
}
