package name_age;


import java.util.Scanner;

public class Name_Age {

    public static void main (String [] args){

        String name;
        int age;
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name: ");
        name = sc.nextLine();
        System.out.println("How old you: ");
        age = Integer.parseInt(sc.nextLine());

        System.out.println("Your name is " + name + ". " + "You are " + age + ".");
    }
}
