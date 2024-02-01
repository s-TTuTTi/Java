package typing;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException { 
		Scanner sc = new Scanner(System.in);
		String menu;
		WordManager wordManager = new WordManager();
		
		String insertWord = "";
		
		String filename = "";
		
		String findWord = "";
		String replaceWord = "";
		int replaceWordCount = 0;
		
		String deleteWord = "";
		int deleteWordCount = 0;
		
		int cntOfWords = 0;
		int widthOfLines = 0;
		
		 
		while(true) {
			System.out.println("Enter the Command(Insert, Load, Replace, Delete, Restore, Print, Exercise, Exit)");
			 menu = sc.next();
			 switch(menu) {
				 case "Insert":
					 System.out.print("Enter the sentence : ");
					 insertWord = sc.next();
					 wordManager.insert(insertWord);
					  break;
					  
				 case "Load":
					 System.out.print("Enter the file name : ");
					filename = sc.next();
					wordManager.load(filename);
					
					 break;
				
				 case "Replace": 
					 System.out.print("Find what : ");
					 findWord = sc.next();
					 System.out.print("Replace with : ");
					 replaceWord = sc.next();
					 
					 replaceWordCount = wordManager.replace(findWord,replaceWord);
					 if(replaceWordCount > 0)
						 System.out.printf("%d word(s) are replaced from experience to Test\n",replaceWordCount);
					 else
						 System.out.printf("Can not find \"%s\"\n",findWord);
					 
					break;
						
				 case "Delete": 
					 System.out.print("Delete what : ");
					 deleteWord = sc.next();
					 
					 deleteWordCount = wordManager.delete(deleteWord);
					 if(deleteWordCount > 0)
						 System.out.println(deleteWordCount+" Word(s) are stored as follows");	 
					 else
						 System.out.printf("Can not find \"%s\"\n",deleteWord); 
					break;
						
				 case "Restore":
					 wordManager.restore();
					 System.out.print("original word(s) are restored"); 
					break;
						
				 case "Print":
					 wordManager.print();
					break;
						
				 case "Exercise":
					 System.out.print("Count of words : ");
					 cntOfWords = sc.nextInt();
					 System.out.print("width of words : ");
					 widthOfLines = sc.nextInt();
					 System.out.print("\n");
					 
					 wordManager.runExercise(sc, cntOfWords, widthOfLines); 
					 break;
						
				 case "Exit": 
					 System.out.print("Program terminates");
					 System.exit(0);
					 // 강제로 종료
					 break;
					 
				default:
					System.out.println("Wrong Command");
					break;
			 }//switch
			 
		} //while
		
	} //static

} // main
