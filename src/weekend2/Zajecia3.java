package weekend2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Zajecia3 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //raczej uzywac tego sposobu, przydaje sie rowniez w innych meijscach jak np czytanie plikow (o tym pozniej, sa lepsze sposoby czytania plikow...)
//        String text = reader.readLine(); // czyta linie i zapisuje do stringa
//        int number = Integer.parseInt(reader.readLine()); // czyta linie i probuje ja sparsowac do inta

//        task1();
//        task2();

        overloadingMethods();


    }

    private static void overloadingMethods() {
        //przeciazanie jest o polimorfizm statyczny, polega na pisaniu metod o tej samej nazwie ale innym <b>zestawie argumentow</b>
        System.out.println(add(1,4));
        System.out.println(add(5.4,10.9));

        // Zadanie
        // Napisac metody welcomeUser, ktora przyjmie imie i będzie witać użytkownika
        // Przeciążyć metodę w ten sposób aby przyjmowaął również wiek i wyświetlała analogiczny napis
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static double add(double a, double b) {
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
