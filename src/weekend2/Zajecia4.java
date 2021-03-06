package weekend2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Zajecia4 {
    public static void main(String[] args) throws IOException {
        //this - drugie znaczenie
        Horse horse = new Horse();
        Horse horse1 = new Horse(5, "Polska", 10, new User());
        System.out.println();
        System.out.println();
        Horse horse2 = new Horse(7, "Niemcy", 15);

        // akcesory

        publicVsPrivateVsDefault();

//        beerEx();
//        bikeShop();
        carEx();




    }

    private static void carEx() {
        //singleton - wzorzec projekty, polegajacy na tym, ze klasa moze posiada tylko i wylacznie jeden obiekt. Kazde odwolanie do obiektu konczy sie praca na tym samym obiekcie
        // doczytac sobie o innych wzorcach takich jak obserwartor, dekorator, strategia, adapter
        Car car = CarFactory.createCar(CarEnum.BMW); // wzorzec projektowy Factory (poczytac sobie!!)
        if(car == null){
            return;
        }
        System.out.println(car.getColor());
        System.out.println(car.getId());

    }

    private static void beerEx() {
//        zadanie...
//        a) stworz klase Beer w ktorej stworzysz pola statyczne i finalne okreslajace nazwy i zawartosc alkoholu trzech piw
//        Lager,Pils,free
//        b) stworz konstruktor w ktorym stworzysz piwo o danym rodzaju.... parametry konstrutkora powinny pochodzic tylko ze stalych
//        (przeciez nie chcemy utworzyc nieistniejacego w danym pubie piwa)
//        c) wyswietl % alkhoolu dla danego obiektu....
//        d) swtorz kilka obiektow piw....
//        e) Stworz klase Person posiadajaca pole permills i metode niestatyczna drink przyjmujaca jako parametr obiekt Beer. Pole permills ma byc zwiekszane o wartosc %alkoholu / 10
//        f) wyswietl poziom alkoholu we krwi dla osob

        Beer lager = new Beer(Beer.LAGER);
        Beer pils = new Beer(Beer.PILS);
        Beer free = new Beer(Beer.FREE);

        Person adam = new Person("Adam");
        Person weronika = new Person("Weronika");

        adam.drink(lager);
        adam.drink(lager);

        weronika.drink(free);
        weronika.drink(pils);
        weronika.drink(pils);
        weronika.drink(pils);

        adam.showInfoAboutState();
        weronika.showInfoAboutState();

//        stworz klase Computer w ktorej:
//        a) stworzysz pola o nazwie ip, marka, cena
//        b) stworzysz gettery i settery(do pewnych pol)
//        c) dodasz walidacje w tych metodach
//        d) dodaj pole isRunning
//        e) dodaj metode run  => modyfikuj pole isRunning
//        f) dodaj metode stop => modyfikuj pole isRunning
//        g) wyswietl informacje czy komputer jest wlaczony a takze swtorz metode wyswietlajaca jego parametry....
//        h) dostan sie do nich rowneiz za pomcoa getterow.....

        Computer computer = new Computer();
        computer.setIp("169.703.0.31");
        computer.setBrand("SuperMachines");
        computer.setPrice(7000);

        System.out.println(computer.isRunning());
        computer.run();
        System.out.println(computer.isRunning());
        computer.stop();
        System.out.println(computer.isRunning());

        computer.showDetails();
        System.out.println(computer.getIp());
        System.out.println(computer.getBrand());
        System.out.println(computer.getPrice());

        System.out.println(computer);
        System.out.println(lager);

        Computer computer1 = new Computer("179.3.94.0", "Lenovo", 4500);
        Computer computer2 = new Computer("179.3.94.0", "Lenovo", 4500);
        System.out.println(computer1 == computer2); // bylo mowione ze nie porownujemy obiektow ==
        System.out.println(computer1.equals(computer2)); // te same parametry, ale inne obszary zajmowane w pamieci

        //kontrakt miedzy equals i hashcode (popularne na rozmowach rekrutacyjnych!!)
        // jesli hashCode da true, to niekoenicznie jednoznacznie wiemy ze obiekty sa sobie rowne, equals moze dac fales
        // jesli equals da true, to hashcode na pewno da true

        enumTheory();


    }

    private static void enumTheory() {
        // enum to typ wyliczeniowy
        // enum to klasa zawierajaca zlozone stale, mogace posiadac podatrybuty. Enum moze posiadac metody, (dziedziczy rowniez metody z nadrzednego enuma). Ta klasa jest zawsze statyczna oraz jej konstruktor jest domyslnie prywatny.

        Farba farba = new Farba(10, Color.BIALY); // pozwala na wyslanie obiektu enuma ktory juz musi miec jakas poprawna wartosc
        farba.draw();
        Farba farba1 = new Farba(40, Color.CZERWONY);
        farba1.draw();

        Course course = new Course("Hubert", 1);
        course.practise();

        System.out.println(CarEnum.BMW.name());
        System.out.println(CarEnum.MERCEDES.getDescription());
        System.out.println(CarEnum.MERCEDES.getYear());

        for (CarEnum car : CarEnum.values()) { //values zwraca wszystkie enumy w tablicy
            System.out.println();
            System.out.println(car.name());
            System.out.println(car.ordinal()); //reprezentacja liczbowa
            System.out.println(car.getYear());
            System.out.println(car.getDescription());
        }

        List<CarEnum> enums = CarEnum.findEnumsWhichYearOfProductionInOutOfIIWW();
        

        System.out.println(enums);

        System.out.println(CarEnum.findEnumByYearOfProduction(1850));
        System.out.println(CarEnum.findEnumByYearOfProduction(1930));


//        zadanie: stworz enuma ktory
//        a) bedzie okreslal rodzaje rowerow....
//        b) beda wystepowaly rowery miejskie, gorskie, wyczynowe....
//        c) kazdy rodzaj powinien miec krotki opis oraz cene
//        d) stworz metode buyBike, ktora jako argumnet przyjmie enuma wybranego przez uzytkownika - tzn uzytwkonik wpisuje wawrtosc i nastepuje
//        sprawdzenie czy taki rower istnieje w sklepie... jesli nie to daj komunikat o tym, daj szanse sprobowac ponownie...
//        e) jesli tak to pokaz cene, opis i spytaj czy na pewno zakup ma sie odbyc


    }

    private static void bikeShop() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dziendobry! Jaki by Pan chcial rower?");
        while (true) {
            String bikeIWant = reader.readLine();
            System.out.println("Chwila, sprawdzam czy mamy taki rower :) !");
            BikeEnum bikeEnum = BikeEnum.findEnumByName(bikeIWant);
            if (bikeEnum != null) {
                System.out.println("Udało się odnaleźć taki rower. Pozwoli Pan że chwile o nim opowiem");
                System.out.println(bikeEnum.getDescription());
                System.out.println("Jego cena to " + bikeEnum.getPrice());
                System.out.println("Czy jest Pan zainteresowany? Tak/Nie");
                String answer = reader.readLine();

                if ("Tak".equals(answer)) {
                    System.out.println("Sprzedane!!");
                } else {
                    System.out.println("Zapraszamy jutro albo w okolicach czarnego piatku!");
                }
                break;


            } else {
                System.out.println("Niestety nie mamy takiego roweru na stanie... :( Może jakiś inny? ");
            }
        }

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
        Account account1 = new Account(1000, new User());
        Account account2 = new Account(3000, null);

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
        new Account(100, null);
        new Account(100, null);
        new Account(100, null);
        new Account(100, null);
        new Account(100, null);
        System.out.println(Account.getNumberOfAccounts());
//        String nameOfBank = Account.NAME_OF_BANK;
//        System.out.println(nameOfBank);

        Account account3 = new Account(1000, new User(), "HomeBanking");
        System.out.println(account3.getNameOfBank());
        Account account4 = new Account(1000, new User(), Account.MILLENIUM); // stale zapobiegaja literowkom
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
