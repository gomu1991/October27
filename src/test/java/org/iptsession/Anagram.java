package org.iptsession;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	
		String s1= "silent";
		
		String s2= "listen";
		
		char[] ch1 = s1.toCharArray();
		
		System.out.println(Arrays.toString(ch1));
		
		char[] ch2 = s2.toCharArray();
 
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean istrue = Arrays.equals(ch1,ch2);
	 
		if( s1.length() ==s2.length()) {
		
			if(istrue)
		{
			System.out.println("It is Anagram");
		}
		else 
		{
			System.out.println("It is not anagram");
		}
	}
		else
		{
			System.out.println("It is not anagram");
			
		}
	
	}
}
