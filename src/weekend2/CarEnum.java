package weekend2;

import java.util.ArrayList;
import java.util.List;

public enum CarEnum {
    FORD(1930, "Amerykańska firma produkujaca auta"),
    BMW(1941, "Niemiecka firma produkujaca drogie auta"),
    MERCEDES(1924, "Niemiecka firma, niegdys poplularna wsrod mafiozow"),
    TOYOTA(1940, "Japońska firma produkujaca auta nie do zniszczenia (!)");

    private final int year;
    private final String description;

    CarEnum(int year, String description) {
        this.year = year;
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public static List<CarEnum> findEnumsWhichYearOfProductionInOutOfIIWW() {
        List<CarEnum> carEnums = new ArrayList<>();
        for (CarEnum car : CarEnum.values()) {
            if (car.year < 1939 || car.year > 1945) {
                carEnums.add(car);
            }
        }
        return carEnums;
    }

    public static CarEnum findEnumByYearOfProduction(int year) {
        for (CarEnum car : CarEnum.values()) {
            if (car.getYear() == year) {
                return car;
            }
        }
        return null;
    }
//
//    @Override
//    public String toString() {
//        return "CarEnum{" +
//                "year=" + year +
//                ", description='" + description + '\'' +
//                '}';
//    }
}
