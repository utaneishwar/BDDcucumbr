package stringclass;

public class SumOfNumberInsideString {

	public static void main(String[] args)
	{
	
		 String s="Hello12Good23Morning4sir";
		 
	    String num ="";
		int add=0;
	    
	    boolean  flag=false;
	    
		 for(int i=0; i<s.length(); i++)
		 {
			if(Character.isDigit(s.charAt(i))) 
                {
				flag=true;
				
				  
				num=num+s.charAt(i);
				if(i!=s.length()-1)
				{
				   continue;     
				}
				}
			if(flag)
			{
				int value = Integer.parseInt(num);
				add =add+value;
				flag=false;
				  num ="";
			}
			
			 
		 }
		 System.out.println(add);
		 
		 
		 
		 
	}

}
