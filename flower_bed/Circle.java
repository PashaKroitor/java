package flower_bed;


import java.util.Scanner;

public class Circle {

    public static void main (String [] args){

        double square;
        double length;
        double pi = Math.PI;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double r = Double.parseDouble (sc.nextLine());

        square = pi*r*r;
        length = 2*pi*r;

        System.out.format("Square is %.2f\n", square);


        System.out.format("Length is %.2f\n", length);
    }
}
