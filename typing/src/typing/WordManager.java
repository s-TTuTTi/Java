package typing;
 
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Scanner;
	import java.util.Vector;

 public class WordManager {
	    private Vector<VisibleWord> wordPool;           // a total of words
	    
	    private Vector<String> exercisePool;       // words for exercise

	    // constructor
	    public WordManager() {	
	        wordPool = new Vector<>();
	     }

	    // constructor, size indicates the initial size of vector
	    public WordManager(int size) {
	    	wordPool = new Vector<>(size);
	    }

	    // to insert new VisibleWord object to wordPool vector.
	    // if the insertion is successfully completed, return true. otherwise return false.
	    public boolean insert(String sentence) {
	    	VisibleWord visibleWord = new VisibleWord(sentence);
	    	
	    	if(sentence != null) {
	    		wordPool.add(visibleWord);
	    		System.out.println("Data insertion is completed!!");
	    		return true;
	    	}
	    	else {
	    		return false;
	    	}
	    }

	    // to divide sentence to words, and words are stored in String array.
	    // returns String array
	    public String[] divideWords(String sentence) {
	    	String wordSpace [];
			wordSpace = sentence.split("\\t|\\n");
	    	return wordSpace; 
	    }
	    
	    

	    // to load words from the file and insert new VisibleWord object to wordPool vector.
	    // if the insertion is successfully completed, return true. otherwise return false.
	    public boolean load(String filename) throws IOException{ 
			int i = 0;
			String contentOfFile = "";
			String wordSpace [];
			
			File fileLoad = null;
			FileReader fileReader = null;
			VisibleWord visibleWord = new VisibleWord();
			
			wordPool = new Vector<VisibleWord>(); 
			
			fileLoad = new File(filename);
			
			try {
				fileReader = new FileReader(fileLoad);
				while((i=fileReader.read())!=-1) { 
					contentOfFile = contentOfFile + (char) i;		
				}	
				
				wordSpace = divideWords(contentOfFile);
				
				for(int a = 0 ; a < wordSpace.length ; a++) {
					if(wordSpace[a] != "") {
						visibleWord = new VisibleWord(wordSpace[a].trim()); 
						wordPool.add(visibleWord);
					}
				}
				System.out.println("File load is completed!!");	 
			}catch(FileNotFoundException e){
				e.printStackTrace();
				System.out.println("File can't find");
			}catch(IOException e){
				e.printStackTrace();
				System.out.println("File load is fail!");
			}finally {
				if(fileReader != null) 
					fileReader.close();
			} 			 
			
			return false;
		} /* Load =================================================*/

	    // if the value of originalWord is findWord, replace the value of visibleWord to replaceWord
	    // return the number of replaced words.
	    // you have to use Iterator for searching the vector
	    public int replace(String findWord, String replaceWord) {
	    	int replaceCount = 0;
	    	
	    	for (VisibleWord word : wordPool) {
	    		 if(word.getVisibleWord().equals(findWord.trim())) {
	    			 replaceCount ++;
	    			 word.setVisibleWord(replaceWord);
	    		 }	
	    	 }
	    	if (replaceCount > 0) {
	    		return replaceCount;
	    	}else
	    		return 0;
	    }

	    // to delete Visible object whose originalWord is word
	    // return the number of deleted words.
	    public int delete(String deleteWord) {
	    	int deleteCount = 0;
	    	  for (int i = 0; i < wordPool.size(); i++) {
	    	        if (wordPool.get(i).getVisibleWord().equals(deleteWord.trim())) {
	    	            deleteCount++;
	    	            wordPool.remove(i);
	    	        }
	    	    }
	    	if (deleteCount > 0) {
	    		return deleteCount;
	    	}else
	    		return 0;
	    }

	    // to set visibleWord value to originalWord value for all words
	    public void restore() {
	    	VisibleWord visibleWord = new VisibleWord(); 
	    	
			for(int a = 0 ; a < wordPool.size() ; a++) {
				originalWord = wordPool.get(a).getOriginalWord();
				wordPool.get(a).setVisibleWord(originalWord);
			}
			
			for(int a = 0 ; a < wordPool.size() ; a++) {
				originalWord = wordPool.get(a).getOriginalWord();
				visibleWord.setVisibleWord(originalWord);
				wordPool.add(a,visibleWord);
			}
			
	    	System.out.println("original word(s) are restored");
	    	print();
	    
	    	
	    } /* restore =========================================== */

	    // to print all data
	    // you have to use size and get method of Vector class
	    public void print() {
	    	 for (VisibleWord word : wordPool) {
	    	        System.out.println(word.getVisibleWord()+" ");
	    	    } 
	    	 System.out.println(wordPool.size()+" Word(s) are stored as follows");
	    }

	    
	    
	    
	    // make a problem from wordPool vector for typing practice
	    // the length of white space is randomly determined, and the length is rounded.
	    // return the String includes words and white space
	    public void makeExercise(int countOfWord, int widthOfLine) {
	 
	    }

	    // check whether the answer is contained in exercisePool vector
	    // if the answer is included, replace the word of exercisePool to white space with equal size
	    // return the number of matched words
	    public int checkAnswer(String answer) {
	    	return 1;
	    }

	    // make a sentence from exercisePool vector for displaying the exercise
	    // return the display sentence
	    public String displayExercise() {
	    	return "a";
	    }

	    // run exercise using makeExercise, checkAnswer, and displayExercise method until user enter all correct words
	    public void runExercise(Scanner sc, int countOfWord, int widthOfLine) {

	    }

	    // return VisibleWord object which is stored at 'index' in Vector
	    public VisibleWord getData(int index) {
	    	return wordPool.get(index); 
	    }

	    // return VisibleWord object which is recently stored in Vector
	    public VisibleWord getLastData() {
			return wordPool.lastElement(); 
	    } 
	

}
 
