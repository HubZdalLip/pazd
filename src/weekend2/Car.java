package weekend2;

public class Car {
    private int id;
    private String techState;
    private String color;
    private int km;
    private CarEnum carEnum;

    public Car(int id, String techState, String color, int km, CarEnum carEnum) {
        this.id = id;
        this.techState = techState;
        this.color = color;
        this.km = km;
        this.carEnum = carEnum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTechState() {
        return techState;
    }

    public void setTechState(String techState) {
        this.techState = techState;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public CarEnum getCarEnum() {
        return carEnum;
    }

    public void setCarEnum(CarEnum carEnum) {
        this.carEnum = carEnum;
    }
}
