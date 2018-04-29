/**
 *   File Name: LinkedListOperations.java<br>
 *
 *   Yutaka<br>
 *   Created: Apr 28, 2018
 *   
 */

package org.collections.lists;

import java.util.LinkedList;

/**
 * LinkedListOperations // using embedded methods and challenge 
 * <p>
 * //ADDD first, last, by index, set
 * This class consists of the following methods :

1. boolean add(Object element) : It appends the element to the end of the list.

2. void add(int index, Object element): It inserts the element at the position ‘index’ in the list.

3. void addFirst(Object element) : It inserts the element at the beginning of the list.

4. void addLast(Object element) : It appends the element at the end of the list.

5. boolean contains(Object element) : It returns true if the element is present in the list.

6. Object get(int index) : It returns the element at the position ‘index’ in the list. It throws ‘IndexOutOfBoundsException’ if the index is out of range of the list.

7. int indexOf(Object element) : If element is found, it returns the index of the first occurrence of the element. Else, it returns -1.

8. Object remove(int index) : It removes the element at the position ‘index’ in this list. It throws ‘NoSuchElementException’ if the list is empty.

9. int size() : It returns the number of elements in this list.

10. void clear() : It removes all of the elements from the list.

 * <p>
 * //ADDD all embedded
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class LinkedListOperations {
		
	public static void main(String[] args) {
		 
		LinkedListOperations llo = new LinkedListOperations();
		llo.basicsLinkedList();
	}
	
	public void basicsLinkedList() {
	
    // Creating object of class linked list
	LinkedList<String> ll = new LinkedList<>();
	
    // Adding elements to the linked list
	ll.add("A");
	ll.add("B");
	ll.addLast("C");
	ll.addFirst("D");
	// result
	System.out.println("LinkedList ll After adding 2 elements: " + ll);
	
	// 
	}
	
	
	
}
