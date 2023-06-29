package variable;

public class Collage 
{
// Assignment no 05
	// WAP to store  the data of college students
	// in terms of student name,physics marks,math marks and class name 
	
	static String classyear =" ";
	String name = " ";
	int physicsmarks = 0;
	int mathmarks = 0;
	
	
	public static void main(String[] args) 
	{
		Collage s1 = new Collage();
		classyear = "1st year";
		s1.name = "Ishwar";
		s1.physicsmarks = 50;
		s1.mathmarks = 60;
		
		Collage s2 = new Collage();
		classyear = "2nd year";
		s2.name = "vivek";
		s2.physicsmarks = 45;
		s2.mathmarks = 50;
		 
		Collage s3 = new Collage();
		classyear = "3rd year";
	    s3.name = "Ganesh";
		s3.physicsmarks = 50;
		s3.mathmarks = 60;
		
		
		
		System.out.println(classyear+" "+s1.name +":"+ s1.physicsmarks+":"+s1.mathmarks);
		
		System.out.println(classyear+" "+s2.name +":"+ s2.physicsmarks+":"+s2.mathmarks);
		System.out.println(classyear+" "+s3.name +":"+ s3.physicsmarks+":"+s3.mathmarks);
		System.out.println("                  ");
		System.out.println(classyear);
		System.out.println("Srno"+" "+s1.name+"  "+s2.name+"  "+s3.name);
		System.out.println(" 1"+"    "+s1.physicsmarks+"        "+s2.physicsmarks+"      "+s3.physicsmarks);
		System.out.println(" 2"+"    "+s1.mathmarks+"        "+s2.mathmarks+"      "+s3.mathmarks  );
		char ch = 97;
		char ch1 = 0xface;
		char ch2=1970;
		char ch3 = '\u0061';
	System.out.println(ch);
System.out.println(ch2);
char ch4= '\\';
System.out.println("this is \' symbol");

System.out.println("this is \\ symbol");
System.out.println("this is \r symbol");
System.out.println("c.\\durga.core soft ");}

}
