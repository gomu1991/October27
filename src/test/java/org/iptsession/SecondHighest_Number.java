package org.iptsession;

public class SecondHighest_Number {

	public static void main(String[] args) {
		
		int [] a= {10,7,4,3,1,8,24,30,19};
		
		//30
		//24
		
		//Bubble sort method
		
		for(int i=0;i<a.length-1;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
       for (int b : a)
       {
		System.out.println(b);
	}
       int highest = a[ a.length-1];
       int secondhighest= a [a.length-2];
       System.out.println("Second Highest:" + secondhighest);
	}

}
