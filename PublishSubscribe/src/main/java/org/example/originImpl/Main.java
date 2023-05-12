package org.example.originImpl;

public class Main {
    public static void main(String[] args) {
        Subject boss = new Boss("boss");
        Observer stocker = new StockObserver("stocker",boss);
        Observer nbaer = new NBAObserver("nbaer",boss);
        boss.attach(stocker);
        boss.attach(nbaer );
        boss.setAction("I'm coming");
        boss.notifyEmployee();
    }
}