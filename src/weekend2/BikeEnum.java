package weekend2;

public enum BikeEnum {
    MIEJSKI("Rower ktorym zwykle jezdzsimy po miescie", 1500),
    GORSKI("Rower potrzebny do jazdy w terenie. Nieodpowiedni dla osob z chorabami plecow", 2000),
    WYCZYNOWY("Rower dla lansu", 1000);

    private final String description;
    private final double price;

    BikeEnum(String description, double price) {
        this.description = description;
        this.price = price;
    }


    public static BikeEnum findEnumByName(String bikeFromUser) {
        for (BikeEnum bike : BikeEnum.values()) {
            if (bike.toString().toLowerCase().equals(bikeFromUser)) {
                return bike;
            }
        }
        return null;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
