package basicjava;

public class IncrementDecrement 
{
    public static void ID ()
    {
        int a = 20;
        int result = a++; //postfix increment = 20
        System.out.println("Result " +result);
        
        result = ++a; //pretfix increment = 22
        System.out.println("Result " +result);
        
        result = a--; //pretfix decrement = 22
        System.out.println("Result " +result);
        
        result = --a; //postfix decrement = 20
        System.out.println("Result " +result + "\n\n");
        
    }
}
