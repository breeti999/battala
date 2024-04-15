package polymorphism;

public class Addermain {

	public static void main(String[] args) {
		
		Adder addobj=new Adder();
		
		addobj.sum();
		addobj.sum(19,30); //   already given the int and decimal in Adder class
		addobj.sum(19,90.30); // already given the int and decimal in Adder class
	}

}
