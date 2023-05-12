package example;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("on");
        originator.show();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.setState("off");
        originator.show();
        originator.recoveryMemento(caretaker.getMemento());
        originator.show();
    }
}