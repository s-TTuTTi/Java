package typing; 
public class OriginalWord {
	private String originalWord;

	// constructor
	public OriginalWord() {
		this.originalWord = "";
	}

	// constructor
	public OriginalWord(String originalWord) {
		this.originalWord = originalWord;

	}

	// to return originalWord
	public String getOriginalWord() {
		return originalWord;
	}

	
	// to set originalWord
	public void setOriginalWord(String originalWord) {
		this.originalWord = originalWord;
	} 
	
	// if otherWord is same to originalWord, return true.
	// otherwise, return false. 
	public boolean isSameOriginalWord(String otherWord) {
		return this.originalWord.equals(otherWord);
	}

	// to return string for this object. The format is as follows.
	// originalWord = originalWord value
	public String toString() {
		return "a";
	}
}