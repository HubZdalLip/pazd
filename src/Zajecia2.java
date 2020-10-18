import javax.print.attribute.IntegerSyntax;
import java.util.*;

public class Zajecia2 {
    private static final String STOP = "stop";

    public static void main(String[] args) {
        exB();
    }

    private static void exB() {
//        ex1B();
//        ex2B();
//        ex3B();
//        ex1C();
//        ex2C();
        ex3C();
    }

    private static void ex3C() {
//        3. Wpisz do tablicy 5 losowych liczb w zakresu od 0 do 10. Przeiteruj po tablicy. Jeśli
//        liczba jest większa od 5 to wyświetl komunikat: Liczba o indeksie <indeks> jest
//        większa niż 5. Jeśli liczba jest podzielna przez 3 to wyświetl analogiczny komunikat.
//        Dla pozostałych przypadków wyświetl tablicę od końca

        Random random = new Random(); // w przyszlosci zajrzec do SecureRandom
        int[] arrayOfNumbers = new int[5];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = random.nextInt(11);
        }

        boolean cond = false;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] > 5) {
                System.out.println("Liczba o indeksie " + i + " jest większa niż 5.");
                cond = true;
            }
            if (arrayOfNumbers[i] % 3 == 0) {
                System.out.println("Liczba o indeksie " + i + " jest podzielna przez 3.");
                cond = true;
            }
            if (!cond) {
                printReverse(arrayOfNumbers);
            }
            cond = false;
        }
    }

    private static void printReverse(int[] arrayOfNumbers) {
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.print(arrayOfNumbers[arrayOfNumbers.length - i - 1] + " ");
        }
        System.out.println();
    }

    private static void ex2C() {
//        2. Utwórz tablicę 5 elementową unikalnych liczb. Wprowadzaj liczby aż do chwili
//        zapełnienia tablicy.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int[] numbers = new int[5];
        int validNumbers = 0;

        while (validNumbers < 5) {
            System.out.println("Podaj liczbę!");
            int numberFromUser = scanner.nextInt();
            if (!contains(numbers, numberFromUser)) {
                numbers[validNumbers++] = numberFromUser;
            } else {
                System.out.println("Element już wystąpił...");
            }
        }
        System.out.println(Arrays.toString(numbers));

//        Set<Integer> set = new LinkedHashSet<>();
//        for (int i = 0; i < 5; i++) {
//            set.add(scanner.nextInt());
//        }
//        Integer[] numbers1 = set.toArray(new Integer[0]);
    }

    private static boolean contains(int[] numbers, int numberFromUser) {
        for (int integer : numbers) {
            if (integer == numberFromUser) {
                return true;
            }
        }
        return false;
    }

    private static void ex1C() {
//        Tablice
//        1. Spytaj użytkownika o liczbę elementów w tablicy i uzupełnij wartości w sposób
//        dynamiczny.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Podaj lczibe elementow");
        int numberOfElements = scanner.nextInt();
        int[] array = new int[numberOfElements];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Podaj lcizbe ");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));


    }

    private static void ex3B() {
//        fibonnaci1();
//        fibonnaci2();
//        fibonnaci3();
    }

    private static void fibonnaci3() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int n = scanner.nextInt();
        System.out.println(fibonRec(n));
    }

    private static int fibonRec(int n) {
        if (n == 2 || n == 3) {
            return 1;
        }
        return fibonRec(n - 1) + fibonRec(n - 2);
    }

    private static void fibonnaci2() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int n = scanner.nextInt();
        int[] fibonnacii = new int[n];
        fibonnacii[0] = 0;
        fibonnacii[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonnacii[i] = fibonnacii[i - 1] + fibonnacii[i - 2];
        }
        System.out.println(fibonnacii[fibonnacii.length - 1]);

    }

    private static void fibonnaci1() {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int n = scanner.nextInt();

        int a = 0, b = 1, c = 0;
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println("Wyraz " + i + " ciagu fibona wynosi " + c);
        }

    }

    private static void ex2B() {
//        2. Wyświetl tabliczkę mnożenia o rozmiarze wskazanym przez użytkownika

        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Podaj granice tabliczki");
        int size = scanner.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
//                System.out.print(i * j + "\t");
                System.out.printf("%5s", i * j);
            }
            System.out.println();
        }

    }

    private static void ex1B() {
//        1.Oblicz średnią z wprowadzonych liczb przez użytkownika. Liczba -1 przerywa
//        wprowadzanie.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        List<Double> doubles = new ArrayList<>(); // mechanizm autoboxing/autounboxingu

        while (true) {                  // ta operacja to zebranie danych
            System.out.println("Podaj liczbę");
            String number = scanner.nextLine();
            if (STOP.equals(number.toLowerCase())) {
                break;
            }
            try {
                doubles.add(Double.parseDouble(number));
            } catch (NumberFormatException e) {
                System.out.println("Podałeś liczbę niezgodną z formatem");
            }
        }

        double sum = 0;

        for (Double number : doubles) { //liczenie sumy
            sum += number;
        }

        System.out.println("Srednia wynosi: " + sum / doubles.size());


        //schemat metody 2
        // 1.tworzymy zmienna przechowujaca rezultat
        // 2.dodajemy bezposrednio do rezultatu liczby
        // 3.zwiekszamy licznik wpisanych liczb


    }


}
