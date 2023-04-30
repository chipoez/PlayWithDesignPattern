package decorator.wear;

public class main {
    public static void main(String[] args) {
        Person xc = new Person("xc");
        System.out.println("decorate start!");
        Tshirts tshirts = new Tshirts();
        tshirts.decorate(xc);
        tshirts.show();
    }
}
