import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class MyCollection {

    private  static List <Integer> myList1 = new ArrayList<>();

    public static void fillList(int size){
        Random random = new Random();

        for(int i =0; i < size; i++){
            myList1.add(random.nextInt());
        }
    }

    public static void addValueByIndex(int index, int value){
        if(index > 0 && index < myList1.size()){
        myList1.add(index, value);}
        else{
            System.out.println("Something wrong");
        }
    }

    public static void prettyPrint(){
        int i= 0;
        while (i < myList1.size()){
        while (i < myList1.size() && i%4 !=0){
            System.out.print(myList1.get(i) + " " + i + "   ");
            i++;
        }
//i++;
            System.out.println();

    }}

    public static void main(String [] args){
/*
        List <Integer> myList = new ArrayList<>();

        myList = new ArrayList<>(10);
        Random random = new Random();

        for(int i =0; i < 10; i++){
            myList.add(random.nextInt());
        }



        System.out.println(myList);
        List <Integer> myList2 = new ArrayList<>();

        for(int i = 0; i < myList.size(); i++){
            if (myList.get(i) > 5){
                myList2.add(i);
            }
        }
        System.out.println(myList2);

        Iterator <Integer> iter = myList.iterator();
        while (iter.hasNext()){
            if (iter.next() > 20){
                iter.remove();
            }
        }
        System.out.println(myList);
        System.out.println();
        System.out.println();

        addValueByIndex(5, 7);
*/


        System.out.println(myList1);

        fillList(45);
        prettyPrint();
    }

}
