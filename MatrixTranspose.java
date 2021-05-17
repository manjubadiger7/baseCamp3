import java.util.Scanner;

public class MatrixTranspose {
	static int[][] array;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter number of rows and columns");

		int rowAndCol = sc.nextInt();

		array = new int[rowAndCol][rowAndCol];
		int array[][] = insertArray(rowAndCol);
		System.out.println("Before Transpose");
		displayArray(array);
		System.out.println("After Transpose");
		displayTranspose(array);

	}

	private static void displayTranspose(int[][] array2) {
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				System.out.print(array2[j][i] + " ");
			}
			System.out.println();
		}

	}

	private static void displayArray(int[][] array) {
		System.out.println("Array elements are");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static int[][] insertArray(int rowAndCol) {
		System.out.println("Enter elements of array");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println("Enter element of " + i + " and " + j);
				array[i][j] = sc.nextInt();
			}
		}
		return array;
	}
}
