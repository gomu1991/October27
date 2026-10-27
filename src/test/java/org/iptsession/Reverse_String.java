package org.iptsession;

public class Reverse_String {

		public static void main(String[] args) {
			
			String s = "java";
			String output= "";
			
			for(int i=s.length()-1;i>=0;i--)
				{
				char c = s.charAt(i);
				
				output= output + c;
				
				}
					
	        System.out.println(output);

		}

	}


