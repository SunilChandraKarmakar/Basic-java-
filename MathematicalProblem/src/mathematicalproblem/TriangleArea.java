package mathematicalproblem;

import java.util.Scanner;

public class TriangleArea 
{
    public static void Solution()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base size : ");
        double base = input.nextDouble();
        System.out.print("Enter the height size : ");
        double height = input.nextDouble();
        
        double mulBaseHeight = base * height;
        double area = 0.5 * mulBaseHeight;
        System.out.println("Triangle area is : " +area + "\n\n");
        
    }
}
