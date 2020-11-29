package weekend2;

public class Horse {
    int age;
    int numberOfWin;
    String country;
    User user;

    public Horse() {
    }

    public Horse(int age) {
        this.age = age;
        System.out.println("Wiek konia to: " + age);
    }

    public Horse(int age, String country) {
        this(age);
        this.country = country;
        System.out.println("Kraj ktory reprezentuje kon to: " + country);
    }

    public Horse(int age, String country, int numberOfWin) {
        this(age, country);
        this.numberOfWin = numberOfWin;
        System.out.println("Liczba zwyciestw konia to: " + numberOfWin);
    }

    public Horse(int age, String country, int numberOfWin, User user) {
        this(age, country, numberOfWin);
        this.user = user;
        System.out.println("Imie jezdzca to " + user.name);
    }

}
