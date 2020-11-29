package weekend2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Account {
    //    double.  BigDecimal
    public static final String M_BANK = "mBank";
    public static final String MILLENIUM = "millenium";
    public static final String PKO = "PKO";
    private static final List<String> NAME_OF_BANKS = new ArrayList<>(Arrays.asList(M_BANK, MILLENIUM, PKO));
    private String nameOfBank;
    private static int numberOfAccounts = 0;
    private double balance;
    private User user;

    public Account(double balance, User user) {
        this.balance = balance;
        this.user = user;
    }

    public Account(double balance, User user, String nameOfBank) {
        if (NAME_OF_BANKS.contains(nameOfBank)) {
            this.nameOfBank = nameOfBank;
        } else {
            System.out.println("Bledna nazwa banku!");
            this.nameOfBank = null;
        }
        this.balance = balance;
        this.user = user;
        numberOfAccounts++;
    }


    public double debit(double money) {
        if (!validate(money)) {
            return 0;
        }

        if (balance < money) {
            System.out.println("Niewystarczajaca liczba srodkow na koncie!");
            return 0;
        }


        this.balance -= money;
        return money;
    }

    public void deposit(double money) {
        if (!validate(money)) {
            return; //wyjdz z metody jesli typ jest void
        }

        this.balance += money;
        System.out.println("Wpłacono " + money);
    }

    private boolean validate(double money) {
        if (money <= 0) {
            System.out.println("Wprowadzono niepoprawną kwote!");
            return false;
        }
        if (user == null) {
            System.out.println("Wystąpił ogólny błąd. Skontaktuj się z bankiem");
            return false;
        }
        return true;
    }

    public void showInfoAboutBalance() {
        System.out.println("Na koncie jest " + balance + " zl");
    }

    public double getBalance() {
        return balance;
    }

    public User getUser() {
        return user;
    }

    public void setBalance(double balance) {
        if (!validate(balance)) {
            return;
        }
        this.balance = balance;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public String getNameOfBank() {
        return nameOfBank;
    }
}
