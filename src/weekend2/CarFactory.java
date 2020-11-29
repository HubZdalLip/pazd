package weekend2;

public class CarFactory {
    public static Car createCar(CarEnum carEnum) {
        switch (carEnum) {
            case BMW:
                return new Car(1, "cos tam", "Niebieski", 200, carEnum);
            case MERCEDES:
                return new Car(2, "cos tam innego", "Zolty", 300, carEnum);
            case TOYOTA:
                return new Car(3, "bardzo dobry", "Bialy", 197, carEnum);
            case FORD:
                return new Car(4, "kiepski", "Czarny", 240, carEnum);
            default:
                return null;
        }
    }
}
