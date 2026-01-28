package DAY2;

import java.util.*;

class Student{
    String name;
    int marks1;
    int marks2;
    int marks3;

    int calculateTotal()
    {
        int total = marks1 + marks2 + marks3 ;
        return total;
    }

    double calculateAverage()
    {
        return calculateTotal()/3.0;
    }

    boolean hasPassed(int passMarks)
    {
        if (calculateAverage()>= passMarks) 
            {
                return true;
            }
        else
        {
            return false;
        }
    }
}

class ReportPrinter
{
    void print(Student s)
    {
        System.out.println("Name: "+s.name);
        System.out.println("total : "+s.calculateTotal());
        System.out.println("Average: "+ s.calculateAverage());
        System.out.println("--------------------");

        
    }
    
    void compare(Student s1, Student s2)
    {
        if(s1.calculateTotal()>s2.calculateTotal())
        {
            System.out.println(s1.name +  " Has Higher Total");
        }
        else if(s1.calculateTotal()<s2.calculateTotal())
        {
            System.out.println(s2.name + " Has Higher Total");
        }
        else if(s1.calculateTotal() == s2.calculateTotal())
        {
            System.out.println("Both have equal total");
        }
    }

}
public class Student_Report_card_v4
{
    public static void main(String[] args) 
    {

        Student s1= new Student();
        
        s1.name = "DEEPAK";
        s1.marks1 = 45;
        s1.marks2 = 56;
        s1.marks3 = 68;
        
        Student s2= new Student();
        s2.name = "SRINATH";
        s2.marks1 = 85;
        s2.marks2 = 76;
        s2.marks3 = 58;

        ReportPrinter printer = new ReportPrinter();
        printer.print(s1);
        printer.print(s2);
        
        s1.marks1 = 52;
        printer.print(s1);

        printer.compare(s1, s2);


        if (s1.hasPassed(50)) 
            {
                System.out.println("Passed");
            } 
            else 
                {
                     System.out.println("Failed");
                }

    }
}