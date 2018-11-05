package mathematicalproblem;

import java.util.Scanner;

public class CelsiusToFahrenheit 
{
    public static void Solution()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Celsius : ");
        double celsius = input.nextDouble();
        double fahrenheit = 1.8 * celsius + 32;
        System.out.println("Fahrenheit : " +fahrenheit);
    }
}
