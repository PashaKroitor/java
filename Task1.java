package academy;
import java.util.Scanner;

public class Task1 {
	public static void main (String [] args){
		
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� ����� �:");
		a = Integer.parseInt(sc.nextLine());
		System.out.println("������ ���� ����� b:");
		b = Integer.parseInt(sc.nextLine());
		sc.close(); 
		
		int x = a + b;
		int y = a - b;
		int z = a * b;
		double c = (double) a / b;
		
		System.out.println("� + b = " + x);
		System.out.println("� - b = " + y);
		System.out.println("� * b = " + z);
		System.out.println("� / b = " + c);
		
	}

}
