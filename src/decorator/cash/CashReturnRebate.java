package decorator.cash;

import strategy.shopCash.AbstractCash;

public class CashReturnRebate extends AbstractCash {
    private double moneyRebate = 1;
    private double moneyCondition = 0;
    private double moneyReturn = 0;
    public CashReturnRebate (double moneyRebate,double moneyCondition,double moneyReturn){
        this.moneyCondition = moneyCondition;
        this.moneyRebate = moneyRebate;
        this.moneyReturn = moneyReturn;
    }
    @Override
    public double acceptCash(double price, int num) {
        double result = price * num * this.moneyRebate;
        if(moneyCondition > 0 && result >= moneyCondition){
            result = result - Math.floor(result / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
