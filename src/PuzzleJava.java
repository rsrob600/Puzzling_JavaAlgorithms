import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {

	/*
	 * Objectives: Implement different algorithms in java. Practice Array and
	 * ArrayList. Practice loops. Learn and use the Collections and Random classes.
	 */

	/*
	 * Method 1: ArrayList, Print Sum, Greater Than Y Create an array with the
	 * following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the
	 * array. Also have the function return an array that only includes numbers that
	 * are greater than 10 (e.g. when you pass the array above, it should return an
	 * array with the values of 13,25,32)
	 */
	public ArrayList<Integer> printSumGreaterThanY(int[] arr, int Y) {

		int sum = 0;
		ArrayList<Integer> newArray = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length) {
				sum += arr[i];
			}
			if (arr[i] > 10) {
				newArray.add(arr[i]);
			}
		}
		System.out.println(sum);
		return newArray;
	}

	/*
	 * Method 2: ArrayList, Shuffle, Print Array, Index Length Greater Than Y Create
	 * an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi,
	 * Ishikawa. Shuffle the array and print the name of each person. Have the
	 * method also return an array with names that are longer than 5 characters.
	 */
	public ArrayList<Object> shufflePrintGreaterThanY(String[] arr, int Y) {

		ArrayList<Object> shuffleArray = new ArrayList<Object>();
		ArrayList<Object> newArray = new ArrayList<Object>();

		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length) {
				shuffleArray.add(arr[i]);
			}
			if (arr[i].length() > Y) {
				newArray.add(arr[i]);
			}
		}
		Collections.shuffle(shuffleArray);
		System.out.println(shuffleArray);
		return newArray;
	}

	/*
	 * Method 3: ArrayList, Shuffle, Print Last Index, Print First Index (Message If
	 * Vowel) Create an array that contains all 26 letters of the alphabet (this
	 * array must have 26 values). Shuffle the array and, after shuffling, display
	 * the last letter from the array. Have it also display the first letter of the
	 * array. If the first letter in the array is a vowel, have it display a
	 * message. To shuffle a collection, you can use the shuffle method of the
	 * Collections class.
	 */
	public void abcShuffleArray() {

		ArrayList<Character> abcArray = new ArrayList<Character>();

		for (int i = 0; i < 26; i++) {
			char lower = (char) ('a' + i); // use the incrementor value and cast to the ASCII char value
			abcArray.add(lower); // add each letter increment to the ArrayList
		}
		Collections.shuffle(abcArray);
		System.out.println("Last letter in array is: " + abcArray.get(25)); // get the last array letter

		char first = (Character) abcArray.get(0); // get the first array letter
		char a = ('a');
		char e = ('e');
		char i = ('i');
		char o = ('o');
		char u = ('u');

		if (first == a || first == e || first == i || first == o || first == u) {
			System.out.println("First letter in array is: " + first + "," + " and its a vowel!");
		} else
			System.out.println("First letter in array is: " + first);

		// return abcArray; // in order to view the entire array (must replace "void"
		// with "ArrayList<Character>" in public
	}

	/*
	 * Method 4: ArrayList with unsorted random index values Generate and return an
	 * array with 10 random numbers between 55-100. To get a random integer, you can
	 * use the nextInt method of the Random class.
	 */
	public ArrayList<Integer> randomArray(int x, int start, int end) {

		// Check for ending range greater than starting range
		if (start >= end) {
			System.out.println("Please enter a max value greater than min value");
		}

		Random r = new Random();
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 0; i < x; i++) {
			arr.add(r.nextInt((end - start) + 1) + start); // Range = (100-55=45, 0...45 index values)+1 for inclusive +
															// Min start value
		}
		return arr;
	}

	/*
	 * Method 5: ArrayList, random, sort, min/max Generate and return an array with
	 * 10 random numbers between 55-100 and have it be sorted (showing the smallest
	 * number in the beginning). Display all the numbers in the array. Next, display
	 * the minimum value in the array as well as the maximum value. To sort a
	 * collection, you can use the sort method of the Collections class.
	 */
	public ArrayList<Integer> randomSortArray(int x, int start, int end) {

		// Check for ending range greater than starting range
		if (start >= end) {
			System.out.println("Please enter a max value greater than min value");
		}

		Random r = new Random();
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 0; i < x; i++) {
			arr.add(r.nextInt((end - start) + 1) + start);
		}
		// Sort array smallest to largest
		Collections.sort(arr);

		// Get the first array index value AFTER sort (smallest via the previous sort
		// function)
		int min = arr.get(0);
		System.out.println("Smallest value in array is: " + min);

		// Get the last array index value AFTER sort (largest via the previous sort
		// function)
		int max = arr.get(arr.size() - 1);
		System.out.println("Largest value in array is: " + max);

		return arr;
	}

	/*
	 * Method 6: ArrayList with random index values converted to char from ASCII
	 * character map. Create a random string that is 5 characters long.
	 */
	public String randomString(int x, int start, int end) {

		// Check for ending range greater than starting range
		if (start >= end) {
			System.out.println("Please enter a max value greater than min value");
		}

		Random r = new Random();
		ArrayList<Character> arr = new ArrayList<Character>();

		for (int i = 0; i < x; i++) {
			arr.add((char) (r.nextInt((end - start) + 1) + start)); // generate random numbers (range is set from ASCII
																	// map including special char)
		}

		// Create temp buffer to store each array character before returning them as a
		// single string
		StringBuffer b = new StringBuffer();

		for (Character s : arr) { // enhanced for-loop to iterate each character of the array
			b.append(s); // append each array character to the temp buffer
		}

		return b.toString(); // return the temp buffer as string
	}

	/*
	 * Method 7: Fixed Array with random index values converted to char from ASCII
	 * character map Generate an array with 10 random strings that are each 5
	 * characters long
	 */
	public String[] randomDeepString(int ab, int as, int start, int end) {

		// Check for ending range greater than starting range
		if (start >= end) {
			System.out.println("Please enter a max value greater than min value");
		}

		Random r = new Random();

		// Create 2D char fixed array
		char[][] array;

		// Set the 2D row / column parameters (input from the main file)
		array = new char[ab][as];

		// Create new 1D String Array - set parameters using the row input from main
		// file
		String[] sArray = new String[ab];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (char) (r.nextInt((end - start) + 1) + start); // generate random numbers (range is set
																				// from ASCII map including special
																				// char)
			}
			// adding the random 5 chars to the new 1D String Array after each inner loop
			// iteration
			sArray[i] = new String(array[i]);
		}
		// return the new 1D String Array instead of the 2D Char Array used to generate
		// the outer elements and inner random string
		return sArray;
	}

}