package controlstatement;

import java.util.Scanner;

public class MaximumMinimum 
{
    public static void MM()
    {
        System.out.print("Enter the first number : ");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        
        System.out.print("Enter the second number : ");
        int secondNumber = input.nextInt();
        
        if (firstNumber > secondNumber) 
        {
            System.out.print("First number is maximum number.\n\n");
        }
        else if (secondNumber > firstNumber) 
        {
            System.out.println("Second number is maximum number.\n\n");
        }
        else    
        {
            System.out.println("The number is minimum\n\n");
        }
    }
}
