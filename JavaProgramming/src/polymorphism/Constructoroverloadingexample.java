package polymorphism;

   class cosio{
	   int num1;
	   int num2;
	   String operation;
   public cosio(){
	   num1=0;
	   num2=0;
	   operation="Nothing";
   }
   public cosio(int i){
	   num1=i;
	   num2=0;
	   operation="Nothing";
   }
   public cosio(int i, int j){
	   num1=i;
	   num2=j;
	   operation="Nothing";
   }
   public cosio(int i,int j,String op){
	   num1=0;
	   num2=0;
	   operation="Nothing";
   }
   }
public class Constructoroverloadingexample {
	public static void main(String args[])
	{
	cosio obj= new cosio();
	System.out.println(obj);
	}
}


