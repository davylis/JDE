import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class WordPair1 implements Comparable<WordPair1>{
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

class FinnishWordComparator implements Comparator<WordPair1> {
    
    public int compare(WordPair1 a, WordPair1 b) {
        return a.getFinnishWord().compareToIgnoreCase(b.getFinnishWord());
    }
}

class EnglishWordComparator implements Comparator<WordPair1> {
    
    public int compare(WordPair1 a, WordPair1 b) {
        return a.getEnglishWord().compareToIgnoreCase(b.getEnglishWord());
    }
}
public class ObjectsSortWordPairs {

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
		Collections.sort(pairs, new EnglishWordComparator());

		for (WordPair1 w : pairs) {
			System.out.println(w.toStringEnglish());
		}

		System.out.println();
		
		 Collections.sort(pairs, new FinnishWordComparator());
		
		for (WordPair1 w : pairs) {
			System.out.println(w.toStringFinnish());
		}
		input.close();
	}
}


