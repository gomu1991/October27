package org.iptsession;

public class Armstrong_Number {

	public static void main(String[] args) {
		
		int a =153;
		int b =a;
		int num = 0;
		
		//153 =1+5+3
		//1^3 + 5^3 + 3^3
		//1+125+27
		
		while(a>0)
		{
			int rem = a%10;
			
			 num = num + rem*rem*rem;
			a = a/10;
			
		}
       System.out.println(num);
       if(b ==num)
       {
    	   System.out.println("It is Armstrong Number");
       }
       else
       {
    	    System.out.println("It is not Armstrong Number");
       }
       
	}

}
