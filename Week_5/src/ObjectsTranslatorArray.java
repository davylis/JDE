/*
 * Create a program called ObjectsTranslatorArray that inputs an English word from the user and
translates it to Finnish. The program is a variation of your ArrayWords program.
This time, the program can translate only the following words: "bird", "bar", "bus", "car", "cat",
"dog".

If the English word is unknown, the program should display "Unknown word".
• This time, use one array only. Reuse the WordPair class from a previous exercise and create an
array of WordPairs.
 */

import java.util.Scanner;

class WordPair {
	WordPair(String eW, String fW) {
		this.englishWord = eW;
		this.finnishWord = fW;
	}

	public String getEnglishWord() {
		return this.englishWord;
	}

	public String getFinnishWord() {
		return this.finnishWord;
	}

	private String englishWord;
	private String finnishWord;
}

public class ObjectsTranslatorArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an English word: ");
		String word = input.nextLine();

		WordPair[] pairs = { new WordPair("cat", "kissa"), new WordPair("dog", "koira"), new WordPair("car", "auto"),
				new WordPair("bus", "bussi"), new WordPair("bar", "baari"), new WordPair("bird", "lintu") };
		boolean found = false;
		for (WordPair wp : pairs) {
			if (wp.getEnglishWord().equals(word)) {
				System.out.println(wp.getFinnishWord());
				found = true;
			}
		}
		if (!found) {
			System.out.println("Unknown word");
		}
	}
}