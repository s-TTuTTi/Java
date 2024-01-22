package typing;

import java.util.Scanner;

public class main extends VisibleWord {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		String c;
		String filename = "";
		WordManager a = new WordManager( );
		
		while(true) {
			System.out.print("Enter the Command(Insert, Load, Replace, Delete, Restore, Print, Exercise, Exit)");
			 c = sc.next();
			 switch(c) {
				 case "Insert":
					 a.load(filename);
					  break;			
					  
				 case "Load":
					 a.load(filename);
				break;
				
				 case "Replace":
					 a.replace(filename, c);
						break;
						
				 case "Delete":
					 a.delete(filename);
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
					System.out.print("hi");	
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
