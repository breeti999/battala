package java1;

import java.util.Arrays;

public class Stringmethods {

	public static void main(String[] args) {
		
		String s="welcome";
		System.out.println(s.length());
		//s.length();
		String s1="Welcometo";
		String s2="Andhra";
		System.out.println(s1+s2); // or  system.out.println(s1.concat(s2).concat(s3)); or system.out.println(s1.concat(s2+s3);
		
		String ss="   congratulation   ";
		System.out.println(ss);
		System.out.println(ss.trim()); // trim is used to remove extra spaces
		System.out.println(ss.trim().length());
		
		System.out.println(s.charAt(3)); //print partical character index values start with 0
		System.out.println(s.contains("wel"));  //true
		System.out.println(s.contains("come")); //true
		System.out.println(s.contains("COME")); // false because come in small letters
		System.out.println(s.contains("welme")); // false beacuse not there complete sequence
		
		String sw="sweeti";
		String sw1="sweeti";
		System.out.println(sw==sw1); // both are equal that's why true
		System.out.println(sw.equals(sw1)); // both are equal that's why true
		System.out.println(s.equals("Welcome")); // false because of capital W
		System.out.println(s.equalsIgnoreCase("Welcome")); // true capital W only, it ignores the capital and small
		
		// replace - replace single /multiple( sequence )of characters in a string
		
		
		s=" Welcome to Andhra Pradesh";
		System.out.println(s.replace('a','z')); // replace single character
		
		// substring - extract substring from the main string
		System.out.println(s.replace("Andhra","Telugu")); // replace multiple characters
		 s= "Selenium";
		 System.out.println(s.substring(1, 5));  //here a is above number and 5 is the below number ans is elen
		
		 //01234567
		 //selenium
		 //12345678
		 
		 // Uppercase() Lowercase()
		 
		 System.out.println(s.substring(0, 3)); // ans sel
		 System.out.println(s.toUpperCase());
		 System.out.println(s.toLowerCase());
		 
		 //split - split the string into multiple parts based on the delimeter( . and space )
		 
		 s="abc@gmail.com";
		 String a[]=s.split("@"); // here splitting @ before and after
		 System.out.println(a[0]);  // abc
		 System.out.println(a[1]);  // gmail.com
		 System.out.println(Arrays.toString(a));
         
		 String name="Learn java";
		 System.out.println(name.replace('L','l').contains("learn")); //true
		 System.out.println(name.toLowerCase().contains("learn"));  //true
	}

}
