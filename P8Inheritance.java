package phase1programs_2;

class one {
	public void print()
	{
		System.out.println("Java");
	}
}

class two extends one {
	
	public void printc() { 
	
		System.out.println("Inheritance");
		
	}
}

public class P8Inheritance {
	public static void main(String[] args)
	{
		two g = new two();
		g.print();
		g.printc();
	}
}
