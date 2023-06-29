package stringclass;

public class CastingConceptChild extends CastingConceptParent 
{
	//Non-primitive casting
			// 1)upcasting: conversion from parent class to child class
			// 2) DownCasting: conversion From child to parent class
			
		//1)
	
	public void m3() 
	{
		System.out.println("m3 method from child class");
	}
	
	  public void m()
	   	{
	   		System.out.println(" m method from child class ");
	   	}
	   	
	
	
    public static void main(String[] args)
	{
    	
    	//1)Upcasting 
    	CastingConceptChild c = new CastingConceptChild();         // child class object
    	
    	CastingConceptParent p	=(CastingConceptParent )c;   // conversion child into object means up casting
		
		   p.m();
	       p.m1();
	       p.m2();   // this are method from parent class we can access here 
	    //   p.m3();   we cannot call this method from child class because we cannot call on ref ver. of parent class

	  
	}

}
