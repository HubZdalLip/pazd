package weekend2;

public class Zajecia4 {
    public static void main(String[] args) {
        //this - drugie znaczenie
        Horse horse = new Horse();
        Horse horse1 = new Horse(5, "Polska", 10, new User());
        System.out.println();
        System.out.println();
        Horse horse2 = new Horse(7, "Niemcy", 15);

        // akcesory

        publicVsPrivateVsDefault();
    }

    private static void publicVsPrivateVsDefault() {
        // same akcesory, szczegolnei private pozwala trzymac sie dobrych praktyk OOP
        User user = new User("Patryk", 24, "Poznań");
        Account account = new Account(1000, user);
//        account.balance += -1000;
//        account.balance = 0;
//        account.balance -= 10000;
        account.getInfoAboutBalance();
        double money = account.debit(10000);
        System.out.println(money);
        account.getInfoAboutBalance();
        double money2 = account.debit(-500);
        System.out.println(money2);
        account.getInfoAboutBalance();
        double money3 = account.debit(400);
        System.out.println(money3);
        account.getInfoAboutBalance();

        //defaultowy modyfikator dostepu dziala tak, ze wewnatrz pakietu pole jest publiczne, a na zewnatrz prywatne
        //
        // zadanie zmodyfikować resztę klasy Account w ten sposob, aby nie byla podatna na ataki oszustów
        //


    }
}
