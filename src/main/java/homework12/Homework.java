package homework12;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Homework {

	/* Problem 1:
	 * Return the number of times that the value n
	 * appears in arr. You must use an enhanced for
	 * loop to receive credit.
	 */
	public static int problem1(int[] arr, int n) {
		return 0;
	}
	
	/* Problem 2:
	 * Remove and return the value at index i from arr,
	 * shifting values to the left. Use -1 to indicate
	 * that an index is empty. For example, if arr is
	 * {1, 2, 3, 4} and you call problem1(2), arr should
	 * now be  {1, 2, 4, -1}
	 */
	public static int problem2(int[] arr, int i) {
		return 0;
	}
	
	/* Problem 3:
	 * Swap the elements at indices i and j in arr.
	 */
	public static void problem3(int[] arr, int i, int j) {

	}

	/* Problem 4:
	 * Swap the first and second halves of arr. If the array
	 * is an odd length, the middle position should be
	 * considered in the second half.
	 * Hint: arr.length / 2 will always be in the second half
	 * 
	 * Example: {1, 2, 3, 4, 5, 6} -> {4, 5, 6, 1, 2, 3}
	 * Example: {1, 2, 3, 4, 5, 6, 7} -> {4, 5, 6, 7, 1, 2, 3}
	 */
	public static void problem4(int[] arr) {	

	}
	
	/* Problem 5:
	 * Remove all instances of n from arr, shifting
	 * elements to the left and using -1 to indicate an
	 * empty position
	 * Hint: Make sure you account for the shift as you
	 *       conduct your search
	 * Hint: You have already written a method that removes
	 *       an element from an index
	 */
	public static void problem5(int[] arr, int n) {

	}
	
	public static boolean shaValidation() {		
		String shaExpected = "48b63417e5aec595ff690805146dc84f981a2714";
		try {
			Runtime rt = Runtime.getRuntime();
			Process pr = rt.exec("shasum src/test/java/homework12/HomeworkTest.java");
			InputStream is = pr.getInputStream();
			Scanner scanner = new Scanner(is);
			String shaActual = scanner.nextLine();
			scanner.close();
//			System.out.println(shaActual);
			return shaActual.startsWith(shaExpected);
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return false;
		}
	}
	
}
