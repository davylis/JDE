class WordPair {
	WordPair(String eW, String fW){
		this.englishWord = eW;
		this.finnishWord = fW;	
		}
	
	public String getEnglishWord() {
		return this.englishWord;
	}
	
	public String getFinnishWord(){
		return this.finnishWord;
	}
	
	private String englishWord;
	private String finnishWord;
}
public class ObjectsWordPairsProgram {

	public static void main(String[] args) {
		WordPair one = new WordPair("school", "koulu");
		WordPair two = new WordPair("student", "opiskelija");
		WordPair three = new WordPair("textbook","oppikirja");
		
		System.out.println(one.getEnglishWord() + " = " + one.getFinnishWord());
		System.out.println(two.getEnglishWord() + " = " + two.getFinnishWord());
		System.out.println(three.getEnglishWord() + " = " + three.getFinnishWord());
	}
}
