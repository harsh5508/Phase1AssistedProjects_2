package phase1programs_2;

interface i1 
{  
    default void show() 
    { 
        System.out.println("Default First"); 
    } 
} 
interface i2 
{  
    default void show() 
    { 
        System.out.println("Default Second"); 
    } 
}  
public class P9DiamondProblem implements i1, i2 //Multiple inheritance is not supported in java.
// It leads to Diamond Problem which can be solved by using interfaces.
{  
    public void show() 
    {  
        i1.super.show(); 
        i2.super.show(); 
    } 
    public static void main(String args[]) 
    { 
    	P9DiamondProblem ob = new P9DiamondProblem(); 
        ob.show(); 
    } 
}
