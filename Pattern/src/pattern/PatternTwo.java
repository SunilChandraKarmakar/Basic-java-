package pattern;

import java.util.Scanner;

public class PatternTwo 
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
                System.out.print("# ");
            }
            System.out.print("\n");
        }
    }
}
