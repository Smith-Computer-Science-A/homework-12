package homework12;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeworkTest {

	@Test public void problem1a() {
		int[] arr = {1, 2, 3, 4, 5};
		assertEquals(1, Homework.problem1(arr, 3));
	}

	@Test public void problem1b() {
		int[] arr = {2, 10, 6, 4, 8};
		assertEquals(0, Homework.problem1(arr, 5));
	}

	@Test public void problem1c() {
		int[] arr = {1, 1, 6, 2, 5, 6, 2};
		assertEquals(2, Homework.problem1(arr, 6));
	}

	@Test public void problem2a() {
		int[] arr1 = {1, 2, 3, 5, 7, 11};
		int[] arr2 = {1, 2, 3, 5, 7, -1};
		int x = Homework.problem2(arr1, 5);
		assertEquals(11, x);
		for (int i = 0; i < arr1.length; i++) {
			assertEquals(arr2[i], arr1[i]);
		}
	}

	@Test public void problem2b() {
		int[] arr1 = {1, 1, 2, 3, 5, 8, 13};
		int[] arr2 = {1, 1, 2, 5, 8, 13, -1};
		int x = Homework.problem2(arr1, 3);
		assertEquals(3, x);
		for (int i = 0; i < arr1.length; i++) {
			assertEquals(arr2[i], arr1[i]);
		}
	}

	@Test public void problem2c() {
		int[] arr1 = {2, 4, 6, 8, -1, -1};
		int[] arr2 = {4, 6, 8, -1, -1, -1};
		int x = Homework.problem2(arr1, 0);
		assertEquals(2, x);
		for (int i = 0; i < arr1.length; i++) {
			assertEquals(arr2[i], arr1[i]);
		}
	}
	
	@Test public void problem3a() {
		int[] arr1 = {1, 3, 5, 7, 9};
		int[] arr2 = {9, 3, 5, 7, 1};
		Homework.problem3(arr1, 0, 4);
		for (int i = 0; i < arr1.length; i++) {
			assertEquals(arr2[i], arr1[i]);
		}
	}
	
	@Test public void problem3b() {
		int[] arr1 = {2, 3, 5, 7, 11, 13};
		int[] arr2 = {2, 7, 5, 3, 11, 13};
		Homework.problem3(arr1, 1, 3);
		for (int i = 0; i < arr1.length; i++) {
			assertEquals(arr2[i], arr1[i]);
		}
	}
	
	@Test public void problem4a() {
		int[] arr1 = {1, 2, 3, 4, 5, 6};
		int[] arr2 = {4, 5, 6, 1, 2, 3};
		Homework.problem4(arr1);
		for (int i = 0; i < arr1.length; i++) {
			assertEquals(arr2[i], arr1[i]);
		}
	}
	
	@Test public void problem4b() {
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
		int[] arr2 = {4, 5, 6, 7, 1, 2, 3};
		Homework.problem4(arr1);
		for (int i = 0; i < arr1.length; i++) {
			assertEquals(arr2[i], arr1[i]);
		}
	}

	@Test public void problem4c() {
		int[] arr1 = {2, 3, 5, 7, 11, 13, 17};
		int[] arr2 = {7, 11, 13, 17, 2, 3, 5};
		Homework.problem4(arr1);
		for (int i = 0; i < arr1.length; i++) {
			assertEquals(arr2[i], arr1[i]);
		}
	}
	
	@Test public void problem5a() {
		int arr1[] = {1, 2, 2, 3, 2, 4, 5};
		int arr2[] = {1, 3, 4, 5, -1, -1, -1};
		Homework.problem5(arr1, 2);
		for (int i = 0; i < arr1.length; i++) {
			assertEquals(arr2[i], arr1[i]);
		}
	}

	@Test public void problem5b() {
		int arr1[] = {2, 3, 5, 7, 11, 7, 5, 3, 2};
		int arr2[] = {2, 3, 7, 11, 7, 3, 2, -1, -1};
		Homework.problem5(arr1, 5);
		for (int i = 0; i < arr1.length; i++) {
			assertEquals(arr2[i], arr1[i]);
		}
	}

	@Test public void validateTests() {
		assertTrue(Homework.shaValidation());
	}
	
}
