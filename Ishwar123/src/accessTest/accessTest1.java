package accessTest;

import accessmodifier.Test;  // public class can access any package 
import accessmodifier.Test3;
import accessmodifier.Test4Methodlevel;
 import accessmodifier.Test4Methodlevel;
public class accessTest1 
{
             public static void main(String[] args)
             {
            	 
                 Test t = new Test();            // public class from another package 
//                Test2 t1 = new Test2();       // default class 
                  Test3 t3 = new Test3();       // final class 
//----------------------------------------------------------------------------------------------
                   //METHODLEVEL ACCESSMODIFIER    
               //     1) PUBLIC
                  Test4Methodlevel t4 = new  Test4Methodlevel();
                        t4.M1();
                        
                      //   2)DEFAULT
                     //       t4.M2(); 
                           
                      // 3) PRIVATE 
                         
                     //      t4.M3();
                        
                        
                        
                        
                        
                        
			}
}