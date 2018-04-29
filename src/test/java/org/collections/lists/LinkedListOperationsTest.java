/**
 *   File Name: LinkedListOperationsTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Apr 28, 2018
 *   
 */

package org.collections.lists;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * LinkedListOperationsTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class LinkedListOperationsTest {
	
	LinkedListOperations llo = new LinkedListOperations();

	//@Parameters({ "browser", "appURL", "groups" })
	@Parameters({"groups"})
	@BeforeClass(alwaysRun = true) 
	public void setUpBeforeClassLinkedListOperationsTest(String groups) {
		groups="all";
	}
	
	@BeforeMethod(alwaysRun = true)
	public void setUpBeforeEveryTestInLinkedListOperationsTest() {
		
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDownAfterClassLinkedListOperationsTest() {
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDownAfterEveryTestLinkedListOperationsTest() {
		
	}
	
	@Test(enabled = true, groups = {"bat", "LinkedList", "List", "all"}, priority = 0)
	public void test001_basicsLinkedList() {
		llo.basicsLinkedList();
		
	}
	
}
