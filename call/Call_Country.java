package call;

public class Call_Country{

    public static void main(String [] args){
        Tarriff t1 = new Tarriff();
        t1.setCountry("USA");
        t1.setPrice(4);
        Tarriff t2 = new Tarriff();
        t2.setCountry("Japan");
        t2.setPrice(7);
        Tarriff t3 = new Tarriff();
        t3.setCountry("Italy");
        t3.setPrice(3);
        System.out.println("")

        System.out.println(t1 + " " + t1.getSum(30));

    }
}