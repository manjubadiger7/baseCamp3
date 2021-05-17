import java.util.Scanner;

public class StringProblemOne {
	static String[] words;
	static int length = 0;

	private static int countNumberOfWords(String inputString) {
		int count = 0;
		for (int i = 0; i < inputString.length(); ++i) {
			if (inputString.charAt(i) == ' ') {
				count++;
			}
		}

		return count;

	}

// ----------------------------------------------------------------------------------
	// replacing dupicate characters with next character
// ----------------------------------------------------------------------------------

	private static String[] split(String input) {

		String word = "";
		input = input + " ";
		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) == ' ' || input.charAt(i) == '_' || input.charAt(i) == ',') {
				words[length] = word;
				length++;
				word = "";
			} else {
				word = word + input.charAt(i);
			}

		}
		return words;

	}

//----------------------------------------------------------------------------------
	// replacing dupicate characters with next character
//----------------------------------------------------------------------------------
	private static String[] WordsToWord(String[] words) {
		for (int i = 0; i < words.length; i++) {
			String word = replaceDuplicateChar(words[i]);
			words[i] = word;
		}
		return words;
	}

//----------------------------------------------------------------------------------
	// replacing dupicate characters with next character
//----------------------------------------------------------------------------------
	private static String replaceDuplicateChar(String word) {
		String repeatingCharacters = "";

		for (int i = 0; i < word.length(); i++) {
			int counter = 0;
			char characeter = word.charAt(i);

			for (int j = 0; j < word.length(); j++) {
				if (characeter == word.charAt(j)) {
					counter++;
				}
			}
			if (counter > 1) {
				repeatingCharacters += characeter;
			}
		}

		String replacedWord = replaceCharacters(word, repeatingCharacters);
		return replacedWord;

	}

// ----------------------------------------------------------------------------------
	// replacing dupicate characters with next character
// ----------------------------------------------------------------------------------
	private static String replaceCharacters(String word, String repeatingCharacters) {
		String replacedWord = "";
		for (int i = 0; i < word.length(); i++) {
			char character = word.charAt(i);
			for (int j = 0; j < repeatingCharacters.length(); j++) {
				if (character == repeatingCharacters.charAt(j)) {
					character = (char) (character + 1);
				}
			}
			replacedWord += character;
		}
		return replacedWord;

	}

//----------------------------------------------------------------------------------
	// Sorting using insertion sort
//----------------------------------------------------------------------------------
	public static String[] sort(String array[]) {
		int n = array.length;
		for (int i = 1; i < n; ++i) {
			String key = array[i];
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && array[j].compareTo(key)>0) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
		return array;
	}

//----------------------------------------------------------------------------------
	// replacing dupicate characters with next character
//----------------------------------------------------------------------------------
	private static void displayWords(String[] replacedWords) {
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");

		}
		System.out.println();

	}

//----------------------------------------------------------------------------------
	// replacing dupicate characters with next character
//----------------------------------------------------------------------------------
	public static void main(String[] args) {

		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();

		int count = countNumberOfWords(inputString);

		words = new String[count + 1];

		split(inputString);
		String[] replacedWords = WordsToWord(words);
		System.out.println();
		System.out.println("After replacing character with next character");
		displayWords(replacedWords);
		String[] sorted = sort(replacedWords);
		System.out.println();
		System.out.println("After sorting using insertion sort");
		displayWords(sorted);

	}
}
