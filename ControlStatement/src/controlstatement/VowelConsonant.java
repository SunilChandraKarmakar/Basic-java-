package controlstatement;

import java.util.Scanner;

public class VowelConsonant 
{
    public static void VC()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = input.next().charAt(0);
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
        {     
            System.out.println("The character is vowel.\n\n");
        }
        else
            System.out.println("The character consonant.\n\n");
    }
}
