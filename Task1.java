package academy;
import java.util.Scanner;

public class Task1 {
	public static void main (String [] args){
		
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть ц≥ле число а:");
		a = Integer.parseInt(sc.nextLine());
		System.out.println("¬вед≥ть ц≥ле число b:");
		b = Integer.parseInt(sc.nextLine());
		sc.close(); 
		
		int x = a + b;
		int y = a - b;
		int z = a * b;
		double c = (double) a / b;
		
		System.out.println("а + b = " + x);
		System.out.println("а - b = " + y);
		System.out.println("а * b = " + z);
		System.out.println("а / b = " + c);
		
	}

}
