package org.iptsession;

public class EachWord_Reverse {
	
  public static void main(String[] args) {
	
	  String s = "I Love India";
	  
	  String rev= " ";
	  
	  String[] sp =s.split(" ");
	  
	  for(int i=0;i<sp.length;i++)
	  {
		  String a=sp[i];
		  String output = " ";
		  
		  for(int j=a.length()-1;j>=0;j--)
		  {
			  char c = a.charAt(j);
			  output = output + c;
			  
		  }
		  rev = rev + output + "";
		  
	  }
	  System.out.println(rev.trim());
}

}
