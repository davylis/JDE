import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class WordPair1 {
	private String englishWord;
	private String finnishWord;

	public WordPair1(String eng, String finn) {
		this.englishWord = eng;
		this.finnishWord = finn;
	}

	public String getEnglishWord() {
		return this.englishWord;
	}

	public String getFinnishWord() {
		return this.finnishWord;
	}

	public String toStringEnglish() {
		return this.englishWord + " = " + this.finnishWord;
	}

	public String toStringFinnish() {
		return this.finnishWord + " = " + this.englishWord;
	}

}

public class ObjectsSortWordPairsLambda {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<WordPair1> pairs = new ArrayList<WordPair1>();
		String englishWord = "";
		String finnishWord = "";

		while (true) {
			System.out.print("Enter an English word (quit ends): ");
			englishWord = input.nextLine();
			if (englishWord.equalsIgnoreCase("quit")) {
				break;
			}
			System.out.print("Enter a Finnish word: ");
			finnishWord = input.nextLine();
			System.out.println();

			pairs.add(new WordPair1(englishWord, finnishWord));
		}
		System.out.println();
		
		// Sort the list of WordPairs in alphabetical order by English word
		Collections.sort(pairs, (a, b) -> {
			return a.getEnglishWord().compareToIgnoreCase(b.getEnglishWord());
		});

		for (WordPair1 w : pairs) {
			System.out.println(w.toStringEnglish());
		}

		System.out.println();
		
		Collections.sort(pairs, (a, b) -> {
			return a.getFinnishWord().compareToIgnoreCase(b.getFinnishWord());
		});
		
		for (WordPair1 w : pairs) {
			System.out.println(w.toStringFinnish());
		}
		input.close();
	}
}


