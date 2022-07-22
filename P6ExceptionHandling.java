package phase1programs_2;

public class P6ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			try{
				
				System.out.println(5/0);
			}
			catch(ArithmeticException e){
				e.printStackTrace();
			}
			finally{
				System.out.println("End of program");
			}
			System.out.println("Hello All!!!");
	}

}