package abdemo;

public class Cat extends Feline implements IPet,IRestroom {

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

    public String greet() {
        return "Whats uuuuppppp";
    }

    public String usesBathroom() {
        return "Squats to pee";
    }
}
