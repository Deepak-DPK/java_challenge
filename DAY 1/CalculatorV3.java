import java.util.*;

public class CalculatorV3 {

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
                if(b== 0)
                {
                    System.out.println("Second Number 0 cannot be divided");
                }
                else
                {
                    System.out.println(a+ "/" + b + "=" + (a/b));
                }
            }
            
            else
            {
                System.out.println("Invalid Input");
            }

        }
        else
        {
            System.out.println("Invalid Operator");
        }

        
    }
    
}
