package phase1programs_2;

public class P5Finally{
    public static void main(String[] args)
    {
        int a=10,b=0,rs = 0;

        try
        {
            if(b==0)        
                throw(new ArithmeticException("Divide by zero."));
            else
            {
                rs = a / b;
                System.out.print("\nThe result is : " + rs);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\nERROR - " + Ex.getMessage());
        }
        finally
        {
        	System.out.println("\nResult = " + rs );
        }
        System.out.print("\nJava Programming");
    }
}
