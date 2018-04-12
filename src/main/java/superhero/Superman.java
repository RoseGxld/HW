package superhero;

public class Superman extends Hero implements IFly{

    public Superman(String name, String superpower, String flightSpeed){
        super(name,superpower,flightSpeed);

    }

    @Override
    public String flightSpeed() {
        return null;
    }
}
