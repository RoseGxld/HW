package abdemo;

public class Panther extends Feline {

    public Panther(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return "whats hannin;";
    }

    @Override
    String eat() {
        return "vibranium";
    }
}
