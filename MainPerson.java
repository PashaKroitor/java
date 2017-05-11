package lesson_03;

import java.util.ArrayList;


public class MainPerson {

	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<Person>();
		
		Person p1 = new Person("Bob", 1987);
		personList.add(p1);
		Person p2 = new Person("Tomas", 1967);
		personList.add(p2);
		Person p3 = new Person("Jeck", 1993);
		personList.add(p3);
		Person p4 = new Person("Tony", 2002);
		personList.add(p4);
		Person p5 = new Person("Sem", 1982);
		personList.add(p5);
		
		for (Person person: personList){
			System.out.println(person);
			person.age();
			person.changeName("Roman");
		}
		
		/*System.out.println(p1);		
		p1.age();		
		p1.changeName("Roman");
		p1.input();*/
		//p1.output();
		
	}

}
