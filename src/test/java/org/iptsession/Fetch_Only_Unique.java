package org.iptsession;

public class Fetch_Only_Unique {

	public static void main(String[] args) {
		
		String s = "java selenium";
		
		//jv slnium
		
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
		   
			
			if(s.indexOf(c) == s.lastIndexOf(c))
			{
				System.out.println(c);
			}
		}

	}

}
