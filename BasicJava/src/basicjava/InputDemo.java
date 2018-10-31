package basicjava;

import java.util.Scanner;

public class InputDemo 
{
    public static void IntInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number;
        number = input.nextInt();
        System.out.println("The number is : " +number);
    }
    
    public static void FloatInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a float number : ");
        float number;
        number = input.nextFloat();
        System.out.println("The float number is : " +number);
    }
    
    public static void StringInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name;
        name = input.nextLine();
        System.out.println("Welcome " +name + "," + " to our java class. \n\n");
    }
    
}
