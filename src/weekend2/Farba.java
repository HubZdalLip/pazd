package weekend2;

public class Farba {
    private final int size;
    private final Color color;

    public Farba(int size, Color color) {
        this.size = size;
        this.color = color;
    }

    public void draw() {
        switch (color) {
            case BIALY:
            case CZARNY:
                System.out.println("MOj obraz jest jakis taki czarnobialy");
                break;
            case ZIELONY:
            case CZERWONY:
            case NIEBIESKI:
                System.out.println("Moj obraz jest kolorowy");
                break;
        }
    }
}
