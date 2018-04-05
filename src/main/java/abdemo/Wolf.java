package abdemo;

public class Wolf extends Canine {

    public Wolf(String name){
        super(name);
    }



    @Override
    String makeSound() {
        return "Howlll";
    }
    @Override
    String eat() {
        return "ya mother";
    }
}
