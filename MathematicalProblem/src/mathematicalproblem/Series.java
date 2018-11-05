package mathematicalproblem;

import java.util.Scanner;

public class Series 
{
    public static void OneToN()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int anyNumber = input.nextInt();
        
        System.out.println("The series is : ");
        for (int i = 1; i <= anyNumber; i++) 
        {
            System.out.print(i + " ");
        }
    }
    
    public static void OneThree()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int anyNumber = input.nextInt();
        
        for (int i = 1; i <= anyNumber; i = i + 2) 
        {
            System.out.print(i + " ");
        }
    }
    
    public static void OnePointFive()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        float anyNumber = input.nextInt();
        
        for (float i = 1.5f; i < anyNumber; i = i + 1.0f) 
        {
            System.out.print(i + " ");
        }
    }
    
    public static void OneIntoTwo()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int anyNumber = input.nextInt();
        int sum =1;
        for (int i = 1; i <= anyNumber; i++) 
        {
            sum = sum * i;
            System.out.print(i + "*" + i);
        }
        System.out.println("\nThe sum is : " + sum);
    }
}
