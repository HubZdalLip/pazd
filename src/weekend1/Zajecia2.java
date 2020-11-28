package weekend1;

import java.util.*;

public class Zajecia2 {
    private static final String STOP = "stop";
    private static final String UPPER = "upper";
    private static final String LOWER = "lower";
    private static final String FIND = "find";

    public static void main(String[] args) {
//        exB();
//        exC();
//        exD();
        anotherExs();
    }

    private static void anotherExs() {
//        exercise1();
//        exercise2();
//        exercise3();
//        exercise4();
//        exercise5();
        exercise6();
    }

    private static void exercise6() {
//        Zadanie:
//        Napisz program który obliczy, czy liczba podana przez użytkownika i pomnożona przez
//        liczbę, będącą resztą z dzielenia tej liczby przez 5, da taki wynik, że suma wszystkich cyfr tej
//        liczby będzie liczbą parzystą:
//        - gdy true: zwróć różnicę kwadratów cyfr z tej liczby
//        - gdy false: zwróć sumę pierwiastków cyfr z tej liczby

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe....");
        int numberFromUser = scanner.nextInt();
        int modulo = numberFromUser % 5;
        int mult = numberFromUser * modulo;
        String stringNumber = Integer.toString(mult);
        int sum = 0;
        for (int i = 0; i < stringNumber.length(); i++) {
            int numberAtPosition = Integer.parseInt("" + stringNumber.charAt(i));
            sum += numberAtPosition;
        }
        if (sum % 2 == 0) {
            double substract = Math.pow(Integer.parseInt("" + stringNumber.charAt(0)), 2);
            for (int i = 1; i < stringNumber.length(); i++) {
                int numberAtPosition = Integer.parseInt("" + stringNumber.charAt(i));
                substract -= (Math.pow(numberAtPosition, 2));
            }
            System.out.println(substract);
        } else {
            double sqrtSum = 0;
            for (int i = 0; i < stringNumber.length(); i++) {
                int numberAtPosition = Integer.parseInt("" + stringNumber.charAt(i));
                sqrtSum += (Math.sqrt(numberAtPosition));
            }
            System.out.println(sqrtSum);
        }

    }

    private static void exercise5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe....");
        // 120 -> 2 ,2 ,2 ,3 ,5
        //120 -> 60*2 -> 30 *2 *2 -> 15*2*2*2-> 5*3*2*2*2
        int inputFromUser = scanner.nextInt();
        List<Integer> integerList = new ArrayList<>();

