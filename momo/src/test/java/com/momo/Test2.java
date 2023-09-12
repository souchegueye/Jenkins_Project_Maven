//package com.momo;
//
//import static org.junit.Assert.assertEquals;
//
//import org.junit.Before;
//import org.junit.Test;
//
//public class Test2 {
//
//	static void beforeAll() {
//		System.out.println("Before all the tests are executed");
//	}
//
//	@BeforeEach
//	void beforeEach() {
//		System.out.println("Before each test");
//	}
//
//	@Test
//	void test1() {
//		System.out.println("Test1");
//		MyUtils myUtils1 = new MyUtils();
//
//		// call function add() from MyUtils class
//		int actualResult1 = myUtils1.add(9, 99);
//		// assertEquals (int expected, integer actual)
//		assertEquals(108, actualResult1);
//	}
//
//	@Test
//	void test2() {
//		System.out.println("Test2");
//		MyUtils myUtils1 = new MyUtils();
//
//		// call function add() from MyUtils class
//		int actualResult1 = myUtils1.add(-3, -99);
//		// assertEquals (int expected, integer actual)
//		assertEquals(-102, actualResult1);
//	}
//
//	@AfterEach
//	void afterEach() {
//		System.out.println("After Each test");
//	}
//
//	@AfterAll
//
//	static void afterAll() {
//		System.out.println("After All tests");
//	}
//
//}
