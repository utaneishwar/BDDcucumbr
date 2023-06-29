package constructor;

public class StudentProgram1 
{
	   // by using This keyword we can called variable inside a constructor
	    // remember this keyword use only in nonstatic area 
	
	               String name;          // default value is null because nonprimitive type       
	             int physicsmarks;
	             static String classyear;
	             
	    public  StudentProgram1 (String studentname,int phymarks) 
	    {
	    this. name	=studentname;      // initialization value from local variable to global variable

	     this.physicsmarks=phymarks;
	     } 
	    
	   public static void main(String[] args) 
	   {
	
		StudentProgram1 s = new StudentProgram1 ("Ishwar" , 50);
		System.out.println(s.name);
		System.out.println(s.physicsmarks);
		
	    }

}
