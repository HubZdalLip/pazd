package weekend2;

public class Course {
    private final int yearsOfExperience;
    private CourseMode mode;
    private String name;

    public Course(String name) {
        this.name = name;
        mode = CourseMode.BASIC;
        yearsOfExperience = 0;
    }

    public Course(String name, int yearsOfExperience) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        // mozna dodac obsluge ustawieniu trybu kursu na podstawie ilosci dosw i pozniej nie poslugiwac sie juz tym niewygodnym parametrem
        setModeByExp();
    }

    private void setModeByExp() {
        if (yearsOfExperience < 2) {
            mode = CourseMode.BASIC;
        } else if (yearsOfExperience < 5) {
            mode = CourseMode.ADVANCED;
        } else {
            mode = CourseMode.PREMIUM;
        }
    }

    public void practise() {
        System.out.println("User " + name);
        switch (mode) {
            case BASIC:
                practiseBasic();
                break;
            case ADVANCED:
                practiseAdvanced();
                break;
            case PREMIUM:
                practisePremium();
        }
    }

    private void practisePremium() {
        System.out.println("Pakiet premium");
        int ordinal = CourseMode.PREMIUM.ordinal();
        System.out.println(ordinal);
    }

    private void practiseAdvanced() {
        System.out.println("Pakiet rozszerzony");
        int ordinal = CourseMode.ADVANCED.ordinal();
        System.out.println(ordinal);
    }

    private void practiseBasic() {
        System.out.println("Pakiet podstawowy");
        int ordinal = CourseMode.BASIC.ordinal();
        System.out.println(ordinal);
    }

    private enum CourseMode {
        BASIC, ADVANCED, PREMIUM // stale enumowe posiadaja swoje odpowiedniki liczbowe
    }

}
