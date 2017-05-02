package arrays_task2;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        int a[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter integer");
            a[i] = scanner.nextInt();
        }

        System.out.println(Array.calculate(a));
    }

    public static int calculate(int[] numeric) {
        int sum = 0;
        boolean success = false;
        for (int i = 0; i < numeric.length / 2; i++){
            if (numeric[i] > 0) {
                sum += numeric[i];
            }
            else {
                success = true;
                break;
            }
        }
        if (success == true ) {
            sum = 0;
            for (int i = numeric.length / 2; i < numeric.length; i++) {
                sum += numeric[i];
            }
        }

        return sum;
    }
}