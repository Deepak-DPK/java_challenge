import java.util.*;

public class calculator
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
       
        System.out.println("Enter your First number : ");
        int a= sc.nextInt();

        System.out.println("Enter your Second number : ");
        int b = sc.nextInt();

        System.out.println("Enter operation(+,-,*,/) : ");
        char d = sc.next().charAt(0);
         
        if (d == '+')
        {
            
            System.out.println("Result: " + (a+b));

        }
        else if (d == '-')
        {
            
            System.out.println("Result: "+ (a-b));

        }
        else if (d == '*')
        {
            
            System.out.println("RESULT: "+(a*b));

        }
        else if (d == '/')
        {
            
            System.out.println("Result: "+((double)a/b));

        }
        else
        {
            System.out.println("Invalid Operation");
        }
        

    }
}