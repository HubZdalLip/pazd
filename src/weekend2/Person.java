package weekend2;

public class Person {
    private final String name;
    private double permills;

    public Person(String name) {
        this.name = name;
    }

    public void drink(Beer beer) {
        permills += beer.getAlcohol() / 10.0;
    }

    public void showInfoAboutState() {
        System.out.println("Mam na imie " + name + ". Ilosc promili aloholu we krwi to: " + permills);
    }
}
