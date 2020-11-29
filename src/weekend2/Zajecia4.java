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
        account.showInfoAboutBalance();
        double money = account.debit(10000);
        System.out.println(money);
        account.showInfoAboutBalance();
        double money2 = account.debit(-500);
        System.out.println(money2);
        account.showInfoAboutBalance();
        double money3 = account.debit(400);
        System.out.println(money3);
        account.showInfoAboutBalance();

        System.out.println();
        System.out.println();
        System.out.println();
        Account account1 = new Account(1000,new User());
        Account account2 = new Account(3000,null);

        account1.showInfoAboutBalance();
        account1.debit(2000);
        account1.debit(-500);
        account1.deposit(-500);
        account1.deposit(5000);
        account1.debit(3000);
        account1.showInfoAboutBalance();


        account2.showInfoAboutBalance();
        account2.debit(2000);
        account2.debit(-500);
        account2.deposit(-500);
        account2.deposit(5000);
        account2.deposit(1000);
        account2.showInfoAboutBalance();


        //defaultowy modyfikator dostepu dziala tak, ze wewnatrz pakietu pole jest publiczne, a na zewnatrz prywatne
        //
        // zadanie zmodyfikować resztę klasy Account w ten sposob, aby nie byla podatna na ataki oszustów
        //
        // w javie stosujemy sie do praktyk enkapsulacji danych
        //
        // jak najmniej pol moze byc publicznych, najlepiej jakby zadne pole nie bylo publiczne
        //
        // nalezy tak tworzyc kod, aby pola byly prywatne
        //
        // settery i gettery to metody publiczne z ktorych korzysta w celu zebrania informacji o polu prywatnym lub jego modyfikacji w sposob kontrolowany przez walidacje zagniezdzone w setterze

        System.out.println(Account.getNumberOfAccounts());
        new Account(100,null);
        new Account(100,null);
        new Account(100,null);
        new Account(100,null);
        new Account(100,null);
        System.out.println(Account.getNumberOfAccounts());
//        String nameOfBank = Account.NAME_OF_BANK;
//        System.out.println(nameOfBank);

        Account account3 = new Account(1000, new User(),"HomeBanking");
        System.out.println(account3.getNameOfBank());
        Account account4 = new Account(1000, new User(),Account.MILLENIUM); // stale zapobiegaja literowkom
        System.out.println(account4.getNameOfBank());
    }
}




//        zadanie...
//        a) stworz klase Beer w ktorej stworzysz pola statyczne i finalne okreslajace nazwy i zawartosc alkoholu trzech piw
//        Lager,Pils,free
//        b) stworz konstruktor w ktorym stworzysz piwo o danym rodzaju.... parametry konstrutkora powinny pochodzic tylko ze stalych
//        (przeciez nie chcemy utworzyc nieistniejacego w danym pubie piwa)
//        c) wyswietl % alkhoolu dla danego obiektu....
//        d) swtorz kilka obiektow piw....
//        e) Stworz klase Person posiadajaca pole permills i metode statyczna drink przyjmujaca jako parametr obiekt Beer. Pole permills ma byc zwiekszane o wartosc %alkoholu / 10
//        f) wyswietl poziom alkoholu we krwi dla osob

//        stworz klase Computer w ktorej:
//        a) stworzysz pola o nazwie ip, marka, cena
//        b) stworzysz gettery i settery(do pewnych pol)
//        c) dodasz walidacje w tych metodach
//        d) dodaj pole isRunning
//        e) dodaj metode run  => modyfikuj pole isRunning
//        f) dodaj metode stop => modyfikuj pole isRunning
//        g) wyswietl informacje czy komputer jest wlaczony a takze swtorz metode wyswietlajaca jego parametry....
//        h) dostan sie do nich rowneiz za pomcoa getterow.....


//        zadanie: stworz enuma ktory
//        a) bedzie okreslal rodzaje rowerow....
//        b) beda wystepowaly rowery miejskie, gorskie, wyczynowe....
//        c) kazdy rodzaj powinien miec krotki opis oraz cene
//        d) stworz metode buyBike, ktora jako argumnet przyjmie enuma wybranego przez uzytkownika - tzn uzytwkonik wpisuje wawrtosc i nastepuje
//        sprawdzenie czy taki rower istnieje w sklepie... jesli nie to daj komunikat o tym, daj szanse sprobowac ponownie...
//        e) jesli tak to pokaz cene, opis i spytaj czy na pewno zakup ma sie odbyc
