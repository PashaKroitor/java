package practical_tasks_4;

import java.util.Scanner;

public class Arrays_method {

    public static void main (String [] args){

        int month_days[] = {31, 28, 31, 30, 31, 30,
                            31, 31, 30, 31, 30, 31};

        System.out.println("Enter month number");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println("This month has " + month_days[i - 1] + " days");
    }
}
