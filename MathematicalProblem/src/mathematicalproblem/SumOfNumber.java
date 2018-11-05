package mathematicalproblem;

import java.util.Scanner;

public class SumOfNumber 
{
    public static void SumSerice()
    {
        int sum = 0, i;
        for (i = 1; i <= 10; i++) 
        {
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println(sum);
    }
    
    public static void USumSerice()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int firstNumber = input.nextInt();
        
        System.out.print("Enter the second number : ");
        int secondNumber = input.nextInt();
        
        int sum = 0;
        if (firstNumber < secondNumber) 
        {
            for (int i = firstNumber; i <= secondNumber; i++) 
            {
                System.out.println(i);
                sum = sum + i;
            }
            System.out.println("\nThe sum is : " + sum);
        }
        else if (firstNumber > secondNumber)
        {
            for (int i = firstNumber; i >= secondNumber; i--) 
            {
                System.out.println(i);
                sum = sum + i;
            }
            System.out.println("\nThe sum is : " + sum);
        }
        else
            System.out.println("Wrong");
    }
    
    public static void EvenNumber()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int firstNumber = input.nextInt();
        
        System.out.print("Enter the second number : ");
        int secondNumber = input.nextInt();
        
        int even;
        if (firstNumber < secondNumber) 
        {
            if (firstNumber % 2 == 0) 
            {
                System.out.println("All even number : ");
                for (int i = firstNumber; i <= secondNumber; i = i + 2) 
                {
                    System.out.print(" " + i);
                }
            }
            else
            {
                even = firstNumber + 1;
                System.out.println("All even number : ");
                for (int i = even; i <= secondNumber; i = i + 2) 
                {
                    System.out.print(" " + i);
                }
            }
        }
        else if (firstNumber > secondNumber)
        {
            if (firstNumber % 2 == 0) 
            {
                System.out.println("All even Number : ");
                for (int i = firstNumber; i >= secondNumber; i = i - 2) 
                {
                    System.out.print(" " + i);
                }
            }
            else
            {
                even = firstNumber - 1;
                System.out.println("All even number : ");
                for (int i = even; i >= secondNumber; i = i - 2) 
                {
                    System.out.print(" " + i);
                }
            }
        }
        else
            System.out.println("Wrong");
    }
    
    public static void OddNumber()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second number : ");
        int secondNumber = input.nextInt();
        
        int odd, sum = 0;
        
        if (firstNumber < secondNumber) 
        {
            if (firstNumber % 2 == 0) 
            {
                odd = firstNumber + 1;
                for (int i = odd; i <= secondNumber; i = i + 2) 
                {
                    System.out.println(i);
                    sum = sum + i;
                }
                System.out.println("The sum is : " + sum);
            }
            
            else
            {
                for (int i = firstNumber; i <= secondNumber; i = i + 2) 
                {
                    System.out.println(i);
                    sum = sum + i;
                }
                System.out.println("The sum is : " + sum);
            }
        }
        else if (firstNumber > secondNumber) 
        {
            if (firstNumber % 2 == 0) 
            {
                odd = firstNumber - 1;
                for (int i = odd; i >=secondNumber; i = i - 2) 
                {
                    System.out.println(i);
                    sum = sum = i;
                }
                System.out.println("The sum is : " + sum);
            }
            else
            {
                for (int i = firstNumber; i >=secondNumber; i = i - 2) 
                {
                    System.out.println(i);
                    sum = sum + i;
                }
                System.out.println("the sum is : " + sum);
            }
        }
        else    
            System.out.println("Wrong");
    }
}
