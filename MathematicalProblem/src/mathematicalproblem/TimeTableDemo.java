package mathematicalproblem;

import java.util.Scanner;

public class TimeTableDemo 
{
    public static void TTD()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Find the number of numbers : ");
        int numbers = input.nextInt();
        
        int mul; 
        for (int i = 1; i <= 10; i++) 
        {   
            mul = i * numbers;
            System.out.println(i + " * " + numbers + " = " + mul);
        }
    }
    
    public static void TTDTwo()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Find the first number of numbers : ");
        int firstNumbers = input.nextInt();
        
        System.out.print("Find the last number of numbers : ");
        int secondNumbers = input.nextInt();
        
        int mul;
        
        for (int i = firstNumbers; i <= secondNumbers; i++) 
        {
            for (int j = 1; j <= 10; j++) 
            {
                mul = j * i;
                System.out.println(i + " * " + j + " = " + mul);
            }
            System.out.println("\n\n");
        }
    }
}
