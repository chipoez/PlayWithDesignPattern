public class Forwards extends Player{

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("forward" + this.name + "attact");
    }

    @Override
    public void defense() {
        System.out.println("forward" + this.name + "defense");
    }
}
