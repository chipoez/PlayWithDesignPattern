package simpleFactory.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input numberA: ");
        double numberA = Double.parseDouble(sc.nextLine());
        System.out.println("please input operator: ");
        String operator = sc.nextLine();
        System.out.println("please input numberB: ");
        double numberB = Double.parseDouble(sc.nextLine());
        Operation operation = OperationFactory.getResult(operator);
        double result =operation.getResult(numberA,numberB);
        System.out.println("result is "+ result);
    }
}