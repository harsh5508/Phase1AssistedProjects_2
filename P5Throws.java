package phase1programs_2;

import java.io.*;  

class M{
	
     void method()throws IOException{
    	 
         throw new IOException("device error");  
 }  
}  

public class P5Throws{  
   
	public static void main(String args[]){  
    
		try{  
            M m=new M();  
            m.method();  
         }
		catch(Exception e){
			System.out.println("exception handled");
			
		 }     
  
     System.out.println("Hello World");  
  }  
}  