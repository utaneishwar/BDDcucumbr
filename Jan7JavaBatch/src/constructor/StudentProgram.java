package constructor;

public class StudentProgram
{
	 String name;                  // non static 
	 int physicsmarks ;            // nonstatic variable because it has class level
	static String classyear;      // static variable
	 
	
	public StudentProgram (String studentname ,  int phymarks )
  {
	 name = studentname;         // we can use ( this ) keyword for calling 
	 physicsmarks = phymarks;    // when if required 
      }
	
	
 public static void main(String[] args)
 {
      classyear = " first year";
      
    StudentProgram s1 = new StudentProgram( " Cesar", 50); // we can create  multiple object using different data different 
    
    StudentProgram s2 = new StudentProgram( "Diana", 90);
    
    System.out.println( s2.physicsmarks);  // here we called only physics marks
	                                         // o/p-90
}
 
	
	
	
}
