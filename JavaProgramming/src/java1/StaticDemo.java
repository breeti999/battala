package java1;

public class StaticDemo {

	static int a=10;  // static variable
	       int b=20; // non static variable
	
	static void m1()  // static method
	{
		System.out.println("this is static method");
	}
	
	void m2()  // non static method
	{
		System.out.println("non static");
	}
	
	void m()
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	public static void main(String[] args) {  // here given methods only printable.
		// static methods can access static stuff directly(with out object)
		System.out.println(a);
		m1();
		
		
	//  System.out.println(b); can't access because b is non-static.
	//	m2();  can't access because m2() is non-static.
		
		
		StaticDemo sta=new StaticDemo();
		System.out.println(sta.b);
		sta.m2();
		sta.m();
        }
        }
