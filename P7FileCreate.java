package phase1programs_2;

import java.io.File;
import java.io.IOException;

public class P7FileCreate {
	public static void main(String[] args)
	{

		try {
			File obj = new File("P7CreateFile.txt");
			if (obj.createNewFile()) {
				System.out.println("File created: "+ obj.getName());
			}
			else {
				System.out.println("File already exists.");
			}
		}
		
		catch (IOException e) {
			
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}
}
