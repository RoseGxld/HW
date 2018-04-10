package demolist;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String>fruits = new ArrayList<String>();

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

    }
}

C:\Users\Student\Desktop\employeeinterfaces\HW\src\main\java