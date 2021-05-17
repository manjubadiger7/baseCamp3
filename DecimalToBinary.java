import java.util.Scanner;

public class DecimalToBinary {

	public static void DecimalToBinary(int decimal) {

		int binary[] = new int[40];
		int index = 0;

		while (decimal > 0) {
			binary[index++] = decimal % 2;
			decimal = decimal / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i] + " ");
		}
	}

	public static void main(String[] args) {

		System.out.println("enter int number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		DecimalToBinary(number);

	}

}
