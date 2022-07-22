package phase1programs_2;

public class P5Throw{
    public static void main(String[] args)
    {
        int a=10,b=0,rs;

        try
        {
            if(b==0)        
                throw(new ArithmeticException("INVALID - Divide by zero."));
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

        System.out.print("\nJava Programming");
    }
}