        boolean isDone = false;
        do {
            for (int i = 2; i <= inputFromUser; i++) {
                if (inputFromUser % i == 0) {
                    integerList.add(i);
                    inputFromUser /= i; // inputFromUser = inputFromUser / id
                    if (inputFromUser == 1) {
                        isDone = true;
                    }
                    break;
                }
            }
        } while (!isDone);
        System.out.println(integerList);
    }

    private static void exercise4() {
//        Zadanie:
//        Napisz metodę, która parsuje każdy element tablicy w taki sposób, że jest on mnożony
//        przez losowo wybraną wartość spośród 3 liczb, które użytkownik poda.

        int[] arr = new int[]{4, 3, 5, 6, 7, 8, 2, 1, 6, 6}; //tablica z liczbami
        parse(arr);
    }

    private static void parse(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Podaj trzy liczby");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int[] pool = {num1, num2, num3};


        for (int i = 0; i < arr.length; i++) {
            int nextInt = random.nextInt(pool.length);
            System.out.println("Wylsoowano: " + pool[nextInt]);
            arr[i] = arr[i] * pool[nextInt];
        }
        System.out.println(Arrays.toString(arr));

    }

    private static void exercise3() {
//        Zadanie
//        a) napisz metode o nazwie showNTimes
//        b) metoda przyjmie parametr ilosci wywolac
//        c) metoda wyswietli napis "I am in method." tyle razy ile wynosi parametr
//        input: 3
//        Output:
//        I am in method.
//        I am in method.
//        I am in method.
        int number = 10;
        showNTimes(number);
    }

    private static void showNTimes(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("I am in method");
        }
    }

    private static void exercise2() {
//        Zadanie
//        a) stworz metode getCharsInSpecificWay
//        b) metoda musi przyjac 4 argumenty... pierwsze trzy arguemnty do znaki, ostatni
//        argument to zmienna typu boolean
//        c) zwroc i przypisz do Stringa wynik metody => wynik ma byc scaleniem trzech znakow,
//        typ boolean okresli kolejnosc
//        true to kolejnosc znak1+znak2+znak3
//        false to kolejnosc ODWROTNA

        String result1 = getCharsInSpecificWay('a', 'b', 'c', true);
        String result2 = getCharsInSpecificWay('a', 'b', 'c', false);
        System.out.println(result1);
        System.out.println(result2);
    }

    private static String getCharsInSpecificWay(char a, char b, char c, boolean cond) {
        if (cond) {
            return "" + a + b + c;
        } else {
            return "" + c + b + a;
        }
    }

    private static void exD() {
        ex1D();
    }

    private static void exC() {
        ex1C();
        ex2C();
        ex3C();
    }

    private static void exB() {
        ex1B();
        ex2B();
        ex3B();
    }

    private static void exercise1() {

//        a) stworz Stringa ktorego wartosc zostanie pobrana od uzytkownika
//        b) jesli string bedzie rowny "upper" to wyswietl stringa w postaci wielkich liter
//        c) jesli String bedzie rowny "lower" to wyswietl stringa w postaci malych liter
//        d) jesli String bedzie zawieral wyrazenie "ok" ale nie bedzie się na nie konczyl to
//        wyswietl napis: Zawieram wyrazenie ok ale nie na koncu. Zmodyfkijuj program tak
//        aby mogl wyswietlic:
//        Zawieram wyrazenie ale na poczatku
//        e) jesli String bedzie rowny "find" to wtedy pozwol uzytkownikowi na wprowadzenie
//        innego stringa, sprawdz czy on wystepuje w 1 stringu i od jakiego indeksu
//        f) jesli String bedzie inny niz powyzsze przypadki to wtedy wyswietl go od polowy, bez
//        dwoch ostatnich znakow

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz napis");
        String textFromUser = scanner.nextLine();
        System.out.println("Wybierz opcje");
        System.out.println("1.Upper");
        System.out.println("2.Lower");
        System.out.println("3.Find");
        String optFromUser = scanner.nextLine(); //a)

        switch (optFromUser) {
            case UPPER:
                System.out.println(textFromUser.toUpperCase()); //konwertuje stirng na wielkie litery
                break;
            case LOWER:
                System.out.println(textFromUser.toLowerCase()); //konwertuje string na male litery
                break;
            case FIND:
                System.out.println("Podaj drugiego stringa");
                //1. zgarnac wartosc od uztkownika
                String additionalString = scanner.nextLine();
                if (!textFromUser.contains(additionalString)) {
                    System.out.println("Nie znaleziono stringa");
                } else {
                    System.out.println(textFromUser.indexOf(additionalString));
                }
                break;
            default:
                if (textFromUser.startsWith("ok")) {
                    System.out.println("Zawieram wyrażenie ok ale na początku");
                } else if (textFromUser.contains("ok") && !textFromUser.endsWith("ok")) {
                    System.out.println("Zawieram wyrazenie ok ale nie na koncu");
                } else {
                    System.out.println(textFromUser.substring(textFromUser.length() / 2, textFromUser.length() - 2));
                }

        }


    }

    private static void ex1D() {
//        Metody
//        1.Napisz metodę, która przyjmie dwa wyrazy i zwróci String z informacją, który z nich
//        jest dłuższy.
//        2. Napisz metodę, która odwróci kolejności liczb w tablicy.
//        3. Napisz metodę, która przyjmie tablicę znaków i zwróci tablicę ich kodów ASCII.

        String text1 = "Pierwszy tekst";
        String text2 = "Drugi tekst";
        System.out.println(compareLengthOfStrings(text1, text2));
//ex2
        String[] array = {"Hubert", "krzesło", "tablica"};
        array = reverseArray(array);
        System.out.println(Arrays.toString(array));
//ex3
        char[] chars = {'a', 'b', 'c'};
        int[] asciiNumbers = getASCIIFromArrayOfChars(chars);
        System.out.println(Arrays.toString(asciiNumbers));
    }

    private static int[] getASCIIFromArrayOfChars(char[] chars) {
        int[] copy = new int[chars.length]; //tworze tablice do rpzechowywania intow
        for (int i = 0; i < copy.length; i++) {     //iteruje po tablicy chars
            copy[i] = chars[i];     //zgarniam ich reprezentacje liczbowa (castowanie nie jest koneiczne poneiwaz intellij wykrywa ze chcemy przypisac do tablicy intow, stad castuje to autoamtyczne
        }
        return copy;
    }

    private static String[] reverseArray(String[] array) {
        String[] copy = new String[array.length]; //tworzymy kopie tablicy
        for (int i = 0; i < array.length; i++) {        //wpisujemy elementy w taki spsoob ze odwolujemy sie od konca do orygianlu
            copy[i] = array[array.length - i - 1];
        }
        return copy;    //zwracamy kopie (czyli odwrocona)
    }

    private static String compareLengthOfStrings(String text1, String text2) {
        return text1.length() > text2.length() ? "Tekst pierwszy jest dłuższy" : (text1.length() < text2.length() ? "Tekst drugi jest dłuższy" : "Teksty są równe...");
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
