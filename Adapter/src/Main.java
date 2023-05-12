public class Main {
    public static void main(String[] args) {
        Player forwards = new Forwards("James");
        Player center = new Translator("yaoming");
        forwards.attack();
        forwards.defense();
        center.attack();
        center.defense();
    }
}