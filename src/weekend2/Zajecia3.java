package weekend2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Zajecia3 {

    private static SecureRandom secureRandom = new SecureRandom();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //raczej uzywac tego sposobu, przydaje sie rowniez w innych meijscach jak np czytanie plikow (o tym pozniej, sa lepsze sposoby czytania plikow...)
//        String text = reader.readLine(); // czyta linie i zapisuje do stringa
//        int number = Integer.parseInt(reader.readLine()); // czyta linie i probuje ja sparsowac do inta

//        task1();
//        task2();

//        overloadingMethods();
//        secureRandom();
        classes();


    }

    private static void classes() {
        // zmienna - typ prosty przechowywany na stosie w pamieci, po odwolaniu sie do niego ottrzymujemy bezposrendio wartosc, wartosc na zywca przechowywana jest na pamieci
        // obiekt - typ referenecyjny, zlozony, przechcowywany na stercie, po odwolaniu sie do niego nie otrzymujemy bezposrednio wartosci, tylko zestaw wartosci

//        obiekty takie jak string i w zasadzie kazde inne nie mozemy poronwywac ze soba bezposrednio, poniewaz nazwa obiektu to tylko referencja do niego (czyli sznurek do apmeici)
//        "sfsdfsd".equals("sdfsdf"); - w tym meijscu porownujemy wartosc komorek pamieci, a nie tylko adres do tych komorek (jak to jest na stosie)

//        obiekt moze posiadac w sobie typy proste, typy referencyjne (tablica nawet typow prostych jest typem referencyjnym! )
//        System.out.println(new String[]{"asd"}); tablica to nie ejst typ prosty!!!
//        obiekt moze posiadac rowniez funkcjonalnosci - metody;
//        obiekt aby mozna bylo z niego korzystac musi zostac utworzony, tj. oprocz oprocz sznurka do pamieci (np. String text), musimy rozkazac maszynie zadeklarowac miejsce w pamieci. W tym przypadlu anlezy uzyc konstruktora ( destruktory nei istnieja, destrukcja obeiktow odbywa sie autoamtycznie, w losowej chwili)

        Dog owczarek = new Dog(); //uwazac na nulle!!!
        owczarek.age = 3;
        owczarek.name = "Max";
        Dog pudel = new Dog();
        pudel.age = 2;
        pudel.name = "Reksio";
        Dog bernardyn = new Dog();
        bernardyn.age = 1;
        bernardyn.name = "Mini";

        System.out.println(owczarek.age);
        System.out.println(owczarek.name);

        System.out.println(pudel.age);
        System.out.println(pudel.name);

        System.out.println(bernardyn.age);
        System.out.println(bernardyn.name);

        owczarek.bark();
        pudel.bark();

        //przyklad stworz 3 obiekty klasy Dog, niech szczekaja tylko te psy, ktore maja wiecej niz 4 lata
        Dog york = new Dog();
        york.age = 5;
        Dog labrador = new Dog();
        labrador.age = 3;
        Dog husky = new Dog();
        husky.age = 13;

        barkIfMoreThan4yo(york, labrador, husky);

        //zadanie stworz klase Cat w ktorej stworzysz kilka pol:
//        - rodzaj sierci
//        - rasa
//        - imie
//        - czyPosiadaWlasciciela
//        - dodaj metode mialcz ktora w zaleznosci od tego czy kot posiada wlasciciela wysweitla odpowiedni napis
//        ( np mialcze bo jest mi smutno bez wlascciiela albo mialcze bo jestem szczesliwy z moim panem)



    }

    private static void barkIfMoreThan4yo(Dog... dogs) {
        for (Dog dog : dogs) {
            if (dog != null && dog.age > 4) {
                dog.bark();
            }
        }
    }

    private static void secureRandom() throws IOException {
//        SecureRandom secureRandom = new SecureRandom(); //obiekt duzy fajniejszy niz random ( po ktorym de facto dziedziczy!)
//        // przydaje sie przy hashowaniach, kodowaniach
//        // bardzo przyjemny do obsludze w streamach, czego nie mozna powiedziec o randomie!!!
//        int randNumber = secureRandom.nextInt(5);
//        System.out.println(randNumber);
//
//        // zadanie
//        // stworz metode w ktorej wylosujesz liczbe z zakresu 30,50. Zwroc polowe tej liczby
//
//        for (int i = 0; i < 50; i++) {
//            System.out.println(getRandomNumber());
//        }

        // zadanie
        // a) stworz metode ktora zwroci losowy ciag znakow o n dlugosci
        // b) zmodyfikuj metode w ten sposob aby mogla rowneiz wylosowac liczbe
        // c) stworz system oceniajacy sile hasla,
        // 0pkt - haslo ma mniej niz 5 znakow
        // 1pkt - haslo ma wiecej niz 5 znakow
        // 2pkt - haslo ma wiecej niz 5 znakow i zawiera conajmniej 2 cyfry oprocz liter
        // 2pkt - haslo ma wiecej niz 8 znakow i zawiera conajmniej 4 cyfry oprocz liter
        // (do domu) d) stworz generator hasel wg sily hasla
        // parametry: zadajemy sile i dlugosc hasla. Parametry nie moga byc sprzeczne, dlatego o dlugosc program pyta juz po wybraniu sily
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
//            String input = reader.readLine();
//            if ("exit".equals(input)) {
//                break;
//            }
//            long time = System.currentTimeMillis();
//            System.out.println(getGeneratedString(Integer.parseInt(input)));
//            System.out.println(System.currentTimeMillis() - time);
//            long time1 = System.currentTimeMillis();
//            System.out.println(getGeneratedStringBuilder(Integer.parseInt(input)));
//            System.out.println(System.currentTimeMillis() - time1);
            String pass = reader.readLine();
            System.out.println(passwordRater(pass));
        }


    }

    private static int passwordRater(String pass) {
        int counter = 0;
        for (char c : pass.toCharArray()) {
            if (Character.isDigit(c)) {
                counter++;
            }
        }

        if (pass.length() < 5) {
            return 0;
        } else if (pass.length() > 5 && counter < 2) {
            return 1;
        } else if (pass.length() > 5 && pass.length() < 8) {
            return 2;
        } else if (pass.length() > 8 && counter >= 4) {
            return 3;
        } else {
            return 2;
        }
    }

    private static String getGeneratedStringBuilder(int length) {
        StringBuilder text = new StringBuilder();
        final int baseUpper = 65;
        final int baseLower = 97;
        final int rangeAlf = 26;
        final int rangeDigits = 10;
        final int baseDigits = 48;

        for (int i = 0; i < length; i++) {
            char randChar;
            int mode = secureRandom.nextInt(3);
            if (mode == 0) {
                randChar = (char) (baseLower + secureRandom.nextInt(rangeAlf));
            } else if (mode == 1) {
                randChar = (char) (baseUpper + secureRandom.nextInt(rangeAlf));
            } else {
                randChar = (char) (baseDigits + secureRandom.nextInt(rangeDigits));
            }
            text.append(randChar);
        }

        return text.toString();

    }

    private static String getGeneratedString(int length) {
        String text = "";
        final int baseUpper = 65;
        final int baseLower = 97;
        final int range = 26;
        final int rangeDigits = 10;
        final int baseDigits = 48;

        for (int i = 0; i < length; i++) {
            char randChar;
            int mode = secureRandom.nextInt(3);
            if (mode == 0) {
                randChar = (char) (baseLower + secureRandom.nextInt(range));
            } else if (mode == 1) {
                randChar = (char) (baseUpper + secureRandom.nextInt(range));
            } else {
                randChar = (char) (baseDigits + secureRandom.nextInt(rangeDigits));

            }
            text += randChar;
        }

        return text;

    }


    private static double getRandomNumber() {
        SecureRandom secureRandom = new SecureRandom();
        double randomNumber = 30 + secureRandom.nextInt(50 - 30);
        return randomNumber / 2;
    }

    private static void overloadingMethods() {
        //przeciazanie jest o polimorfizm statyczny, polega na pisaniu metod o tej samej nazwie ale innym <b>zestawie argumentow</b>
        System.out.println(add(1, 4));
        System.out.println(add(5.4, 10.9));

        // Zadanie
        // Napisac metody welcomeUser, ktora przyjmie imie i będzie witać użytkownika
        // Przeciążyć metodę w ten sposób aby przyjmowaął również wiek i wyświetlała analogiczny napis

        // Zadanie
        // Napisac metode multiplication, ktora bedzie posiadac 4 przeciazenia:
        // - bedzie mnozyc 2 liczby
        // - bedzie mnozyc 3 liczby
        // - bedzie mnozyc 4 liczby
        // - bedzie mnozyc n liczby
        System.out.println(multiplication(3, 4));
        System.out.println(multiplication(3, 4, 8));
        System.out.println(multiplication(3, 4, 9, 10));
        System.out.println(multiplication(3, 4, 1, 2, 4, 7));

    }

    private static double multiplication(int... args) { // varargs
        double mult = 1;

        for (int arg : args) {
            mult *= arg;
        }
        return mult;
    }

    private static double multiplication(int i, int i1, int i2, int i3) {
        return i * i1 * i2 * i3;
    }

    private static double multiplication(int i, int i1, int i2) {
        return i * i1 * i2;
    }

    private static double multiplication(int i, int i1) {
        return i * i1;
    }

