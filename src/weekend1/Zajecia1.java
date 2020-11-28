package weekend1;

import java.util.Arrays;
import java.util.Scanner;

public class Zajecia1 {
    public static void main(String[] args) {
//        1. Napisz program, w którym zadeklarujesz liczbę n i wyświetlisz liczbę o 3 większą.
//        2. Napisz metodę zwracającą informację czy liczba jest parzysta.
//        3. Napisz metodę liczącą silnię z podanej liczby n jako argument.
//        4. Napisz metodę zwracającą tablicę znaków z wysłanego wyrazu jako argument
//        5. Napisz metodę wyświetlającą liczby od 10 do 40 co 2 i tylko gdy są niepodzielne
//        przez 3.
//        6. Napisz metodę zwracającą tablicę wpisanych przez użytkownika w środku metody
//        imion.
//        7. Napisz metodę przyjmującą 5 liczb i zwracającą maksimum.
//        8. Napisz metodę przyjmującą dwie listy Stringów i zwracającą jedną listę wspólną.
//        9. Napisz klasę Point z publicznymi polami określającymi współrzędne. Stwórz obiekt.
//        10. Napisz klasę Person z polami określającymi imię i nazwisko, a następnie stwórz
//        metodę showDetails wyświetlającą informacje o osobie. Przetestuj działanie klasy.

        //ex1
        int n = 5; //deklaruje liczbe n typu integer
        System.out.println(n + 3);

//        someComplexLogic();
//        someComplexLogic();
//        someComplexLogic();
//        someComplexLogic();
//        someComplexLogic();
//        addNumbers(3, 8);
//        addNumbers(10, 5);
//        addNumbers(3, 9);
//        addNumbers(2, 0);
//        addNumbers(0, -2);
//        addNumbers(10, 10);

        String info = ex2(3);
        String info2 = ex2(9);
        String info3 = ex2(6);

        System.out.println(info);
        System.out.println(info2);
        System.out.println(info3);

        //zadanko w miedzyczasie 1
        //a) stworz metoda wyswietlajaca napis Hello (imie)
        //b) stworz metoda zwracajaca napis Hello (imie)
//
//        showName("Hubert");
//        showName("Magda");
//        String name = returnName("Hubert");
//        String name2 = returnName("Magda");
//        System.out.println(name);
//        System.out.println(name2);

        //petle
//        loops();
//        arrays();
//        ex5();
//        ex6();
//        scannerBug();
//        ex7();
//
//        exA1();
        exA2();

    }

    private static void exA2() {
//        2.Wprowadź liczbę i wyświetl komunikat określający parzystość i ilość cyfr.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj lcizbę");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba nie jest aprzysta");
        }

