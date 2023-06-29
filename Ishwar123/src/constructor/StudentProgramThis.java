package constructor;

public class StudentProgramThis
  {
	String name;
	int pcm;
	static String classyear;  // static taken because we have not change value 
	                             // from object to object
	
	public StudentProgramThis( String studentname, int physicsmarks) 
	{
	 this.name =  studentname;     // we can call without using this keyword
	 this.pcm= physicsmarks;
	System.out.println(" kishor ");	   // because printed there 
		
	}
	 public static void main(String[] args)
	{
		StudentProgramThis s = new StudentProgramThis("Ishwar",120);
		System.out.println(s.name);
		
		//  O/P-  kishor 
		//           Ishwar
	}

}
