package typing;
 
	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Iterator;
	import java.util.Scanner;
	import java.util.StringTokenizer;
	import java.util.Vector;

 public class WordManager {
	    private Vector<VisibleWord> wordPool;           // a total of words
	    private Vector<String> exercisePool;       // words for exercise

	    // constructor
	    public WordManager() {
	 
	    	
	     }

	    // constructor, size indicates the initial size of vector
	    public WordManager(int size) {
	 
	    }

	    // to insert new VisibleWord object to wordPool vector.
	    // if the insertion is successfully completed, return true. otherwise return false.
	    public boolean insert(String sentence) {

	    	System.out.print("Enter the sentence : ");
			return false;
			
	 
	    }

	    // to divide sentence to words, and words are stored in String array.
	    // returns String array
	    public String[] divideWords(String sentence) {
	    	return null; 
	    }

	    // to load words from the file and insert new VisibleWord object to wordPool vector.
	    // if the insertion is successfully completed, return true. otherwise return false.
	    public boolean load(String filename) {
		Scanner sc = new Scanner();
		String content = "";

		System.out.print("Enter the file name : ");
		filename = sc.next();
		File loadFile = new File(filename);
		
		try{
			BufferedReader fileReader = new BufferedReader(new FileReader(loadFile));
		content = fileReader.readLine();
			while(content != null){
				wordPool.add(content);
				content = fileReader.readLine();
			}
			System.out.print("File load is completed!!");
			fileReader.close();
		}catch(FileNotFoundException e){
			e.getStackTrace();
			System.out.print("File can't find");
		}catch(IOException e){
			e.getStackTrace();
			System.out.print("File load is fail!");
		}

		
	return false;
	   }

	    // if the value of originalWord is findWord, replace the value of visibleWord to replaceWord
	    // return the number of replaced words.
	    // you have to use Iterator for searching the vector
	    public int replace(String findWord, String replaceWord) {
	    	return 1;
	    }

	    // to delete Visible object whose originalWord is word
	    // return the number of deleted words.
	    public int delete(String word) {
	    	return 2;
	    }

	    // to set visibleWord value to originalWord value for all words
	    public void restore() {
	 
	    }

	    // to print all data
	    // you have to use size and get method of Vector class
	    public void print() { 
	    	System.out.print("word(s) aree stored as follows : ");
	    	
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
	    public void runExercise(Scanner scanner, int countOfWord, int widthOfLine) {

	    }

	    // return VisibleWord object which is stored at 'index' in Vector
	    public VisibleWord getData(int index) {
	    	return null; 
	    }

	    // return VisibleWord object which is recently stored in Vector
	    public VisibleWord getLastData() {
			return null; 
	    } 
	

}
 
