package strategy.shopCash;

public class CashReturn extends AbstractCash{
    private double moneyCondition = 0;
    private double moneyReturn = 0;
    public CashReturn(double moneyCondition,double moneyReturn){
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }
    @Override
    public double acceptCash(double price, int num) {
        double result = price * num;
        if (result >= moneyCondition && moneyCondition > 0){
            result = result = Math.floor(result / moneyCondition) * moneyReturn;
        }
        return result;
    }

}
