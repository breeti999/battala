package java1;

import java.util.Arrays;

public class ImmutablevsMutablestring {

	public static void main(String[] args) {
		
		//Mutable - can change
		int a[]= {2,5,3,9,6,1};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		//Immutable - Can't change
		
		String s= new String("Automation");
		System.out.println(s);
		String concatString = s.concat("to selenium");
		System.out.println(s);  // Immutable - can't change
		System.out.println(concatString);
		

	}

}
