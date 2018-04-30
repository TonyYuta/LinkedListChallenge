/**
 *   File Name: LinkedListOperationsTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Apr 28, 2018
 *   
 */

package org.collections.lists;

import java.util.LinkedList;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
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
	LinkedList<String> l;

	//@Parameters({ "browser", "appURL", "groups" })
	@Parameters({"groups"})
	@BeforeClass(alwaysRun = true) 
	public void setUpBeforeClassLinkedListOperationsTest(@Optional("all") String groups) {
		//ll = new LinkedList<>();
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
		l = new LinkedList<>();
		llo.basicsLinkedList(l);
		Assert.assertEquals(llo.basicsLinkedList(l).toString(), "[L, B, M, N, K]", "Result doesn't match to expected [L, B, M, N, K]");		
	}
	
	@Test(enabled = true, groups = {"LinkedListSize", "LinkedList", "List", "all"}, priority = 0)
	public void test002_basicsLinkedList() {
		l = new LinkedList<>();
		llo.linkedListSize(5);
		Assert.assertEquals(llo.linkedListSize(5), 5, "Result doesn't match to expected size of [D0, D1, D2, D3, D4");		
	}
	
	@Test(enabled = true, groups = {"findNthElement", "LinkedList", "List", "all"}, priority = 0)
	public void test003_basicsLinkedList() {
		Assert.assertEquals(llo.findNthElement(11, 1), "el_1", "Result doesn't match to expected el_1");		
	}
	
	
}
