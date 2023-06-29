package collectionpractice;

import java.util.ArrayList;

public class ListClasses {

	public static void main(String[] args)
	{
	   
		
		// collection Framework or Collection interface : collection is an interface inside java.until package 
		                                                  // it has multiple child interfaces and those also have multiple implements class 
          //Collection : it is an entity in Which Group of data types(objects)is represent as single entity.
	
		ArrayList al = new ArrayList();
			            al.add("pune");
		                al.add(false);
		                al.add(80);
		                al.add('c');
                        System.out.println(al);		//[pune, false, 80, c]
	//===============================================================	
	// ArraList : it is class implement to List interface 	
                            ArrayList<String> al1= new ArrayList<String>();
                                al1.add("pune");
                                 al1.add("mumbai");
                                  al1.add("madras");
                                  al1.add("delhi");
                                   al1.add("kolkata");
                           System.out.println(al1);  //[pune, mumbai, madras, delhi, kolkata]
     
    // remove(0):this method is used to remove the value from the Array list 
                              al1.remove(0);
                               System.out.println(al1);                        //[ mumbai, madras, delhi, kolkata]
              
     //set(): it is used to update a certain value inside the array list 
                            al1.set(2, "gurgaon");
                            System.out.println(al1);                       //[mumbai, madras, gurgaon, kolkata]
     
                               ArrayList<String> al2= new ArrayList<String>();
                               al2.add("sangali");
                               al2.add("Baramati");
                               al2.add("satara");
   
//addAll(): this method is used to add one collection inside another collection means Copy the value
                        al2.addAll(al1);           
                        System.out.println(al2);                    //[sangali, Baramati, satara, mumbai, madras, gurgaon, kolkata]
     
     
                           ArrayList< String> al3= new ArrayList<String>(); 
                          al3.add("Anand");
                          al3.add("Ahmedabad");
                          al3.add("Rajkot");
                               al3.addAll(al2);
                           System.out.println(al3);                           //[Anand, Ahmedabad, Rajkot, sangali, Baramati, satara, mumbai, madras, gurgaon, kolkata]
   
   
   //removeAll() : this method is used to remove cllection from another collection 
                      al3.removeAll(al1);
                      System.out.println(al3);                  //[Anand, Ahmedabad, Rajkot, sangali, Baramati, satara]
   
   //retainAll(): this method is used to retain specific collection from another collection and remove all the collection 
                      al3.retainAll(al2);
                      System.out.println(al3);                       //[sangali, Baramati, satara]

  // contains(): this method is used to check the specific element inside ArrayList present or not
                   boolean ispresent = al3.contains("sangali");
                   System.out.println(ispresent);                //true
  // Duplicate:		
	                 al3.add("satara")	;        //  we can add the duplicate value inside Arraylist 
	                 System.out.println(al3);	  //[sangali, Baramati, satara, satrara]
   //NULL:	
	                    al3.add(null);               // we can add the null value inside ArrayList	
	                   al3.add(null);	                  //   we can also add Duplicate null value 
	                     System.out.println(al3);          // add two times null 
 // SIZE:	
		                   int lengthofal3 = al3.size(); 
		                    System.out.println(lengthofal3);       // get total count of size:6
 // Add Another ELEMENT:		
		                   al3.add(3, "Chandrapur");                 // we can add the element (skipping existing element) by providing index position 
		                  System.out.println(al3);            // add chandrapur    
 // get(index):		
		           String elementvalue = al3.get(2);         // this method will return specific element value based on the index position provided
		    System.out.println(elementvalue);            //satara
	} 

}
