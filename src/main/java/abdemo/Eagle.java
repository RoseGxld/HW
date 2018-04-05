package abdemo;

public class Eagle extends Bird {
    public Eagle(String name) {
        super(name);
    }
    @Override
    String makeSound() {
        return "tweet";
    }
    @Override
    String eat() {
        return "mice";
    }
}
