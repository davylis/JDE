/*
 * Create a program called ObjectsWordPairsArray. This exercise is a variation of the Objects Word
Pair Program exercise.

Please reuse the WordPair class from the previous exercise and create an array of three WordPairs.
Then create three WordPair objects and save their references to the array. See the example output
for the English and Finnish words. You can either use an array initializer or create the WordPair
objects separately.
 */
public class ObjectsWordPairsArray {

	public static void main(String[] args) {
		WordPair one = new WordPair("school", "koulu");
		WordPair two = new WordPair("student", "opiskelija");
		WordPair three = new WordPair("textbook","oppikirja");
		
		WordPair[] arrWPair = { one, two, three};
		
		for(WordPair wpElement: arrWPair) {
			System.out.println(wpElement.getEnglishWord()+" = "+wpElement.getFinnishWord());
		}

	}

}
