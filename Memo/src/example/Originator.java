package example;

//发起人
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void show(){
        System.out.println("state:" + this.state);
    }

    public Memento createMemento(){
        return new Memento(this.state);
    }

    public void recoveryMemento(Memento memento){
        this.setState(memento.getState());
    }
}
