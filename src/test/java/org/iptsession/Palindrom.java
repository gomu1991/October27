package org.iptsession;

public class Palindrom {

	public static void main(String[] args) {
//		String s = "madam";
//		
//		String rev = "";
//		
//        for(int i=s.length()-1;i>=0;i--)
//        {
//        	char c = s.charAt(i);
//        	rev =rev+c;
//        	
//        }
//        if(s.equals(rev))
//        {
//        	System.out.println("It is palindrom");
//        }
//        else
//        {
//        System.out.println("It is not palindrom");
//        }
		
		int a =12321;
		
		int num = 0;
		
		while(a>0)
		{
			int rem =a%10;
			
			num = num*10 +rem;
			
			a=a/10;
		}
		System.out.println(num);
	}

}
