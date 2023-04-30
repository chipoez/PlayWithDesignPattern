package simpleFactory.calculator;

public class Div extends Operation {
    @Override
    public double getResult(double numberA, double numberB) {
       return numberA / numberB;
    }
}
