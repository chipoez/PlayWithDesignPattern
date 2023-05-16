package simpleFactory.calculator;

public class OperationFactory {
    public static Operation getResult(String operator) {
        return switch (operator) {
            case "+" -> new Add();
            case "-" -> new Sub();
            case "*" -> new Mul();
            case "/" -> new Div();
            default -> null;
        };
    }
}
