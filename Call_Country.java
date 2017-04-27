package Call;

import java.util.Scanner;

public class Call_Country {
	public static void main(String [] args){
		
		Tariff t1 = new Tariff();
	    t1.setCountry("USA");
	    t1.setPrice(4);
	    Tariff t2 = new Tariff();
	    t2.setCountry("Japan");
	    t2.setPrice(7);
	    Tariff t3 = new Tariff();
	    t3.setCountry("Italy");
	    t3.setPrice(3);
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter tariff for USA:");
	    int sumUSA = Integer.parseInt(sc.nextLine());
	    
	    System.out.println("Enter tariff for Japan:");
	    int sumJapan = Integer.parseInt(sc.nextLine());
	    
	    System.out.println("Enter tariff for Italy:");
	    int sumItaly = Integer.parseInt(sc.nextLine());
	    sc.close();

	    System.out.println(t1 + " " + t1.getSum(sumUSA));
	    System.out.println(t2 + " " + t2.getSum(sumJapan));
	    System.out.println(t3 + " " + t3.getSum(sumItaly));
	    
	    double total = t1.getSum(sumUSA) + t2.getSum(sumJapan) + t3.getSum(sumItaly);
	    
	    System.out.println("Total sum is - " + total + ".");
	    
	}	
}