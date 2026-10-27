package org.iptsession;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicate {
       public static void main(String[] args) {
		
    	   String s=  "java selenium";
    	   
    	   //jav selnium
    	   
    	   //set-----------to remove duplicate
    	   
    	   Set<Character> set= new LinkedHashSet<>();
    	   
    	   for(int i=0;i<s.length();i++)
    	   {
    		   char c = s.charAt(i);
    		   set.add(c);
    		   
    	   }
    	   
    	   System.out.println(set);
    		
	}
}
