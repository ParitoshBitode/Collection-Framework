package collection_framework;

import java.util.*;

public class Stack_LIFO_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> animals= new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Initial Stack: " + animals);

        // Remove element stacks
        String element = animals.pop();
        System.out.println("Removed Element: " + element);
		
        //Stack elements
        System.out.println("Now Stack: " + animals);
        animals.push("Cat");
        System.out.println("Now Stack: " + animals);
        
	}

}
