package java1;

public class StringvsStringBuffervsStringBuilder {

	public static void main(String[] args) {
		// String - immutable
		
	/*	String s="Welcome";
		s.concat("to java");
		System.out.println(s);  */
		
        // String Buffer - Mutable
		
		StringBuffer s= new StringBuffer("Welcome");
		s.append("to Java");  // append used to adding like a concat
		System.out.println(s);
		
		// String Buffer - Mutable
		
		
	}

}
