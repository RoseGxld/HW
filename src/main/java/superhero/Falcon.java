package superhero;

public class Falcon extends Hero implements IFly{

    public Falcon(String name, String superpower, String flightSpeed){
        super(name,superpower,flightSpeed);
    }


    @Override
    public String flightSpeed() {
        return null;
    }
}
