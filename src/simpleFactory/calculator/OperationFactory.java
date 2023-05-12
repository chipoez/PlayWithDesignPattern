package simpleFactory.calculator;

public class OperationFactory {
    public static Operation getResult(String operator) {
        Operation operation = switch (operator) {
            case "+" -> new Add();
            case "-" -> new Sub();
            case "*" -> new Mul();
            case "/" -> new Div();
            default -> null;
        };
        return operation;
    }
}
