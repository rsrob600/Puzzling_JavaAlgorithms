import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		PuzzleJava output = new PuzzleJava();

		/*
		 * Method 1: ArrayList, Print Sum, Greater Than Y Create an array with the
		 * following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the
		 * array. Also have the function return an array that only includes numbers that
		 * are greater than 10 (e.g. when you pass the array above, it should return an
		 * array with the values of 13,25,32)
		 */
		System.out.println("<-------Method 1 Test Begin-------->"); // Spacer
		int[] gyArray = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
		System.out.println(output.printSumGreaterThanY(gyArray, 10)); // 105, [13,25,32]
		System.out.println(""); // Spacer

		/*
		 * Method 2: ArrayList, Shuffle, Print Array, Index Length Greater Than Y Create
		 * an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi,
		 * Ishikawa. Shuffle the array and print the name of each person. Have the
		 * method also return an array with names that are longer than 5 characters.
		 */
		System.out.println("<-------Method 2 Test Begin-------->"); // Spacer
		String[] ilgyArray = { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa" };
		System.out.println(output.shufflePrintGreaterThanY(ilgyArray, 5));
		// shuffled (all) names print, [Jinichi, Fujibayashi, Momochi, Ishikawa]
		System.out.println(""); // Spacer

		/*
		 * Method 3: ArrayList, Shuffle, Print Last Index, Print First Index (Message If
		 * Vowel) Create an array that contains all 26 letters of the alphabet (this
		 * array must have 26 values). Shuffle the array and, after shuffling, display
		 * the last letter from the array. Have it also display the first letter of the
		 * array. If the first letter in the array is a vowel, have it display a
		 * message. To shuffle a collection, you can use the shuffle method of the
		 * Collections class.
		 */
		System.out.println("<-------Method 3 Test Begin-------->"); // Spacer
		output.abcShuffleArray();
		// Last array index value, First array index value, (Message if first array
		// index value is a vowel)
		// System.out.println(output.abcShuffleArray()); // in order to view the entire
		// array
		System.out.println(""); // Spacer

		/*
		 * Method 4: ArrayList with unsorted random index values Generate and return an
		 * array with 10 random numbers between 55-100. To get a random integer, you can
		 * use the nextInt method of the Random class.
		 */
		System.out.println("<-------Method 4 Test Begin-------->"); // Spacer
		System.out.println(output.randomArray(10, 55, 100)); // length of array, randomStart, randomEnd
		// An array with only 10 index values - filled with unsorted random numbers
		// between 55 -
		// 100
		System.out.println(""); // Spacer

		/*
		 * Method 5: ArrayList, random, sort, min/max Generate and return an array with
		 * 10 random numbers between 55-100 and have it be sorted (showing the smallest
		 * number in the beginning). Display all the numbers in the array. Next, display
		 * the minimum value in the array as well as the maximum value. To sort a
		 * collection, you can use the sort method of the Collections class.
		 */
		System.out.println("<-------Method 5 Test Begin-------->"); // Spacer
		System.out.println(output.randomSortArray(10, 55, 100)); // length of array, randomStart, randomEnd
		// An array with only 10 index values - filled with random numbers between 55 -
		// 100
		System.out.println(""); // Spacer

		/*
		 * Method 6: ArrayList with random index values converted to ASCII character map
		 * Create a random string that is 5 characters long.
		 */
		System.out.println("<-------Method 6 Test Begin-------->"); // Spacer
		System.out.println(output.randomString(5, 65, 122)); // length of string, randomStart, randomEnd (random range
																// based upon ASCII map)
		// random string of 5 characters in length
		System.out.println(""); // Spacer

		/*
		 * Method 7: Fixed 2D Char Array with random index values converted to ASCII
		 * Generate an array with 10 random strings that are each 5 characters long
		 */
		System.out.println("<-------Method 7 Test Begin-------->"); // Spacer
		System.out.println(Arrays.toString(output.randomDeepString(10, 5, 97, 122))); // length of array(row), length of
																						// string(col), randomStart,
																						// randomEnd (random range based
																						// upon ASCII map)
		// random 10 element array with 5 character string
		System.out.println(""); // Spacer

	}

}
