import java.util.Scanner;

/*
 * 
 * 
 * Create a 2d matrix n*n (UserInput). Write a program to revrese the diagonal elements and square other elements
 * 
 * 
 * Psuedo code
 * -------->
 * 			1. find the diagonal elements
 * 			2. add diagonal elements to array
 * 			3. trverse to diagonal elemets change to array elements with reverse
 * 
 * 			4. other that elemts should be squred
 * 
 * 
 * */
public class TwoDMatrix {

	static Scanner sc = new Scanner(System.in);

	static int[][] twodArray;

	public static void main(String[] args) {

		System.out.println("Enter the number of rows and columns");

		byte number = sc.nextByte();

		insertArray(number);
		feature(twodArray);
	}

	private static void display(int[][] twodArray) {
		System.out.println("***********************************************");
		for (int i1 = 0; i1 < twodArray.length; i1++) {
			for (int j1 = 0; j1 < twodArray.length; j1++) {
				System.out.print(twodArray[i1][j1] + " ");
			}
			System.out.println();
		}

	}

	private static void feature(int[][] twodArray) {
		int i = 0, j = twodArray.length;
		while (i < j) {
			int temp = twodArray[i][i];
			twodArray[i][i] = twodArray[j - 1][j - 1];
			twodArray[j - 1][j - 1] = temp;
			i++;
			j--;
		}
		for (int j2 = 0; j2 < twodArray.length; j2++) {
			for (int k = 0; k < twodArray.length; k++) {
				if (j2 != k) {
					twodArray[j2][k] = twodArray[j2][k] * twodArray[j2][k];

				}
			}
		}
		System.out.println("After Reversing and suqring");
		display(twodArray);
	}

	private static void insertArray(byte number) {

		twodArray = new int[number][number];

		System.out.println("Enter the array elements");
		for (int i = 0; i < twodArray.length; i++) {
			for (int j = 0; j < twodArray.length; j++) {
				System.out.println("Elnter element of " + i + 1 + "th row and " + j + 1 + "the colum");
				twodArray[i][j] = sc.nextInt();
			}
		}
		System.out.println("Before sorting and all");
		display(twodArray);

	}

}
