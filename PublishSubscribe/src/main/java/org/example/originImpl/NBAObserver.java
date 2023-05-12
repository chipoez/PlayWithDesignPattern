package org.example.originImpl;

public class NBAObserver extends Observer {

    @Override
    public void update() {
        System.out.println(super.sub.name + ":" + super.sub.getAction() + "!" + super.name + ",please close NBA and work!");
    }

    public NBAObserver(String name, Subject sub) {
        super(name, sub);
    }
}
