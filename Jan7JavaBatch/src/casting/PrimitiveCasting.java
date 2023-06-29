package casting;

public class PrimitiveCasting 
{

	public static void main(String[] args)
	{  
		// CASTING: converting one datatype into another datatype 
		// remember while converting we can convert only same Datatype like byte-int 
		// Basically there are two types of casting 
		// 1) PRIMITIVE CASTING 2) NONPRIMITIVE CASTING
		
		// PRMITIVE CASTING : 
		// there are two type 1) IMPLICIT 2) EXPLICIT 
		
		
		// 1) IMPLICIT CASTING : To convert smaller dataype to bigger datatype.
		   //syntax
		// datatype variablename = (datatype)variable_to convert;
		
		//1)
		   byte b = 80;
		   int b1 = (int)b;
		   System.out.println(b1);           // 80------int
		
		//2)
		   int c = 121;
		   long c1 = (long)c;
		   System.out.println(c1);           // 121------long
		   
		//3)   
		   float d = 50.23f;
		   double d1 = (double)d;
		   
		   System.out.println(d1);           // 50.23--------double 
		
	//note: we cannot conver from higher to lower datatype // data cannot be loss
		   
//---------------------------------------------------------------		   
	//2) EXPLICIT CASTING: conversion from higher datatype to lower datatype
		   int f= 100;
		   byte f1 = (byte) f;
		   System.out.println(f1);     //100  
		   
		     int e= 129;
		   byte e1 = (byte) e;
		   System.out.println(e1);     ///-127  // the range of byte is -127 and 127
		   
		   
	// note: in this datat can be loss 	   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		

	}

}
