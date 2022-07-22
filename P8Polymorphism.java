package phase1programs_2;

public class P8Polymorphism {
	
    public void A(int x, int y) 
    { 
        System.out.println(x*y); 
    } 
    public void A(int x, int y, int z) 
    { 
    	System.out.println(x*y*z);  
    } 
    public void A(double x, double y) 
    { 
    	System.out.println(x*y);
    } 
    public static void main(String args[]) 
    { 
    	P8Polymorphism m = new P8Polymorphism(); 
        m.A(56, 87); 
        m.A(56, 87, 2); 
        m.A(85.9, 54.9); 
    } 
}
