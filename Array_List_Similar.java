package collection_framework;

import java.util.ArrayList;

public class Array_List_Similar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> l1 = new ArrayList<String>();    //Generic Class => generally ArrayList can holds diff types of elements but if you want to store similat kind of element then you can use genercis
		 
	    l1.add("Gajanan");
		l1.add("Gokul");
		l1.add("Ayush");
		l1.add("Mahesh");
		l1.add("Pooja");
		l1.add("");
		
		System.out.println("After add method My array list is = "+l1);
	
		
		
	/*---------------------------------------------------------------------------
	 
	 
		  ArrayList<Integer> l1 = new ArrayList<Integer>();
		  
		  l1.add(66); //0 l1.add(6); //1 l1.add(56); //2 l1.add(15); //3 l1.add(16);
		  //4 //l1.add(16);
		  
		  System.out.println(l1); //for each loop for traversing and printing
		  collection
		*/
		
	/*---------------------------------------------------------------------
				//1.add(int index ,Integer element)
				
					l1.add(	3		,	100);
					System.out.println(l1);		// add 100 on the 3rd index
				
			*/
		
	}

}
