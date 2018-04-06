package abdemo;

public class Tiger extends Feline implements IPet,IRestroom {


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

    @Override
    public String greet() {
        return "wassup";
    }

    @Override
    public String usesBathroom() {
        return "uriates";
    }
}
