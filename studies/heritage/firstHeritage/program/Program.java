package heritage.firstHeritage.program;

import heritage.firstHeritage.entities.Account;

public class Program {
    public static void main(String[] args) {
        Account acc1 = new Account(1001, "Marcos", 10000.0);
        acc1.withdraw(2000.0);
    }
}
