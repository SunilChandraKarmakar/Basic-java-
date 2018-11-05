package mathematicalproblem;

import java.util.Scanner;

public class CircleDemo 
{
    public static void Circle()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double radius = input.nextDouble();
        double doubleRadius = radius * radius;
        double circale = 3.1416 * doubleRadius;
        System.out.println("The Circle is : "+circale + "\n\n");
    }
}
