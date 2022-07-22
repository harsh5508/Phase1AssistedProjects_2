package phase1programs_2;

class P2SleepAndWait{   
  
    private static Object obj = new Object();   
       
    public static void main(String[] args)throws InterruptedException  {   
          
        Thread.sleep(4000);   
        System.out.println( Thread.currentThread().getName() + " Thread was sleeping for four seconds");   
          
        synchronized (obj)    
        {    
            obj.wait(3000);   
            System.out.println(obj + " Object is in waiting state and woken after 3 seconds");   
        }   
    }   
}  