package collection_framework;

import java.util.*;

public class Array_List_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList l1 = new ArrayList();
		 
		l1.add(1);       //array list storing different types of elements
		l1.add(2.1);
		l1.add('c');
		l1.add("paritosh");
		
		System.out.println("My array list is = "+l1);
		
			
			/*
			//1.add(int index ,String element)
			
				l1.add(	3		,	"Nasrin");
				System.out.println(l1);		// add 100 on the 3rd index
			
		*/
			
	//----------------------------------------------------------------------------	
		
		/*
			//2.clear
			
			l1.clear();
			System.out.println(l1);
		
		*/
		
	//----------------------------------------------------------------------------
			
		/*
		 	
		 	//3.contain    check the perticular value is present or not
			
			System.out.println(l1.contains(66));	//true bz 66 is present
			 	
		*/
	
	//-----------------------------------------------------------------------------
		
		/*	
			  
			 //4. equals()
			  
				ArrayList<Integer> l2 = new ArrayList<Integer>();
			
			l2.add(66);		//0
			l2.add(6);		//1
			l2.add(56);		//2
			l2.add(15);		//4
			l2.add(16);		//5
			
			System.out.println(l1);
			System.out.println(l1.equals(l2));		//true bz both l1 and l2 are same / equal
			
		*/
			
	//--------------------------------------------------------------------------------------
			
		/*
				
			//5. get (int index)
			
			System.out.println(l1.get(4));		//return and elemnet on 4th index
				
			
		*/
			
	//--------------------------------------------------------------------------------------
			
		/*
		 
		 	//6.indexOf()
			//7.lastIndexof()
			
			System.out.println(l1.indexOf(16));		// return an index of first given object
			System.out.println(l1.lastIndexOf(16));	//	return an index of last given object
		 
		 */
			
	//----------------------------------------------------------------------------------------	
		/*	
		 
			//8.isEmpty()
			System.out.println(l1.isEmpty());//false
		
		*/
			
	//----------------------------------------------------------------------------------------
			
		/*
		 	
		 	//9.remove(int index)
		 	 
		 	 l1.remove(3);				//remove an object present on given index position
		 	 System.out.println(l1);
		 
		 */	
		 
	//---------------------------------------------------------------------------------------
			
		/*	
			//10. set(int index , Interfer elemnt)
			
			l1.set(3,100);			// replace 100 on 3rd index position
			System.out.println(l1);
		 */
			
	//----------------------------------------------------------------------------------------
		
		/*	
			
			// 11. list to array conversion
			
			Object a[] = new Object[l1.size()];
			a = l1.toArray();						// toArray() used to perform list to array conversion
			
			for(int i=0; i<a.length;i++)
			{
				System.out.println(a[i]);
			}
			
		*/	
			
	//-----------------------------------------------------------------------------------------
		
		/*		
			
			//12. subList(int fromIndex , int toIndex)
			
			//return an object from index 1 to 3(4-1)
			System.out.println(l1.subList(1, 4));
			
		*/
	
	}

}
