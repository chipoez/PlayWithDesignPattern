public class Translator extends Player{
    private ForeignCenter foreignCenter = new ForeignCenter();
    public Translator(String name) {
        super(name);
        this.foreignCenter.setName(name);
    }

    @Override
    public void attack() {
        foreignCenter.jingong();
    }

    @Override
    public void defense() {
        foreignCenter.fangshou();
    }
}
