import arc.*; 
import java.awt.*;
import java.awt.image.*;

public class CPTJason { 
	public static void main (String[]args){
		Console con = new Console (1280, 720); 
		
		// Name: Jason 
		//Course ICS3U1 
		//Topic: Multiple Choice 
		//Subject: Calc and Vectors 
		// Requirements: if statements, while loops, for loops, methods, fileio and arrays 
		// Additional: Program inputs and draws images on screen 
		// Additional: Has a help option 
		// Additional: Console window is 1280 by 720 
		
		//Declare Variables 
		String [] Quizoptions = new String [3]; 
		String strPlayerName; 
		int inttotalquestions; 
		int intplayerscore; 
		Double dblTotalScore; 
		int Quizchoice; 
		String strQuizName; 
		String userInput=""; 
		String StrQuestion;
		String StrAnswerA; 
		String StrAnswerB; 
		String StrAnswerC; 
		String StrAnswerD; 
		String StrCorrect; 
		
		//Load all images 
		BufferedImage imgHomePageBKG = con.loadImage("Homepage.png");
		BufferedImage imgStartBKG = con.loadImage("Start.png");
		BufferedImage imgGame1BKG = con.loadImage("Choice1.png");	
		BufferedImage imgGame2BKG = con.loadImage("Choice2.png");	
		BufferedImage imgGame3BKG = con.loadImage("Choice3.png");	
		BufferedImage imgWinBKG = con.loadImage("Win.png");		
		BufferedImage imgLoseBKG = con.loadImage("Lose.png");		
		BufferedImage imgScoreBKG = con.loadImage("Score.jpg");		
		BufferedImage imgHelpBKG = con.loadImage("Help.png");	

		con.println("Calc and Vectors Multiple choice game");
		con.println("Press P to play game");
		con.println("Press V to view High Scores");
		con.println("Press H for help options");
		con.println("Press Q to exit"); 
		
		loadImage(imgHomePageBKG);

		while (!userInput.equalsIgnoreCase("q")){	
			userInput = con.readLine();
			if(userInput.equalsIgnoreCase("p")){
				intplayerscore = 0; 
				con.println("Enter your username");
				strPlayerName = "";
				while (strPlayerName.equals("")) {
					con.print("Please input your name: ");
					strPlayerName = con.readLine();
					if (strPlayerName.equals("")){
					con.println("Player's name cannot be blank.");
					}
				}
			//Titan boost 
			if (strPlayerName.equals("statitan")) {
				intplayerscore = 2;
				System.out.println("Enabled cheat. Score is = " + intplayerscore);
			}
			dblTotalScore = 0.0;		
			int intQuizchoice = 0; 
			//Show Quiz Choices 
			//String strQuizName[];
		
			//intQuizchoice = CountTxtLine("Quizchoice.txt");
			String strQuizNames[]; 
			strQuizNames = new String[3];
			System.out.println("No. of Quizzes: " + intQuizchoice);
			
			TextInputFile SelecMenu = new TextInputFile("Quizchoice.txt");
			while(SelecMenu.eof() == false){
				strQuizNames[intQuizchoice] = SelecMenu.readLine();
				//String((intQuizCount + 1) + ": " + strQuizName[intQuizchoice];
				intQuizchoice += 1;				
			}
			SelecMenu.close(); 
			
			//Read the files
			TextInputFile Calctest = new TextInputFile("Calc.txt");  
			TextInputFile Vectorstest = new TextInputFile("vectors.txt"); 
		    TextInputFile Bothtest = new TextInputFile("Both.txt"); 
		 
		 if (intQuizchoice = 1){ 
			 intQuizchoice = Calctest; 
			 
		 }else if (intQuizchoice = 2){ 
			 intQuizchoice = Vectorstest; 
			 
		 }else if (intQuizchoice = 3){ 
			  intQuizchoice = Bothtest; 
			  
		  }
			  
			while(Vectorstest.eof() == false){ //while not at end of file
			StrQuestion = intQuizchoice.readLine();
			StrAnswerA = intQuizchoice.readSLine();
			StrAnswerB = intQuizchoice.readLine();
			StrAnswerC = intQuizchoice.readLine();
			StrAnswerD = intQuizchoice.readLine();
			StrCorrect = intQuizchoice.readLine();
		} 
		 
			}else if(userInput.equalsIgnoreCase("V")){
				//make some method for high scores
			
			}else if(userInput.equalsIgnoreCase("H")){
				//help screen menu
			
			}else{
				con.println("exiting...");
			}
		

			
		}
	}
}

