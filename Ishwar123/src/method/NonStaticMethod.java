package method;

public class NonStaticMethod {
// nonstaticmethod 
	// syntax of nonstatic method is
	// accesmodifier returntyper name_of_merthiod
	
	public void area()

{
      int 	height = 150;
      int bottom = 100;
      int depth = height*bottom;
      System.out.println(depth);
		
         double weight= 65.23;	
         System.out.println(weight);
         
		}
	public void aditya() 
	{
	String payal ="my name is Aditya";
	String 	id = "1405";
    String idno = payal+id;
		System.out.println(idno);
		
	}
	public static void main(String[] args) 
	{
		// create object 
		//syntax of object is classname variable = new classname
		NonStaticMethod adi = new NonStaticMethod();
		
		// next stage is call for non static method 
		// variablename.non-static methodname
		
		adi.area();
		
		adi.aditya();
//---------------------------------------------------------------------------------------------------------------		
	// for practice	// here call from nonstatic class to static class //by using sntax
		 
		StaticMethod.area();
		
		StaticMethod.ram();
		
	//use syntax-classname variablename = new classname
		// use variablenam.methodname ();
		StaticMethod ish = new StaticMethod();
	    ish.ram();
		
	}
	
	
	
	

}
