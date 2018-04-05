package abdemo;

public class Cat extends Feline {

    public Cat(String name) {
        super(name);
    }
    @Override
    String makeSound() {
        return "meow";
    }
    @Override
    String eat() {
        return "fish";
    }
}
