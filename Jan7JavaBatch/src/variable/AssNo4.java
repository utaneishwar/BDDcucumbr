package variable;

public class AssNo4
{
//ASS no 4 :-WAP To calculate the area of land using only Non_static variable.
// syntax :- data_type variabl_name = value ;
	
	int height = 15 ;
	int width = 20;
	int area = height* width;
	//-------------------------
	
	double h = 25.60;
	double w = 12.40;
	double a = h*w;
	
	//---------------------
	
	
	
	public static void main(String[] args) 
	{
		// here create object 
		// syntax :-class_name ref_variablename = new Class_name();
		
             AssNo4 ish = new AssNo4();
             
          System.out.println(ish.area);  // calling area nonstatic variable_name  
            System.out.println(ish.a);    //calling a nonstatic variable_name 

	}

}
