package collection_framework;

import java.util.ArrayList;

public class Array_List_using_ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> l1 = new ArrayList<Integer>();
		
		l1.add(66);
		l1.add(6);
		l1.add(56);
		l1.add(15);
		l1.add(16);
		
		
		System.out.println(l1);
		//for each loop for traversing and printing collection
		
		System.out.println("even no from l1 = ");
		
		//collection = for even
		
		for(Integer n: l1)
		{
			if (n % 2 == 0) 
			{
                System.out.println(n); // Print the even number
            }
			
		}
		
	}

}
