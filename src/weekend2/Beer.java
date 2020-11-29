package weekend2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Beer {
    public static final String LAGER = "lager";
    public static final String PILS = "pils";
    public static final String FREE = "free";
    private static final List<String> LIST_OF_ALCOHOLS = new ArrayList<>(Arrays.asList(LAGER, PILS, FREE)); // nie nalezy bezposrednio do listy przypisywac metody asList, poniewaz zwraca ona sam widok listy, a nei faktyczny obiekt => pwood wyjatkow w stylu: unsuportedMethodException
    public static final int LAGER_ALCOHOL = 6;
    public static final int PILS_ALCOHOL = 5;
    public static final int FREE_ALCOHOL = 0;

    private final String type; // te pole ktore moga byc finalne, niech beda finalne
    private final int alcohol;

    public Beer(String type) {
        if (LIST_OF_ALCOHOLS.contains(type)) {
            this.type = type;
        } else {
            this.type = FREE;
        }
        switch (type) {
            case LAGER:
                this.alcohol = LAGER_ALCOHOL;
                break;
            case PILS:
                this.alcohol = PILS_ALCOHOL;
                break;
            case FREE:
            default:
                this.alcohol = FREE_ALCOHOL;
        }
    }

    public int getAlcohol() {
        return alcohol;
    }

    public String getType() {
        return type;
    }
}
