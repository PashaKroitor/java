package arrays_task2;

import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter integer");
            a[i] = scanner.nextInt();
        }
        System.out.println(Arrays2.positive_position(a));
    }

    public static int positive_position(int[] position) {
        int count = 0;
        int i =0;
        while (count != 2) {
            for (i = 0; i < position.length; i++) {
                if (position[i] > 0) {
                    count++;
                }
            }
        }
        return position[i];
    }
}
        /*int index = 0;
            int count = 0;
        while (index < position.length) {
            if (position[index] < 0) {
            }
            else if (position[index] > 0) {
                count++;
            }
            else {
            }
            if (count == 2) {
                return position[index];
            }
            index++;
        }
            }
        }
        }
        }*/