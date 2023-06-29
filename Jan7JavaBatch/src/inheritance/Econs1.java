package inheritance;

public class Econs1 extends Dcons1
 {  // concept of This and Super 
	// when we need of call inside class global variabe in nonstatic area then "THIS" use
	//when we need of call inside class global variabe from Parent class in  nonstatic area then "Super" use
	
	
	    public  Econs1(int a)
     {
		super(40);              // called from parent class (Dcons1)using super keyword
		System.out.println(" Econs1 one argument constructor");
		
		}
	

	public static void main(String[] args)
	{
		Econs1 ec = new Econs1(83);  // if we dont provide  argument then child 
		                             // child class object is not able to call the parent class constructor
		                              // because constructor dosent follow the inheritance 
              
	}

}
