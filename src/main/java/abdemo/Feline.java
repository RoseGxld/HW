package abdemo;

public abstract class Feline extends Animal{
    private String name;

    public Feline(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
