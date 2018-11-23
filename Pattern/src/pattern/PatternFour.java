package pattern;

import java.util.Scanner;

public class PatternFour 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter line number : ");
        int number = input.nextInt();
        
        for (int row = 1; row <= number; row++) 
        {
            for (int col = 1; col <= row; col++) 
            {
                int reminder = col % 2;
                System.out.print(" " + reminder);
            }
            System.out.print("\n");
        }
    }
}
