package mathematicalproblem;

import java.util.Scanner;

public class FibonacciSeries 
{
    public static void FS()
            
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How may number : ");
        int number = input.nextInt();
        int firstNumber = 0, secondNumber = 1, fibo;
        
        System.out.print(firstNumber + " "  + secondNumber + " ");
        
        for (int i = 3; i <= number; i++) 
        {
            fibo = firstNumber + secondNumber;
            System.out.print(fibo + " ");
            firstNumber = secondNumber;
            secondNumber = fibo;
        }
        System.out.println("\n\n");
    }
}
