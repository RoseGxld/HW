package abdemo;

public class Tiger extends Feline {


    public Tiger(String name){

        super(name);
        }


    @Override
    String makeSound() {
        return "roar!";
    }
    @Override
    String eat() {
        return "people";
    }
}
