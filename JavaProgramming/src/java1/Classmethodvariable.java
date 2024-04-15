package java1;

public class Classmethodvariable {
	
	//Variables
	int empid;
	String name;
	String job;
	int sal;
	
	// Methods
	
	void display()
	{
		System.out.println(empid);
		System.out.println(name);
		System.out.println(job);
		System.out.println(sal);
	}

	public static void main(String[] args) {
		
		Classmethodvariable emp1=new Classmethodvariable(); // object creation
		emp1.empid=201;
		emp1.name="preeti";
		emp1.job="Engineer";
		emp1.sal=40000;
		emp1.display();
		
		Classmethodvariable emp2=new Classmethodvariable();
		emp2.empid=204;
		emp2.name="keerthi";
		emp2.job="Trainee software engineer";
		emp2.sal=30000;
		emp2.display();
		
		
		
	}

}
