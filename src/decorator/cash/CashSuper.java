package decorator.cash;

public class CashSuper implements ISale{
    protected ISale component;
    //装饰对象
    public void decorate(ISale component){
        this.component = component;
    }
    @Override
    public double acceptCash(double price, int num) {
        double result = 0d;
        if(this.component!=null){
            result = this.component.acceptCash(price, num);
        }
        return result;
    }
}
