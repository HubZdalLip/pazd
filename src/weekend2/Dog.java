package weekend2;

public class Dog {
    int age;
    String name;
    User user;

    public Dog() {
    }

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Dog(int age1, String name1, User user) {
        age = age1;
        name = name1;
        this.user = user;
    }

    void bark() {
        System.out.println("Jestem " + name + ". Szczekam! ");
    }

    static void meetAllDogs() {
        System.out.println("Wszystkie psy sie spotykaja");
    }

    static void chooseDogToBark(Dog dog) {
        dog.bark();
    }

    void setOwner(User user) {
        this.user = user;
    }
}
