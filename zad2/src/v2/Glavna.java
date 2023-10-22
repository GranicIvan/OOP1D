package v2;

import java.io.IOException;

public class Glavna {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Druge vezbe");
		
		
		SkolaJezika sj = new SkolaJezika("kursevi.txt");
		
		System.out.println(sj);
		
	}
	
}

