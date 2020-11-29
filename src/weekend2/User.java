package weekend2;

public class User {
    String name;
    int age;
    String originCity;
    Dog dog;

    public User() {
        name = "Nie podano";
        age = -1;
        originCity = "Nie podano";
    }

    public User(String name, int age, String originCity) {
        this.name = name;
        this.age = age;
        this.originCity = originCity;
    }

    public User(String name, int age, String originCity, Dog dog) {
        this.name = name;
        this.age = age;
        this.originCity = originCity;
        this.dog = dog;
        this.dog.setOwner(this);
    }

    public static String doNothing() {
        return "Jestem metoda statyczna ale jeszcze nic nie robie";
    }


    public void showDetails() {
        System.out.println("Moje imie to: " + name);
        System.out.println("Moj wiek to: " + age);
        System.out.println("Moje miasto pochpdzenia to: " + originCity);
    }
}
