package strring_1_practice;

public class RemoveDuplicateFromStringArray 
{

	public static void main(String[] args) 
	{
		String []s= {"pune", "mumbai","patna","pune","delhi","mumbai"};
    
		
		String []n = new String[4];
		    int h=0;
		
		for(int i=0; i<s.length; i++)
		{
			for(int j=i+1; j<s.length; j++)
			{
				if(!(s[i].contains(s[j])))
				{
					 n[h]= s[i];
					   h++; 
				}
				
		    }
	   }
		
		for(String d:n)
		{
			System.out.println(d);
		}
     }
	}




