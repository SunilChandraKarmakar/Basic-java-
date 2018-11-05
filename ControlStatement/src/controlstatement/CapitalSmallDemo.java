package controlstatement;

import java.util.Scanner;

public class CapitalSmallDemo 
{
    public static void CS()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any latter : ");
        char ch = input.next().charAt(0);
        
        if (ch>= 'a' && ch<= 'z') 
        {
            System.out.println("This is small later. \n\n");
        }
        else if (ch>= 'A' && ch<= 'Z') 
        {
            System.out.println("This number is capital.\n\n");
        }
        else    
        {
            System.out.println("Not a latter.\n\n");
        }
    }
}
