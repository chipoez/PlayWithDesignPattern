package org.example.originImpl;

public class StockObserver extends Observer{
    @Override
    public void update() {
        System.out.println(super.sub.name + ":" + super.sub.getAction() + "!" + super.name + ",please close stock and work!");
    }
    public StockObserver(String name,Subject sub){
        super(name,sub);
    }
}

