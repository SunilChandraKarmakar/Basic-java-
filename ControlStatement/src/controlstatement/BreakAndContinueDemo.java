package controlstatement;

public class BreakAndContinueDemo 
{
    public static void BCondtion()
    {
        for (int i=1; i<100; i++) 
        {
            if (i == 10) 
            {
                break;
            }
            System.out.println(i);
        }
        System.out.println("\n");
        
        for (int j=1; j<100; j=j+2) 
        {
            if (j == 10) 
            {
                break;
            }
            System.out.println(j);
        }
        System.out.println("\n\n");
    }
    
    public static void CCondtion()
    {
        for (int i=0; i<20; i++) 
        {
            if(i == 10)
                continue;
            
            System.out.println(i);
        }
        System.out.println("\n\n");
        
        for (int j=0; j<20; j=j+3) 
        {
            if(j == 10)
                continue;
            
            System.out.println(j);
        }
        System.out.println("\n\n");
    }
    
    public static void BCCondtion()
    {
        for (int i = 0; i < 100; i++) 
        {
            if (i == 10) 
                continue;
            
            if (i > 13)
                break;
            
            System.out.println(i);
        }
    }
}
