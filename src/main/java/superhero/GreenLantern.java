package superhero;

public class GreenLantern extends Hero implements IFly {

    public GreenLantern(String name, String superpower, String flightSpeed) {
        super(name, superpower, flightSpeed);
    }

    @Override
    public String flightSpeed() {
        return null;
    }
}




