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
 * 1. boolean add(Object element) : It appends the element to the end of the list.
 * 2. void add(int index, Object element): It inserts the element at the position ‘index’ in the list.
 * 3. void addFirst(Object element) : It inserts the element at the beginning of the list.
 * 4. void addLast(Object element) : It appends the element at the end of the list.
 * 5. boolean contains(Object element) : It returns true if the element is present in the list.
 * 6. Object get(int index) : It returns the element at the position ‘index’ in the list. It throws ‘IndexOutOfBoundsException’ if the index is out of range of the list.
 * 7. int indexOf(Object element) : If element is found, it returns the index of the first occurrence of the element. Else, it returns -1.
 * 8. Object remove(int index) : It removes the element at the position ‘index’ in this list. It throws ‘NoSuchElementException’ if the list is empty.
 * 9. int size() : It returns the number of elements in this list.
 * 10. void clear() : It removes all of the elements from the list.
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
		LinkedList<String> ll = new LinkedList<>();
		llo.basicsLinkedList(ll);
	}
	
	public LinkedList<String> basicsLinkedList(final LinkedList<String> ll) {
	
    // Creating object of class linked list
	//LinkedList<String> ll = new LinkedList<>()
	
    // Adding elements to the linked list
	ll.add("A");
	ll.add("B");
	ll.addLast("C");
	ll.addFirst("D");
	// result [D, A, B, C]
	System.out.println("LinkedList ll after add 4 elements: " + ll);
	
	// removing elements
	ll.remove("A");
	// result [D, B, C]
	System.out.println("LinkedList ll after remove 1 element: " + ll);

	ll.removeFirst();
	ll.removeLast();
	// result [B]
	System.out.println("LinkedList ll after remove first & last elements: " + ll);
	
	 // Adding elements to the linked list
		ll.add("M");
		ll.add("N");
		ll.addLast("K");
		ll.addFirst("L");
		// result [L, B, M, N, K]
		System.out.println("LinkedList ll after add 4 elements: " + ll);
	
		return ll;
	}
	
	public int linkedListSize(int qtyElements) {
		
		LinkedList<String> ll = new LinkedList<>();
		
	    // Adding qtyElements elements to the linked list
		for(int i = 0; i < qtyElements; i++)
			ll.add("D" + i);
		System.out.println("LinkedList ll after add qtyElements elements: " + ll);
				
		return ll.size();
		}
	
	public String findNthElement(int listSize, int nth) {
		LinkedList<String> ll = new LinkedList<>();
		// Adding qtyElements elements to the linked list
		for(int i = 0; i < listSize; i++)
			ll.add("el_" + i);
		// print out ll
		System.out.println("LinkedList ll after add listSize elements: " + ll);
		
		return ll.get(nth);
	}
	
}
