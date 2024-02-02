package collection_framework;

//ArrayList(non syn/multithreaded)
//Vector(Synchronized) and HashTale

//vector is the implementation class of List interface 
//Vector is same as ArrayList, means like ArrayList it also uses dynamic array to store its elements
//the only difference between both is, ArrayList is non-synchronized whereas Vector is Synchronized

import java.util.*;

public class Vector_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Double> v1 = new Vector<Double>();
		
		v1.add(6.6);		//0
		v1.add(1.6);		//1
		v1.add(5.6);		//2
		v1.add(1.5);		//3
		v1.add(3.6);		//4

		System.out.println(v1);
		
		System.out.println("default capacity of vector is = "+v1.capacity());
		
		v1.add(4.06);		//5
		v1.add(8.6);		//6
		v1.add(12.6);		//7
		v1.add(15.5);		//8
		v1.add(32.6);		//9
		
		System.out.println("After adding 10 elemnt ,capacity of vector is = "+v1.capacity());
		v1.add(8.9);
		
		System.out.println("After adding 11th element ,capacity of vector is ="+v1.capacity());
		
	}

}
