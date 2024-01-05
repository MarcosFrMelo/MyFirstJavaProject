package heritage.firstHeritage.program;

import heritage.firstHeritage.entities.Account;
import heritage.firstHeritage.entities.BusinessAccount;
import heritage.firstHeritage.entities.SavingsAccount;

public class ProgramUpDown {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Marcos", 0.0, 500.0);

        //upcasting

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Thomax", 0.0, 1000.0);
        Account acc3 = new SavingsAccount(1004, "Italo", 0.0, 10.0);

        //downcasting
        //acc2.loa;
        BusinessAccount acc4 = (BusinessAccount) acc2;
        ((BusinessAccount) acc2).loan(1000.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3;

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            ((BusinessAccount) acc3).loan(1000.0);
            System.out.println("Loan");
        }
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("!update!");

        }
    }
}
