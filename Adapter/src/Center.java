public class Center extends Player{
    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("center" + this.name + "attack");
    }

    @Override
    public void defense() {
        System.out.println("center" + this.name + "defense");
    }
}
