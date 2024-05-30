package java35_List_IteratorCursor;


import java.util.*;

/*
 * Listing the elements in the reverse order is possible by using the List Iterator concept.
 * 
 * 
 */
public class List_Iterator_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nEverything about the Set interface");
		List s2 = new ArrayList();
		s2.add("shiva");
		s2.add("pencil");
		s2.add("Eraser");
		s2.add("book");
		s2.add("box");
	//	System.out.println(s2);
		
		ListIterator i3 = s2.listIterator();
		//drawback of List_iterator is does not traverse in the backword direction.
		
		System.out.println("Farword :\n ");
		while(i3.hasNext()) {
			
			System.out.println(i3.next());
			
		}
		
		
		
		System.out.println("\nBackword: \n");
		while(i3.hasPrevious()) { //reverse itereate
			
			System.out.println(i3.previous());  
		}
	}

}
