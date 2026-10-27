package org.iptsession;

import java.util.HashMap;
import java.util.Map;

public class Char_Occurance {

	public static void main(String[] args) {
	
		
	String s ="Java Selenium";
	
	s=s.toLowerCase();
	
	Map<Character,Integer> map = new HashMap<>();
	
	for(int i=0;i<s.length();i++)
	{
		char c = s.charAt(i);
		
		if(map.containsKey(c))
		{
		Integer value = map.get(c);	
		map.put(c, value+1);
		
		}
		else
		{
			map.put(c,1);
		}
	}
	System.out.println(map);
	

	}

}
