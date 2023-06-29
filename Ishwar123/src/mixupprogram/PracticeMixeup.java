package mixupprogram;

public class PracticeMixeup 
{
	// WAP MPSC cut off is 55.08 my statement is true thank you.
	//using from byte to static variable 
//---------------------------------
              // here use of static and non static method
                      public static void ishwar()
                    {
	                 //static method
	                   byte eng = 55;
	                   short mar = 70;
	                   int hindi = 40;
	                    long math = 50;
	                    float scie = 40.30f;
	                   double geo = 47.17;
	                   double i=((eng+mar+hindi+math+scie+geo)/600*100);
	             char percentage='i';
	             boolean vim = true;
	             String s =" The percentage of 10th class is ";// use of all datatype like primitive and non primitve 
	  System.out.println(s+i);
	  
	  
  }
  //----------------------------------------------------
  // nonstatic method
   public void kishor()
  {
	  String s = " my statement is ";
	boolean w = true;
	System.out.println(s+w);
	  System.out.println();
	  }
   // static variable 
   static String s1= "thank you";
   
   
//----------------------------------------------------------
	public static void main(String[] args)
	{
		// execution part mean calling static, non static method ,static variable inside a class only
		//call static method
		ishwar();
		//calling to non static method  using object 
		PracticeMixeup xyz = new PracticeMixeup();
		xyz.kishor();
		// call to static variable
	System.out.println(PracticeMixeup.s1);
				
      
      
      
		
		
		
	}

}
