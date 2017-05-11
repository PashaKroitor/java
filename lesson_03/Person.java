package lesson_03;

import java.util.Scanner;

public class Person {

    private String name;
    private int birthYear;
    private int growth;
    private int weight;

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getYear() {return birthYear;}

    public void setYear(int year) {this.birthYear = year;}

    public Person(){
    }

    public Person(String name, int year){
        this.name = name;
        this.birthYear = year;
    }
    @Override
    public String toString() {
        return "Person name is " + getName() + ", birthYear is " + getYear() + ".";
    }

    public void age(){
        int age = 2017 - birthYear;
        System.out.println(getName() + " age is " + age);
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter growth for " + getName());
        growth = sc.nextInt();
        System.out.println("Enter wight for " + getName());
        weight = sc.nextInt();
        sc.close();

    }

    public void output(){
        System.out.println("Person " + getName() + " growth is " + growth + " weight is " + weight);
    }

    public void changeName(String name){
        System.out.println("New name for " + getName() + " is " + name);
    }
}

