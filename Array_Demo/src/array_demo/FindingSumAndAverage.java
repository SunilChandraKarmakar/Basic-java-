package array_demo;

import java.util.Scanner;

public class FindingSumAndAverage 
{
    public static void main(String[] args) 
    {
        int[] number = new int[5];
        int sum = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter any 5 number : ");
        for (int i = 0; i < number.length; i++) 
        {
            number[i] = input.nextInt();
        }
        
        for (int i = 0; i < number.length; i++) 
        {
            sum = sum + number[i];
        }
        
        int average = sum / number.length;
        System.out.println("Sum of the number is : " + sum);
        System.out.println("Average is : " + average);
    }
}
