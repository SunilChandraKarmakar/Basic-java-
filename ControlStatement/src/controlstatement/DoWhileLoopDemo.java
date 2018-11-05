package controlstatement;

public class DoWhileLoopDemo 
{
    public static void DWL()
    {
        int i = 0;
        do{
            System.out.println(i + " : Bangladesh");
            i++;
        }while(i<10);
        System.out.println("\n");
        
        int start = 2;
        do{
            System.out.println(start);
            start = start + 2;
        }while(start<20);
        System.out.println("\n");
        
        int count = 0;
        do{
            System.out.println(count);
            count++;
        }while(count<50);
    }
}
