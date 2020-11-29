package weekend2;

public class Account {
    //    double.  BigDecimal
    private double balance;
    private User user;

    public Account(double balance, User user) {
        this.balance = balance;
        this.user = user;
    }

    public double debit(double money) {
        if (balance < money) {
            System.out.println("Niewystarczajaca liczba srodkow na koncie!");
            return 0;
        }

        if (money <= 0) {
            System.out.println("Wprowadzono niepoprawną kwote!");
            return 0;
        }

        this.balance -= money;
        return money;
    }

    public void deposit(double money) {
        this.balance += money;
        System.out.println("Wpłacono " + money);
    }

    public void getInfoAboutBalance() {
        System.out.println("Na koncie jest " + balance + " zl");
    }
}
