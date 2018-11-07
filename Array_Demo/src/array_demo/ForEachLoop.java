package array_demo;

public class ForEachLoop 
{
    public static void main(String[] args) 
    {
        System.out.print("Show name :");
        String[] name = {"Abcd", "Efgh", "Ijkl", "Mnop", "Qrst"};
        int[] SubNumber = {2, 3, 4, 5, 3, 2, 4, 5};
        int sub = 0;
        for (String showName : name)
        {
            System.out.print(" " + showName);
        }
        
        System.out.print("\nSumation is : ");
        for (int Sumation : SubNumber)
        {
            sub = sub + Sumation;
        }
        System.out.println(sub);
    }
}
