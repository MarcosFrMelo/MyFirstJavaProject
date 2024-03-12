package heritage.firstHeritage.entities;

public class Account {
    private int number;
    private String holder;
    protected Double balance;

    public Account(){
    }
    public Account(int number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void withdraw(Double amount){
        this.balance -= amount + 5.0;
    }
    public void deposit(Double amount){
        this.balance += amount;
    }

}
