package controlstatement;

public class ForLoopDemo 
{
    public static void ForLoop()
    {
        for (int i=1; i<=5; i++) 
        {
            System.out.println(i + " : Bangladesh");
        }
        
        System.out.println("\n1 to 20 even number : ");
        for (int i=2; i<=20; i = i+2) 
        {
            System.out.println(i);
        }
        
        System.out.println("\nCount 10 to 1 : ");
        for (int i = 10; i >=1; i--) 
        {
            System.out.println(i);
        }
    }
}
