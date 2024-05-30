package java33_Collection_JAva;
/*
 * Collection is an interface/ framework which is present in java version (1.2)
 * 
 * it has some classes and interfaces in it.
 * 
 * With the help of collection we can create, read, update and delete the data.
 * 
 * collection can store the elements in the form of objects.
 * 
 * ---------------------------------------
 * Syntax:
 * public interface collection<E> extends Iterable<E> 
 * 
 * {
 *		methods
 * }
 * ---------------------------------------------------
 * 
 * Collection has some mainly used mthods in it .. they are.
 * add(E e)
 * addAll(Collection c)
 * contains(Object o)
 * containsAll(Collection c)
 * isEmpty()
 * remove(Object o)
 * removeAll(Collection c)
 * size()
 * clear()
 * 
 * 
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Collection_Java {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		
		//add()
		a1.add("ram"); //Adding the element.. #add()
		a1.add("shiva");
		a1.add(23);
		a1.add("true");
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		
		//addAll()
		a2.addAll(a1); // addAll()
		
		a2.add("sana");
		a2.add(1, "naveen"); // adding to the index position 1
		
		a2.add(0, "Shashi"); // Adding the value shashi to the index position 0
		System.out.println(a2);
		
		
		//remove() and removeAll()
		a2.remove(0); // removing value from the index.
		a2.remove("ram"); // removing the value directly.
		
		a2.removeAll(a1); //Removing the entire a1.
		
		a2.addAll(a1);
		
		//clear()
		a2.clear(); // clears all the elements in the array and makes it empty.
		
		
		//isEmpty()
		a2.isEmpty(); //checks wether the a2 is emptyt and returns boolean value..
		
		//clone()
		ArrayList a3=new ArrayList();
		a3 = (ArrayList) a2.clone();

		
		//iterator
		a2.iterator();
		
		
		Iterator l1 = a3.iterator(); // iterator is an interface .. iterator()--> Abstract method.
		
		
		//hasnext, next
		while(l1.hasNext()) {
			System.out.println(l1.next());
		}
	}

}
