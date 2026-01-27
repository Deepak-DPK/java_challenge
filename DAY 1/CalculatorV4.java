import java.util.*;

public class CalculatorV4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        double a = sc.nextDouble();

        System.out.print("Enter Second Number: ");
        double b = sc.nextDouble();

        System.out.print("Enter Operation (+, -, *, /): ");
        char d = sc.next().charAt(0);

        // validate operator
        if (d == '+' || d == '-' || d == '*' || d == '/') {

            double result = 0;   // SINGLE source of truth

            if (d == '+') {
                result = a + b;
                System.out.println(a + " + " + b + " = " + result);
            }
            else if (d == '-') {
                result = a - b;
                System.out.println(a + " - " + b + " = " + result);
            }
            else if (d == '*') {
                result = a * b;
                System.out.println(a + " * " + b + " = " + result);
            }
            else { // division
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                    return; // stop execution safely
                }
                result = a / b;
                System.out.println(a + " / " + b + " = " + result);
            }

            // classify result
            if (result > 0) {
                System.out.println("Result is Positive");
            }
            else if (result < 0) {
                System.out.println("Result is Negative");
            }
            else {
                System.out.println("Result is Zero");
            }

        } else {
            System.out.println("Invalid Operator");
        }
    }
}
