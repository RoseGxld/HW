package abdemo;

public class Falcon extends Bird {
    public Falcon(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return "tweet";
    }
    @Override
    String eat() {
        return "worms";
    }
}
