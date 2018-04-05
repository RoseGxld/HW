package abdemo;

public class Hawk extends Bird {

    public Hawk(String name){
        super(name);
    }

   @Override
    String makeSound() {
        return "cooo";
    }
    @Override
    String eat() {
        return "nuts";
    }
}
