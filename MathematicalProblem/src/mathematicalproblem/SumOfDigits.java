package mathematicalproblem;

import java.util.Scanner;

public class SumOfDigits 
{
    public static void SD()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the digit : ");
        int digit = input.nextInt();
        int sum = 0, result, temp;
        
        temp = digit;
        
        while(temp != 0)
        {
            result = temp % 10;
            sum = sum + result;
            temp = temp / 10;
        }
        System.out.println("The sum of digit : " + sum + "\n\n");
        
    }
}
