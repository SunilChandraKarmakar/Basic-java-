package mathematicalproblem;

import java.util.Scanner;

public class ArmstrongNumber 
{
    public static void AN()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the digit : ");
        int digit = input.nextInt();
        int sum = 0, result, temp;
        
        temp = digit;
        
        while(temp != 0)
        {
            result = temp % 10;
            sum = sum + result * result * result;
            temp = temp / 10;
        }
        
        if (digit == sum) 
            System.out.println("The number is Armstrong Number : " + sum);
        else
            System.out.println("The number is not Armstrong Number : " + sum);
    }
}
