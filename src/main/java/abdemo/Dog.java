package abdemo;

public class Dog extends Canine {

    public Dog(String name) {
        super(name);
    }
    String makeSound() {
        return "woof woof";
    }

    String eat() {
        return "chips";
    }
}
