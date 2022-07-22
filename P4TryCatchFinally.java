package phase1programs_2;

public class P4TryCatchFinally{    
    public static void main(String args[]){   

    try {    
           System.out.println("Try block");  
           int data=5/0;    
           System.out.println(data);    
    }   
    catch(ArithmeticException e){ 
    	
           System.out.println("Exception handled in catch");  
           System.out.println(e);  
    }    
    finally {  
           System.out.println("finally block is always executed");  
    }    

           System.out.println("Hello World");    
    }    
  }  