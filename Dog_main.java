package dog;

public class Dog_main {

    public static void main(String [] args){

        Dog d1 = new Dog(Dog.Breed.TAKSA, "Chaki", 11);
        Dog d2 = new Dog(Dog.Breed.PITBUL, "FUNT", 7);
        Dog d3 = new Dog(Dog.Breed.TAKSA, "KEKS", 1);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        if(d1.getBreed().equals(d2.getBreed()) && d1.getBreed().equals(d3.getBreed())){

                System.out.println("Dogs are one breed.");
        }
        else{
            System.out.println("Dogs of different breeds.");
        }

        Dog Example = d1;

        if(Example.getAge() < d2.getAge()){
            Example = d2;
        if(Example.getAge() < d3.getAge()) {
            Example = d3;
        }

        }
        System.out.println(Example);
    }
}
