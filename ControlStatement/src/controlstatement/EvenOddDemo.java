package controlstatement;

import java.util.Scanner;

public class EvenOddDemo 
{
    public static void EvenOdd()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        
        if (number % 2 == 0) 
        {
            System.out.println("The number is Even\n\n");
        }
        else    
        {
            System.out.println("The number is Odd\n\n");
        }
    }
}
