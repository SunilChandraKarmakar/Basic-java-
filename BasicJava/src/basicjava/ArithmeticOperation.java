package basicjava;

import java.util.Scanner;

public class ArithmeticOperation 
{
    public static void AllOperation()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first Number : ");
        int firstNumber = input.nextInt();
        System.out.print("Input second Number : ");
        int secondNumber = input.nextInt();
        int result = firstNumber + secondNumber;
        System.out.println("The Sum is : " +result);
        
        result = firstNumber - secondNumber;
        System.out.println("The sub is : " +result);
        
        result = firstNumber * secondNumber;
        System.out.println("The multiplecation is : " +result);
        
        double resultDob = (double)firstNumber / (double) secondNumber;
        System.out.println("The division is : " +resultDob);
        
        float resultFlo = (float) firstNumber % (float) secondNumber;
        System.out.println("The moduler is : " +resultFlo + "\n\n");   
    }
}
