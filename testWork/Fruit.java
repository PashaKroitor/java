package testWork;

public class Fruit implements IJuiceable, ISliceable{
	
	Fruit(String name){
	    this.name = name;
	    }
	private String name = new String();

	public void setName(String name){
	    this.name = name;
	    }

	public String getName(){
	    return name;
	    }
@SuppressWarnings("hiding")
@Override
	public  <ISliceable> void makeSlices () {
		System.out.println("������ � " + getName());
		
	}
@SuppressWarnings("hiding")
@Override
public  <IJuiceable> void makeJuice() {
		System.out.println("ѳ� � " + getName());		
	}
	
}
