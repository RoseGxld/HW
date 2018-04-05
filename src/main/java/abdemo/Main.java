package abdemo;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Tiger("Jefferey");

        Animal a2 = new Wolf("Alex");

        Animal a3 = new Hawk("Zues");


        Animal[] animals = new Animal[]{a1, a2, a3};

        for (Animal species : animals) {
            System.out.println(species.eat());
        }
    }
}