//    private static int add(int... a, int...b){ //pamietac ze vararg ma byc na koncu!!
//
//    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static double add(double a, double b) { //zwracany typ nie ma znaczenia
        return a + b;
    }

    private static void task2() throws IOException {
        //    2. Napisz metodę, która będzie rysować prostokąt o podanych wymiarach
        //  ad2.1 zgarniecie wymiarow
        //  ad2.2 narysowanie pierwzsej i ostatniej linijki
        //  ad2.3 narysowanie srodka

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj wymiar x");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Podaj wymiar y");
        int y = Integer.parseInt(reader.readLine());

        for (int i = 0; i < y; i++) {
            if (i == 0 || i == y - 1) {
                for (int j = 0; j < x; j++) {
                    System.out.print("*");  // tylko pierwsza i ostatnia linijka ma pelna liczbe gwiazdek, reszta posiada jakies spacje
                }
                System.out.println();
            } else {
                System.out.print("*");                  // pierwsza i ostatnia kolumna jest gwiazdka, reszta to spajce czyli x - 2 (dwie gwiazdki)
                for (int j = 0; j < x - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
        // x = 5; y = 3
        //*****
        //*   *
        //*****


    }

    private static void task1() throws IOException {
        //    1. Napisz metodę, która będzie obliczać średnią geometryczną
//            wzor: sqrt n stopnia z a1*a2*a3*...*an
//        ad1.1 stworzyc mechanizm ktory pobiera n liczb i zapisuje ile liczb zostało wpisanych
//        ad1.2 stworzyc mechanizm ktory liczy iloczyn tych liczb
//        ad1.3 stworzyc mechanizm ktory liczb pierwiastek
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int mult = 1;
        int n = 0;

        while (true) {
            System.out.println("Podaj liczbę");
            String numberAsString = reader.readLine();
            if ("exit".equals(numberAsString)) { // stala .equals zmienna. Unikamy w ten spsoob nullpointera
                break;
            }
            mult *= Integer.parseInt(numberAsString);
            n++;
        }
        double result = Math.pow(mult, 1.0 / n);
        System.out.println(result);
    }
}
