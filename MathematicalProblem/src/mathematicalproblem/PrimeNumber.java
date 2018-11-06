package mathematicalproblem;

import java.util.Scanner;

public class PrimeNumber 
{
    public static void PN()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any positive number : ");
        int number = input.nextInt();
        int count = 0;
        for (int i = 2; i < number; i++) 
        {
            if (number % i == 0) 
            {
                count++;
                break;
            }
        }
        if (count == 0) 
        {
            System.out.println("Prime number");
        }
        else
            System.out.println("Not prime number");
    }
    
    public static void Upn()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any positive start number : ");
        int startNumber = input.nextInt();
        
        System.out.print("Enter any positive end number : ");
        int endNumber = input.nextInt();
        int count = 0;
        
        for (int i = startNumber; i <= endNumber; i++) 
        {
            for (int j = 2; j < i - 1; j++) 
            {
                if (i % j == 0) 
                {
                    count++;
                    break;
                }
            }
            if (count == 0) 
            {
                System.out.println(i);
            }
            count = 0;
        }
    }
}
