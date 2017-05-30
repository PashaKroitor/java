package student;

import java.util.Collections;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	public static void main (String[] arg){
		
		Student st1=new Student("Masha", "Ivanova", 3.5);
		Student st2=new Student("Valia", "Petrova", 4.1);
		Student st3=new Student("Zina", "Top", 4.9);
		Student st4=new Student("Ala", "Vogan", 5);
		Student st5=new Student("Lena", "Safr", 2.9);
		
		Group gr1 = new Group("CH_049");
		
		gr1.addStudent(st1);
		gr1.addStudent(st2);
		gr1.addStudent(st3);
		gr1.addStudent(st4);
		gr1.addStudent(st5);
		
		IO io= new JsonIo ();
		String jsonS = "";
		try {
			 jsonS=io.convFromStudToString(st1);
			System.out.println(st1 + "--" + jsonS + "\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {			
			Student newSt = io.convFromStringToStud(jsonS);
			System.out.println(jsonS + " -- " + newSt + "\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		 //// customer  ////
		
		IO io2 = new Customer();
	    String customer = "";
	    try{
	    	customer = io2.convFromStudToString(st1);
	    	System.out.println(customer + "\n");
	    } catch (Exception e) {
			e.printStackTrace();
		}
	    ////////
	    try{
	    	String customer1 = customer;
	    	System.out.println(io2.convFromStringToStud(customer1) + "\n");
	    } catch (Exception e) {
			e.printStackTrace();
		}	   
	    		
		//// group ////			
		
	    
	    System.out.println(gr1 + "\n" + "\n");
		String grJson = gr1.convFromGroupToString(gr1);
		System.out.println(grJson + "\n");
		
		for(Object o: gr1.stList){
			System.out.println(o);
		}		
		System.out.println();
		
		//// sort by first name  ////
		
		Collections.sort(gr1.stList, new SortedByFirstName());
		for(Object o: gr1.stList){
			System.out.println(o);
		}
		System.out.println();
		
		//// sort by last name  ////
		
		Collections.sort(gr1.stList, new SortedByLastName());
		for(Object o: gr1.stList){
			System.out.println(o);
		}
		System.out.println();
		
	    //// sort by mark  ////
		
		Collections.sort(gr1.stList, new SortedByMark());
		for(Object o: gr1.stList){
			System.out.println(o);
		}
		System.out.println();
		
		//// remove by mark  ////		
		
		gr1.removeStudent(3.0);		
		
		ObjectMapper mapper= new ObjectMapper();		
		try {
			System.out.println(mapper.writeValueAsString(gr1));
		
		}catch(Exception e) {
				e.printStackTrace();
		}
		}
	}
	
