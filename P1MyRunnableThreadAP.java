package phase1programs_2;

public class P1MyRunnableThreadAP implements Runnable{
 
    public static int myCount = 0;
    public P1MyRunnableThreadAP(){
         
    }
    public void run() {
        while(P1MyRunnableThreadAP.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++P1MyRunnableThreadAP.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        P1MyRunnableThreadAP mrt = new P1MyRunnableThreadAP();
        Thread t = new Thread(mrt);
        t.start();
        while(P1MyRunnableThreadAP.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++P1MyRunnableThreadAP.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}
