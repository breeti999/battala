package java1;

public class Stringreverse {

	public static void main(String[] args) {
		
		
		// Approach 1
		String s="Welcome";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)  // Welcome(0123456) index value length -1 until print i=0
		{
			rev=rev+s.charAt(i); // charat use every iteration print character and rev is used to add every values welcome
			
		}
        System.out.println(" reverse of string : "+rev);
		
		
		// Approach2 using StringBuffer
		
//		StringBuffer s= new StringBuffer("Welcome");
//		System.out.println(" reverse string is "+s.reverse());
		
		// Approach3 using StringBuilder
		
//		StringBuilder s= new StringBuilder("Welcome");
//		System.out.println("Reverse string is :"+s.reverse());
	}

}
