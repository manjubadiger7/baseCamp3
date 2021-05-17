
//	Question 4 : Write a program to find the number just higher than the user input from an array of integers. 
//		Example : Input: arr[] = {84, 56, 33, 98, 196} 
//		user input: 45 
//	Output: 56

import java.util.Scanner;

public class NextMaximumNumber {
	static int[] array;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter umber of elements for array");

		int numberOFElements = sc.nextInt();
		array = new int[numberOFElements];

		int[] array = insertArray(numberOFElements);
		displayArray(array);
		int[] sortedArray = sortArray(array);
		System.out.println();
		System.out.println("Enter number for searching jusr higher number");
		int userInput = sc.nextInt();

		justHigherNumber(sortedArray, userInput);

	}

// --------------------------------------------------------------------------------
	// finding just higer number in the array
	// using binary search
// --------------------------------------------------------------------------------
	private static void justHigherNumber(int[] sortedArray, int userNumber) {

		for (int i = 0; i < sortedArray.length; i++) {
			if (sortedArray[i] > userNumber) {
				System.out.println("Just higher number in the aray is" + sortedArray[i]);
				break;
			}
		}

	}

// --------------------------------------------------------------------------------
	// displaying sorted array
// --------------------------------------------------------------------------------
	private static void displayArray(int[] sortedArray) {
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ");
		}

	}

// --------------------------------------------------------------------------------
	// sorting array elements using insertion sort
//--------------------------------------------------------------------------------
	private static int[] sortArray(int[] array2) {
		int n = array2.length;
		for (int i = 1; i < n; ++i) {
			int key = array2[i];
			int j = i - 1;

			// Move elements that are greater than key
			while (j >= 0 && array2[j] > key) {
				array2[j + 1] = array2[j];
				j = j - 1;
			}
			array2[j + 1] = key;
		}
		return array2;
	}

	private static int[] insertArray(int numberOFElements) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter element of array");
			array[i] = sc.nextInt();
		}
		return array;
	}
}
