package collection_framework;

import java.util.LinkedList;

public class Lisk_List_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List l1 = new LinkedList();
		
				LinkedList<String> ct = new LinkedList<String>();
				
				ct.add("Pune");			//0
				ct.add("Akola");		//1
				ct.add("Nashik");		//2
				ct.add("Mumbai");		//3
				ct.add("Nagpur");		//4
				//ct.add("Akola");

				System.out.println(ct);
			
				
//-------------------------------------------------------------------------
			
				
				
				//1. addFirst()
				//2. addLast()
//				
//				ct.addFirst("Bang");
//				ct.addLast("Hy");
//				System.out.println(ct);
//				
			
				
//-------------------------------------------------------------------------
				
				
			//3. element()
				
				//System.out.println(ct.element());		// retrives but does not remove,the head (first element) of this list.
				//System.out.println(ct);
				
			//4	peekFirst()
				
				//System.out.println(ct.peekFirst());		// retrives but does not remove,the head (first element) of this list.
				//System.out.println(ct);
				
			//5. poll()
				
				//System.out.println(ct.poll());		// retrives and remove,the head (first element) of this list.
				//System.out.println(ct);
				
			//6	peekLast()
				
				//System.out.println(ct.peekLast());		// retrives but does not remove,the head (last element) of this list.
				//System.out.println(ct);	
				
		//------------------------------------------------------------------------------------------
				
			//7. getFirst();
			//8. getLast();
				
			//	System.out.println(ct.getFirst());
			//	System.out.println(ct.getLast());
				
//-------------------------------------------------------------
				
			//9. offerFirst()
				
				//ct.offerFirst("Amravati");	//Insert the special elenmt at the first
				//System.out.println(ct);
				
			//10. offerLast()
				
				//ct.offerLast("Amravati");	//Insert the special elenmt at the end of the list
				//System.out.println(ct);	
				
//--------------------------------------------------------------		
				
			//11. remove();
			//12. removeFirstOccurrence
			//13. removeLastOccurrence
				
				//ct.remove("Akola");
				//or
				//ct.removeFirstOccurrence("Akola");	//remove first occurence of given object
				
				//ct.removeLastOccurrence("Akola");
				
				//System.out.println(ct);
				
		
	}

}