        String numberAsString = String.valueOf(number); // wartosc string innej wartosci (inna metoda Integer.toString(), jeszcze inne rozwiazane)
        System.out.println("Liczba " + numberAsString + " ma " + numberAsString.length() + " znaków");

    }

    private static void exA1() {
//        1.Wyświetl komunikat w zależności czy wprowadzony przez użytkownika String ma
//        więcej niż 5 znaków.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst");
        String text = scanner.nextLine();

        if (text.length() > 5) {
            System.out.println("Tekst ma więcej niż pięc znaków");
        } else {
            System.out.println("Tekst ma mniej lub równo 5 znaków");
        }


    }

    private static void ex7() {
//        7. Napisz metodę przyjmującą 5 liczb i zwracającą maksimum.
        int[] numbers = {3, 4, 1, 8, 3};
        int[] numbers2 = {-10, 0, 100, 8, 7};

        int max = returnMaxValue(numbers);
        int max2 = returnMaxValue(numbers2);
        int max3 = returnMaxValueUsing5Args(2, 3, 4, 5, 6);
        int max4 = returnMaxValueUsingRest(3, 4, 5, 6);
        int max5 = returnMaxValueUsingRest(3, 10, 6);
        int max6 = returnMaxValueUsingRest(3);

        System.out.println(max);
        System.out.println(max2);
        System.out.println(max3);
        System.out.println(max4);
        System.out.println(max5);
        System.out.println(max6);


    }

    private static int returnMaxValueUsing5Args(int i, int i1, int i2, int i3, int i4) {
        return returnMaxValue(new int[]{i, i1, i2, i3, i4});
    }


    private static int returnMaxValueUsingRest(int... numbers) {
        return returnMaxValue(numbers);
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > max) {
//                max = numbers[i];
//            }
//        }
//        return max;
    }

    private static int returnMaxValue(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    private static void scannerBug() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(); // po pobraniu liczby, scanner parsuje liczbe, ale nie parsuje entera
        scanner.nextLine();
        String text = scanner.nextLine(); // poniewaz enter byl niesparsowany, czyli nadal siedzi w buforze, zostanie on zczytany prez nextLine
        System.out.println(x);
        System.out.println(text);

    }

    private static void ex6() {
//        6. Napisz metodę zwracającą tablicę wpisanych przez użytkownika w środku metody
////        imion.
        String[] arrayOfNames = returnArrayOfNames();
        System.out.println(Arrays.toString(arrayOfNames));

    }

    private static String[] returnArrayOfNames() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz liczbe elemntow w tablicy...");
        int numberOfElements = scanner.nextInt(); //prosimy o liczbe elementow w tablicy
        scanner.nextLine(); //czytamy felerny enter

        String[] names = new String[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            System.out.println("Podaj imię (aktualny indeks tablicy " + i + ")");
            names[i] = scanner.nextLine(); // do aktualnego indeksu tablicy (0-4) wpisujemy informacje zgarnieta od usera
        }
        return names;
    }

    private static void ex5() {
//        5. Napisz metodę wyświetlającą liczby od 10 do 40 co 2 i tylko gdy są niepodzielne
//        przez 3


    }

    private static void arrays() {
//        4. Napisz metodę zwracającą tablicę znaków z wysłanego wyrazu jako argument
        char[] chars = getCharsFromWord("Hubert");
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(getCharsFromWord("Marcin")));
    }

    private static char[] getCharsFromWord(String word) {
        return word.toCharArray(); // .toCharArray nie przyjmuje arg, zweraca tablice znakow z danego wyrazu
    }

    private static void loops() {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

        //skladnia for (indeks, warunek, zwiekszanie){}
        for (int i = 1; i <= 5; i++) {
            //tylko raz  -  1 krok to stworzenie indeksu i : 1
            // 2 krok to sprawdzenie warunku : 1 <= 5 , 2<=5,3<=5,4<=5, 5<=5
            System.out.println("Indeks petli " + 2 * i);
            // 3 krok to zwiekszenie warunku i: 1 ->2 , 2->3, 3->4, 4->5, 5->6
        }


        //podpowiedz, nalezy zapisywac wynik w oddzielnej zmiennej

        //ex3

        System.out.println(calcFact(5));
        System.out.println(calcFact(2));
        System.out.println(calcFact(4));
        System.out.println(calcFact(6));


    }

    private static int calcFact(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        // 4!, 5!, 3!
        // 1! 1
        // 2! 1*2 = 2
        // 3! 1*2*3 = 6
        // 4! 1*2*3*4 = 24
        // 5! 1*2*3*4*5 = 120 -> 4! * 5

        int result = 1; // rezultat i zarazem wartosc poczatkowa
        for (int i = 1; i <= n; i++) {
            result = result * i; // gdy i = 1, result = 1 => 1
//            gdy i = 2 ; result * 2 => 2
//            gdy i = 3; result (czyli 2) * 3 => 6
//            gdy i = 4; result (czyli 6) *4 => 24..
//            gdy i = 5; result (czyli 24) *5 => 120..
        }
        return result;
    }

    private static String returnName(String name) {
        return "Hello " + name;
    }

    private static void showName(String name) {
        System.out.println("Hello " + name);
    }

    //metoda
    //skladnia: modyfikator dostepu - static/non static (nic) typ zwracany - nazwa - (argumenty)
    private static void addNumbers(int n1, int n2) { // jesli wysle 3 i 5 to n1 bedzie rowne 3, n2 bedzie rowne 5
        System.out.println(n1 + n2);
    }

    public static String ex2(int number) {
        if (number % 2 == 0) {
            return "Liczba jest parzysta";
        } else {
            return "Liczba nie jest parzysta";
        }

    }

    public static void someComplexLogic() {
        //300 linii kodu ktore dotycza jakis obliczen skomplikowanych
    }
}
