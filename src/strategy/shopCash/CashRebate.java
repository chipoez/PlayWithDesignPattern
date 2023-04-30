package strategy.shopCash;

public class CashRebate extends AbstractCash{
    private double moneyRebate = 1d;
    public CashRebate(double moneyRebate){
        this.moneyRebate = moneyRebate;
    }
    @Override
    public double acceptCash(double price, int num) {
        return price * num * this.moneyRebate;
    }
}
