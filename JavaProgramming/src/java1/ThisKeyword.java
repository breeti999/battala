package java1;

public class ThisKeyword {

	int x,y; // class variables
	
	 /*ThisKeyword(int a,int b)
	{
		x=a;  //  line 7 to 9 This is a constructor. a and b are local variables with in the method we can access the variables
		y=b;
	}  
	*/    
	void setData(int x, int y)
	{
		this.x=x; // line  13 to 17 method.
		this.y=y;
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
		
	}

	

	public static void main(String[] args) {
		 // ThisKeyword th=new ThisKeyword(10,20); // this is for constructor
		ThisKeyword th=new ThisKeyword();
		th.setData(10, 20);
		th.display();
		
	}

}
