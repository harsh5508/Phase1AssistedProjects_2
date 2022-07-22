package phase1programs_2;

public class P1MyThreadAP extends Thread
{
 	public void run()
 	{
  		System.out.println("Concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		
 		P1MyThreadAP mt = new  P1MyThreadAP();
  		mt.start();
 	}
}
