package typing;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class main extends VisibleWord {

	public static void main(String[] args) throws IOException { 
		Scanner sc = new Scanner(System.in);
		String c;
		WordManager a = new WordManager();
		String word;
    

		while(true) {
			System.out.println("Enter the Command(Insert, Load, Replace, Delete, Restore, Print, Exercise, Exit)");
			 c = sc.next();
			 switch(c) {
				 case "Insert":

					  break;			
					  
				 case "Load":
					 a.load();
					 
				break;
				
				 case "Replace": 
						break;
						
				 case "Delete": 
						break;
						
				 case "Restore":
					 a.restore();
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
