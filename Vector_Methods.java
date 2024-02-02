package collection_framework;

import java.util.Vector;

public class Vector_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Vector<Character> v1= new Vector<Character>();
		   
	     v1.add('a'); //0  
	     v1.add('p'); //1
	     v1.add('p'); //2
	     v1.add('l'); //3
	     v1.add('e');
	   
	     for(Character ch    : v1)
	     {
	    	 System.out.println(ch);
	     }
	   
//----------------------------------------------------------------------------------------------
	   
/*	   System.out.println("before trimToSize() capacity = "+v1.capacity()); //10
	   System.out.println("size = "+v1.size()); //5

	  //----------------------------------------------------------------------------
	   
      v1.trimToSize();  //is used to trim the capacity of the vector by its size    
      System.out.println("after trimToSize() capacity = "+v1.capacity()); //5
      System.out.println("size = "+v1.size()); */
	   
	 //----------------------------------------------------------------------------
	   
	   
	   /* Collections.sort(v1);
	   System.out.println("asc v1 = "+v1);
	   Collections.sort(v1,Collections.reverseOrder());
	   System.out.println("desc v1 = "+v1);  */
	   
	  //--------------------------------------------------------------------------- 
	   
/*	  System.out.println("size = "+v1.size());  //5
	  v1.setSize(10);   // setSize() is used to change the size  of a vectors
	   System.out.println("after set size the new size is = "+v1.size()); //10
	   System.out.println(v1);  */
	   
	   //--------------------------------------------------------------------------
	     
/*    v1.insertElementAt('H',3);
	    System.out.println(v1); */
	   
	  //---------------------------------------------------------------------------
	     

/*		   System.out.println(v1.firstElement()); //Returns the first component (the item at index 0) ofthis vector.
	   System.out.println(v1); 
	   
	   System.out.println(v1.lastElement()); //Returns the last component (the item at index 0) ofthis vector.
	   System.out.println(v1); */ 
	   
	   //-----------------------------------------------------------------------------
	   
	//   System.out.println(v1.elementAt(3));  //l //here,elementAt(3) finds out the element present on 3rd index

	   
/*	   Character a[]= new Character[5];
	   v1.copyInto(a);  //copies the elements of a vector into an array
	  
	    for(Character  ch   : a)
	    {
	    	System.out.println(ch);
	    } */
	    
	  //-------------------------------------------------------------------------------
	     
	     
	/*   v1.addElement('z');
	   System.out.println(v1); */
	   
	 //---------------------------------------------------------------------------------
	     
	 /*  System.out.println("default capacity ="+v1.capacity()); //10
	    v1.ensureCapacity(50);
	   System.out.println("after ensure capacity,new capacity is ="+v1.capacity()); */
		
	}

}
