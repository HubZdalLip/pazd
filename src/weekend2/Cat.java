package weekend2;

public class Cat {
    String coatKind;
    String name;
    String kind;
    boolean hasOwner;

    void maiu() { //mozna odwolac sie w metodach do atrybutow klasy
        if (hasOwner) {
            System.out.println("Mialcze bo jest mi dobrze z moim panem");
        } else {
            System.out.println("Mialcze bo jest mi smutno bez wlasciciela");
        }

    }

}
