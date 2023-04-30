package strategy.shopCash;

public class CashContext {
    private AbstractCash ac;
    public CashContext(int cashType){
        switch (cashType){
            case 1:
                this.ac = new CashNormal();
                break;
            case 2:
                this.ac = new CashRebate(0.8);
                break;
            case 3:
                this.ac = new CashRebate(0.7);
                break;
            case 4:
                this.ac = new CashReturn(300,100);
                break;
        }
    }
    public double getResult(double price, int num){
        return this.ac.acceptCash(price,num);
    }
}
