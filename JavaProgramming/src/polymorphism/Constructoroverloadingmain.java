package polymorphism;

public class Constructoroverloadingmain {

	public static void main(String[] args) {
		Constructoroverloading con=new Constructoroverloading(); //1
		System.out.println(con.volume());
		Constructoroverloading con1=new Constructoroverloading(12,23,34); //2
		System.out.println(con1.volume());
		Constructoroverloading con3=new Constructoroverloading(10.6); //3
		System.out.println(con3.volume());
	}

}
