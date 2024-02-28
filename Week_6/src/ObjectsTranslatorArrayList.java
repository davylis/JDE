
/*
 * Create a program called ObjectsTranslatorArrayList that first inputs pairs of English and Finnish
words from the user until he/she enters "ok" as the English word.
Then the program should input English words from the user until the user decides to quit by
entering "quit". For each entered word, the program prints the corresponding Finnish word. If the
word is unknown, the program should display "Unknown word".
 */
import java.util.ArrayList;
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

public class ObjectsTranslatorArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");
		ArrayList<WordPair> words = new ArrayList<WordPair>();
		String englishW = "";
		String finnishW = "";

		while (true) {
			System.out.print("Enter an English word: ");
			englishW = input.nextLine();
			if (englishW.equalsIgnoreCase("ok")) {
				break;
			}
			System.out.print("Enter a Finnish word: ");
			finnishW = input.nextLine();

			words.add(new WordPair(englishW, finnishW));
			System.out.println();
		}

		System.out.println("=== English-Finnish translation service (quit ends) ===");
		String w = "";
		while (true) {
			boolean found = false;
			System.out.print("Enter an English word: ");
			w = input.nextLine();
			if (w.equalsIgnoreCase("quit")) {
				System.out.println("Bye!");
				break;
			}
			for (WordPair word : words) {
				if (w.equals(word.getEnglishWord())) {
					System.out.println(word.getFinnishWord());
					found = true;
				}
			}
			if (!found) System.out.println("Unknown word");
			System.out.println();
		}
	}

}