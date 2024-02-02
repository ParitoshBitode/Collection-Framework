package collection_framework;

import java.util.Enumeration;
import java.util.Vector;


//Cursors are mainly used to access the elements of any collection. 
//3.Enumeration(used to iterate the elements of stack,vector)
//Enumeration cursor is used to access the elements in the forward direction only.


public class Vector_enumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Double> v1 = new Vector<Double>();
		
		v1.add(7.2);
		v1.add(5.5);
		v1.add(5.3);
		v1.add(3.5);
		v1.add(2.1);
		
		System.out.println(v1);
		
		Enumeration<Double>itr = v1.elements();
		
		while(itr.hasMoreElements())
		{
			System.out.println(itr.nextElement());
		}
		
	}

}
