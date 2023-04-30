package strategy.shopCash;

public class CashNormal extends AbstractCash{
    @Override
    public double acceptCash(double price, int num) {
        return price * num;
    }
}
