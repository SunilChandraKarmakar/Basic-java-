package controlstatement;

import java.util.Scanner;

public class TernaryOperator 
{
    public static void TO()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second number : ");
        int secondNumber = input.nextInt();
        
        int bigNumber = (firstNumber > secondNumber) ? firstNumber : secondNumber;
        System.out.println("The big number is : " + bigNumber);
        
    }
}
