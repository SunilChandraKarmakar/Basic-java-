package mathematicalproblem;

import java.util.Scanner;

public class ReverseNumber 
{
    public static void RN()
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
        
        System.out.println("The revarce number : " + sum + "\n\n");
        
    }
}
