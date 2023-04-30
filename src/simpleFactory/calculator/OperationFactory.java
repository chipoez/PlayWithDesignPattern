package simpleFactory.calculator;

public class OperationFactory {
    public static Operation getResult(String operator) {
        Operation operation = null;
        switch(operator) {
            case "+":
                operation = new Add();
                break;
            case "-":
                operation = new Sub();
                break;
            case "*":
                operation = new Mul();
                break;
            case "/":
                operation = new Div();
                break;
        }
        return operation;
    }
}
