package controlstatement;

import java.util.Scanner;

public class IfElseCondation 
{
    public static void IfElse()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        
        if (number > 0) 
        {
            System.out.println("This is Positive number. \n\n");
        }
        else if (number < 0) 
        {
            System.out.println("This is Negative number. \n\n");
        }
        else    
        {
            System.out.println("Equal to zero. \n\n");
        }
    }
}
