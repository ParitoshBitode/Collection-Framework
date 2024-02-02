package collection_framework;

import java.util.Stack;

public class Stack_LIFO_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //  List s1 =new Stack(); OR
		
		Stack<Double> s1= new Stack<Double>(); //Last In First Out
		
		s1.push(45.6); //5//push inserts the elements into the stack
		s1.push(15.6); //4
		s1.push(61.9);//3
		s1.push(2.3);//2
		s1.push(12.0);//1
		
		System.out.println(s1);
	
		/*System.out.println(s1.pop());   //pop access and removes the elements from the stack, and removes the element which is present at top of the stack i.e 12.0 in this case
		                                //because stack follows the principle of Last In First Out
		System.out.println(s1); */
		
	/*  System.out.println(s1.peek());    //12.0            //peek access but does NOT removes the elements from the top of the stack
		System.out.println(s1);  */
		
		//System.out.println(s1.search(2.3));   //2..//because 2.3 is present on 2nd position from the top of stack
						
	}

}
