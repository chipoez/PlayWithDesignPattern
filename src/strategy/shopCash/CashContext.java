package strategy.shopCash;

public class CashContext {
    private AbstractCash ac;
    public CashContext(int cashType){
        switch (cashType) {
            case 1 -> this.ac = new CashNormal();
            case 2 -> this.ac = new CashRebate(0.8);
            case 3 -> this.ac = new CashRebate(0.7);
            case 4 -> this.ac = new CashReturn(300, 100);
            case 5 -> this.ac = new CashReturnRebate(0.8, 300, 100);
        }
    }
    public double getResult(double price, int num){
        return this.ac.acceptCash(price,num);
    }
}
