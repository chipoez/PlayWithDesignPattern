package decorator.wear;

public class Person implements ICharacter{

    private final String name;
    public Person (String name){
        this.name = name;
    }
    @Override
    public void show() {
        System.out.println("decorate " + name);
    }
}
