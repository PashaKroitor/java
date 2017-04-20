package task1;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		System.out.println("How are you?");

		Scanner s = new Scanner(System.in);

		String answer = s.nextLine();
		s.close();
		
		System.out.println("You are " + answer);

	}

}
