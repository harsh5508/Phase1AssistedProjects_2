package phase1programs_2;

class P5Exception extends Exception 
{
    public P5Exception(String s) 
    { 
        super(s); 
    } 
} 
public class P5CustomException 
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new P5Exception("IN TRY BLOCK"); 
        } 
        catch (P5Exception ex) 
        { 
            System.out.println("IN CATCH BLOCK"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
}
