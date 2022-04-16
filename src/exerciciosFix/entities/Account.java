package exerciciosFix.entities;

public class Account {
    private Integer number;
    private String hold;
    private Double balance;

    public void Deposit(double amount) {
        this.balance += amount;
    }
    public void withDraw(double amount) {
this.balance -= amount;
    }

    public Account() {
    }

    public Account(Integer number, String hold) {
        this.number = number;
        this.hold = hold;
    }

    public Account(Integer number, String hold, Double balance) {
        this.number = number;
        this.hold = hold;
        this.balance = balance = 0.00;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHold() {
        return hold;
    }

    public void setHold(String hold) {
        this.hold = hold;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", hold='" + hold + '\'' +
                ", balance=" + balance +
                '}';
    }
}
