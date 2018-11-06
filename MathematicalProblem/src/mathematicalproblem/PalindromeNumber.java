package mathematicalproblem;

import java.util.Scanner;

public class PalindromeNumber 
{
    public static void PN()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        
        int sum = 0, temp = number, result;
        
        while(temp != 0)
        {
            result = temp % 10;
            sum = sum * 10 + result;
            temp = temp / 10;
        }
        
        if (number == sum) 
            System.out.println("The number is Palindrome number : " + sum);
        else
            System.out.println("The number is not Palindrome number : " + sum);
    }
}
