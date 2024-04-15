package polymorphism;

 class casio {
	public void add(int i,int j)
	{
		System.out.println(i+j);
	}
	public void add(int i,int j,int k)
	{
		System.out.println(i+j+k);
	}
 }
	
	public class Methodoverloading{
		public static void main(String args[])
		{
			casio obj= new casio();
			obj.add(3,4);
			obj.add(4,5,6);
		}
	    }

