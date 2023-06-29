package strring_1_practice;

public class SumNumberInsideString {

	public static void main(String[] args)
	{
	  String s ="Good45Morninng5dndn10";
	  boolean flag = false;
	 String num="";
	  int value=0;
	  for(int i=0; i<s.length(); i++)
	  {
		      if(Character.isDigit(s.charAt(i)))
		      {
		    	 flag =true;
		    	
		    	  num=num+s.charAt(i);
		     if(i!=s.length()-1)
		      {
		       continue;    
		      }
		      }
		       if(flag)
		       {
		    	int add=Integer.parseInt(num) ;
		    	value=value+add;
		    	  flag=false;
		    	  num="";
		      }
		      }
	      System.out.println(value);

	}}
