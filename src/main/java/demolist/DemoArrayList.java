package demolist;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Pineapple");

        int theSize = fruits.size();
        System.out.println(fruits.size());

        fruits.isEmpty();
        System.out.println(fruits.isEmpty());

        fruits.clone();
        System.out.println(fruits.clone());

        fruits.contains("Grapes");
        System.out.println(fruits.contains("Grapes"));

        for (String f : fruits) {
            System.out.println(f + " using a for each loop");
        }

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        System.out.println(myNumbers.isEmpty());

        myNumbers.add(27);
        myNumbers.add(21);
        myNumbers.add(11);

        Iterator<Integer> mno = myNumbers.iterator();
        while (mno.hasNext()){
            Integer result = mno.next();
            System.out.println(result);
        }
    }
}

