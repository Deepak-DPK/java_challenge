import java.util.*;

public class CalculatorV2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter First Number: ");
        double a = sc.nextDouble();
        System.out.println("Enter Second Number: ");
        double b = sc.nextDouble();
        System.out.println("Enter OPERATIONS (+,-,*,/) : ");
        char d = sc.next().charAt(0);

        if ((d == '+') || (d == '-') || (d == '*') || (d == '/'))
        {
            if(d=='+')
            {
                System.out.println(a + "+" + b + "=" +(a+b));
            }

            else if(d=='-')
            {
                System.out.println(a + "-" + b + "=" +(a-b));
            }

            else if(d=='*')
            {
                System.out.println(a+ "*" + b + "=" +(a*b));
            }

            else if(d=='/')
            {
                System.out.println(a+ "/" + b + "=" +(a/b));
            }
            
            else
            {
                System.out.println("Invalid Input");
            }

        }
        else
        {
            System.out.println("Invalid Operator Please Enter Valid operator");
        }

        
    }
    
}
