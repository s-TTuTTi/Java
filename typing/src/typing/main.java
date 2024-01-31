package typing;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public void main(String[] args) throws IOException { 
		Scanner sc = new Scanner(System.in);
		String c;
		WordManager a = new WordManager();
		
		String insertWord = "";
		
		String filename = "";
		
		String findWord = "";
		String replaceWord = "";
		int replaceWordCount = 0;
		
		String deleteWord = "";
		int deleteWordCount = 0;
		
		 
		while(true) {
			System.out.println("Enter the Command(Insert, Load, Replace, Delete, Restore, Print, Exercise, Exit)");
			 c = sc.next();
			 switch(c) {
				 case "Insert":
					 System.out.print("Enter the sentence : ");
					 insertWord = sc.next();
					 a.insert(insertWord);
					  break;
					  
				 case "Load":
					 System.out.print("Enter the file name : ");
					filename = sc.next();
					a.load(filename);
					
					 break;
				
				 case "Replace": 
					 System.out.print("Find what : ");
					 findWord = sc.next();
					 System.out.print("Replace with : ");
					 replaceWord = sc.next();
					 replaceWordCount = a.replace(findWord,replaceWord);
					 if(replaceWordCount > 0)
						 System.out.printf("%d word(s) are replaced from experience to Test\n",replaceWordCount);
					 else
						 System.out.printf("Can not find \"%s\"\n",findWord);
					 
					break;
						
				 case "Delete": 
					 System.out.print("Delete what : ");
					 deleteWord = sc.next();
					 deleteWordCount = a.delete(deleteWord);
					 if(deleteWordCount == 0)
						 System.out.printf("Can not find \"%s\"\n",deleteWord);
					 else
						 System.out.println(deleteWordCount+" Word(s) are stored as follows");
					 
					 break;
				 case "Restore":
					 a.restore();
					 System.out.print("original word(s) are restored"); 
					break;
						
				 case "Print":
					 a.print();
						break;
						
				 case "Exercise":
					 a.runExercise(sc, 0, 0);
					 /*a.displayExercise();
					 a.makeExercise(0, 0); */
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
