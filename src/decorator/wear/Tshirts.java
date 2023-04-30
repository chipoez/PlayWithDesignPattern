package decorator.wear;

public class Tshirts extends Finery{
    @Override
    public void show() {
        System.out.print("Big T-shirt ");
        super.show();
    }
}
