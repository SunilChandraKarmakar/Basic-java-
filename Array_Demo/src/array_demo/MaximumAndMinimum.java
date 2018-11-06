package array_demo;

import java.util.Scanner;

public class MaximumAndMinimum {

    public static void main(String[] args) {
        int[] number = new int[5];
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter any 5 number : ");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }

        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }

        int average = sum / number.length;
        
        int max = number[0];
        int min = number[0];
        
        for (int i = 1; i < number.length; i++) {
            if (max<number[i]) {
                max = number[i];
            }
            if (max>number[i]) {
                min = number[i];
            }
        }
        System.out.println("Sum is : " + sum 
                           + "\nAverage is : " +average 
                           + "\nMaximum number is : " + max
                           + "\nMinimum number is : " + min);       
    }
}
