import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class MyCollection {
    private  static List <Integer> myList1 = new ArrayList<>();

    public static void fillList(int size){
        Random random = new Random();
        for(int i =0; i < size; i++){
            myList1.add(random.nextInt(100)-50);
        }
        System.out.println(myList1);
    }

    public static void addValueByIndex(int index, int value){
        if(index > 0 && index < myList1.size()){
        myList1.add(index, value);
            System.out.println(myList1);
        }
        else{
            System.out.println("Something wrong");
        }
    }

    public static void prettyPrint(){
        int i= 0;
        while (i < myList1.size()){
        while (i < myList1.size() && i%4 !=0){
            System.out.print(myList1.get(i) + " " + i + "   ");
        }
            i++;
        }
        System.out.println();
    }

    public static void main(String [] args){

        fillList(10);

        List <Integer> myList2 = new ArrayList<>();
        for(int i = 0; i < myList1.size(); i++){
            if (myList1.get(i) > 5){
                myList2.add(myList1.get(i));
            }
        }   System.out.println(myList2);

        /*Iterator <Integer> iter = myList.iterator();
        while (iter.hasNext()){
            if (iter.next() > 20){
                iter.remove();
            }
        }*/

        addValueByIndex(5, 7);
        //prettyPrint();
    }

}
