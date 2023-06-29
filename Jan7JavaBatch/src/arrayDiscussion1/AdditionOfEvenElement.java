package arrayDiscussion1;

public class AdditionOfEvenElement {

	public static void main(String[] args)
	{
	
	   int [] a= {8,16,23,8,8};
	    int AddEvenElement =0;
	   
	   for(int i=0; i<a.length; i++)
	   {
		   if(a[i]%2==0)
{
		   AddEvenElement= AddEvenElement+a[i];
	   }
	   }
	   System.out.println(AddEvenElement);
		
		

	}

}
