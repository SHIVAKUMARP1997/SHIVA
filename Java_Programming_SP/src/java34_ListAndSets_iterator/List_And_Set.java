package java34_ListAndSets_iterator;
import java.util.*;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;


/*
 * 1.List
 *   
 *   list is an index based Data Structure.
 *   list can store duplicate elements.
 *   list can store any number of null values.
 *   List follows the insertion order.
 * 
 * 2.Set.
 * 	 set is not an index based Data Structure it stores the data according to hashcode values.
 * 	 set does not allow to stores duplicate elements.
 * 	 set can store only one null value in IT.
 * 	 set does not follow the insertion order.
 * 
 */
public class List_And_Set {

	public static void main(String[] args) {
		
			System.out.println("Everything about the List interface");
			List l1 = new ArrayList();
			l1.add("shiva");
			l1.add("pencil");
			l1.add("Eraser");
			l1.add("book");
			l1.add("box");
			System.out.println(l1);			
			
			
			
			System.out.println("\nEverything about the Set interface");
			Set s2 = new HashSet();
			s2.add("shiva");
			s2.add("pencil");
			s2.add("Eraser");
			s2.add("book");
			s2.add("box");
		//	System.out.println(s2);
			
			Iterator i3 = s2.iterator();
			//drawback of List_iterator is does not traverse in the backword direction.
			
			while(i3.hasNext()) {
				System.out.println(i3.next());
			}
	}

}
