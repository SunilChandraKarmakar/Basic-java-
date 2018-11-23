package pattern;

import java.util.Scanner;

public class PatternOne 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter line numbers : ");
        int number = input.nextInt();
        
        for (int i = 1; i <= number; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(" " + j);
            }
            System.out.print("\n");
        }
    }
}
