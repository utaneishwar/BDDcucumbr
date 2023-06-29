package inheritance;

public class Econs extends Dcons
{  // this class is child class so we can access 
	 //here Dcons because Extends given (mean inheritance ) 
	
	
	public Econs(int a) 
	{
	   super (40);      // here we have to give here Argument because
		                      // in parent class give constructor With one  argument 
		System.out.println(" zero argument constructor ");
		
	}

	public static void main(String[] args)
	{
		// we have to  create object compualsorily 
		
		Econs ec = new Econs(20);  
		// In a constructor child class called by default execute to parent
		 // class constructor so that why firstly Execute Parent class constructor 
		
		
	}

}
