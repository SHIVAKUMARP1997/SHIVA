package java36_ArrayList_and_CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 
 * Arraylist is an implemented class of list interface,
 * which is present in java.util package.
 * 
 * Syntax:-----------------
 * class ArrayList implements List
 * 	{
 * 		constructors
 * 		methods
 * 	}
 * 
 * ArrayList is created on the basis of growable or resizable array.
 * 
 * 
 * Properties of ArrayList:-------------------------------------
 * 
 * 	arraylist or index based Data Structure.
 *  arraylist can store different data type or heterogeneous data types.
 *  arraylist can store duplicate values.
 *  arrayList can store any number of null values. 
 *  arrayList follows the insertion order.
 *  arrayList does not follows the sorting order.
 *  arraylist or non synchronised.
 * 
 * ArrayList Constructor:--------------------------------------.
 * 
 * 	ArrayList() : it is used to build an empty array list with initial capacity as 10.
 * 
 * 	ArrayList al 1= new ArrayList();
 * 
 * 
 * ArrayList Methods:-------------------------------------------
 * 
add() -is used to add the elements or object in an arraylist or say collection subject. 

addAll() - method is used to add or append all the elements in the specified collection to the end of Array list or collection object 

remove() -It is used to remove the element at the specified position in an Array list. 

removeAll() - it is used to remove the elements from the current Aray list which are contained in the specified a releases or say collection subject. 

clear()- it is used to remove all the elements from the Array list or say collection object. 

contains() - it is used to check if the specified element is present in the given Array list or not, if it is present it will return true else false. 

size()- it is used to return the number of elements in the arraylist that is the size. 

get() - it is used to get the elements of a specified index within the Array list. 

set()- it is used to replace the element at the specified index position in an ArrayList with the specified element. 

indexOf() - it is used to return the index of first occurrence of the element in the ArrayList if this list does not contain the element then it will return -1. 

iterator()- it is used to get an iterator over the elements in the list in a proper sequence.




 */
public class ArrayList_Sort {

	public static void main(String[] args) {
		List<Integer> a1 = new ArrayList<Integer>();
		a1.add(986);
		a1.add(6);
		a1.add(256);
		a1.add(76);
		a1.add(569);
		a1.add(89);
		a1.add(56);
		a1.add(78);
		
		
		//Sorting Using Collections-Class
		Collections.sort(a1); //collections class, where as collection is an iterface.
		
		//a1.set(0, "shiva"); //setting the value at indext position 0.
		
		//Collections.sort(a1); Collection not works with heterogenous values since shiva is string.
		System.out.println(a1+"\n");
		
		for(Integer number : a1) {
			System.out.println(number);
		}
		
		
		
		
	}

}
