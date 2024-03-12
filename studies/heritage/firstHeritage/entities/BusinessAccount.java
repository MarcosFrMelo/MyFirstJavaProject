package heritage.firstHeritage.entities;

public class BusinessAccount extends Account {
    private Double loanLimit;
    public BusinessAccount() {
        super();
    }

    public BusinessAccount(int number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount){
        if (amount <= loanLimit){
            balance += amount - 10.0;
        }
        else {
            System.out.println("Quantity entered is greater than allowed by your account");
        }
    }
    @Override
    public void withdraw(Double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }
}

