package decorator.cash;

public class CashNormal implements ISale{
    @Override
    public double acceptCash(double price, int num) {
        return price * num;
    }
}
