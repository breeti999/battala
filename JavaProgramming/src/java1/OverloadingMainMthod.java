package java1;

public class OverloadingMainMthod {
	
	void main(int x)
	{
		System.out.println(x);
	}
	void main(String y)
	{
		System.out.println(y);
	}
	void main(String a, String b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		OverloadingMainMthod ov=new OverloadingMainMthod();
		ov.main(42);
		ov.main("sweeti");
		ov.main("sweeti", "keerthi");
    
	}

}
