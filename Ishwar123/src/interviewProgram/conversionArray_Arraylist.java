package interviewProgram;

import java.util.ArrayList;
import java.util.Arrays;

public class conversionArray_Arraylist {

	public static void main(String[] args)
	{
		Integer []a=new Integer[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		ArrayList<Integer> ref =new ArrayList<Integer>(Arrays.asList(a));
		System.out.println(ref);
		
	}

}
