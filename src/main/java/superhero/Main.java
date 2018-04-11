package superhero;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Hero h1 = new GreenLantern("GreenLantern","Ring","30 mph");
        Hero h2 = new Superman("Superman","Invincible","45 mph");
        Hero h3 = new Deadpool("Deadpool","Regeneration & Super human abilities","Null");
        Hero h4 = new Falcon("Falcon","Flight & ", "50 mph");

        ArrayList<Hero> heros = new ArrayList<Hero>();

        heros.add(h1);
        heros.add(h2);
        heros.add(h3);
        heros.add(h4);

        Iterator<Hero> h = heros.iterator();
        while(h.hasNext()){
            Hero result = h.next();
            System.out.println(result);
        }
        ArrayList<>
    }
    
}
