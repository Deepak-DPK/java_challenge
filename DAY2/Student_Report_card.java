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
        double avg = (marks1+marks2+marks3)/3.0;
        return avg;
    }

    void displayReport()
    {
        System.out.println("Name: "+name);
        System.out.println("total : "+calculateTotal());
        System.out.println("Average: "+ calculateAverage());
    }

}
public class Student_Report_card
{
    public static void main(String[] args) 
    {

        Student s1 = new Student();
        s1.name = "DEEPAK";
        s1.marks1 = 45;
        s1.marks2 = 56;
        s1.marks3 = 68;
        
        s1.displayReport();
    }
}