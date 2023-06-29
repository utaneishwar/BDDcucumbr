package stringclass;

public class CastingConceptDownChild2  extends CastingConceptParent
{
	
	
	

	public static void main(String[] args) 
	{
                   ///  Concept of DownCasting 
		 
	      CastingConceptDownChild2 c =new CastingConceptDownChild2 (); 
	      CastingConceptParent p = (CastingConceptParent)c;
	      CastingConceptDownChild2 c1 = ( CastingConceptDownChild2)p;
	               
	                  c1.m1();
	                   c1.m2();
	                   c1.m();
	}

}
