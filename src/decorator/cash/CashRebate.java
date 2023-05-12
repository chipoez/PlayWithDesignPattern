package decorator.cash;

public class CashRebate extends CashSuper{
    private double moneyRebate = 1;
    //初始化
    public CashRebate (double moneyRebate){
        this.moneyRebate = moneyRebate;
    }
    @Override
    public double acceptCash(double price, int num) {
        double result = price * num * this.moneyRebate;
        return super.acceptCash(result,1);
    }
}
