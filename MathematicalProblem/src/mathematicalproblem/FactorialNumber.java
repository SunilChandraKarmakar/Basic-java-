package mathematicalproblem;

import java.util.Scanner;

public class FactorialNumber
{
    public static void FN()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Find a number of factorial : ");
        int fcNumber = input.nextInt();
        int sum = 1;
        for (int i = fcNumber; i >= 1; i--) 
        {
            sum = sum * i;
            System.out.print(i + " ");
        }
        System.out.println("\nThe factroial of "+ fcNumber +" is : " + sum + "\n\n");
    }
}
