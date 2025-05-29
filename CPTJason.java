import arc.*; 

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
		
		con.println("Calc and Vectors Multiple choice game");
		con.println("Press P to play game");
		con.println("Press V to view High Scores");
		con.println("Press H for help options");
		con.println("Press Q to exit"); 
		
		while (userInput.notequalsIgnoreCase("q"){	
			String userInput = con.readLine();
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
			intQuizchoice = 0; 
			//Show Quiz Choices 
			TextInputFile Menu = new TextInputFile("Quizchoice.txt");
			while(Menu.eof() == false){
				strQuizName[intQuizchoice] = Menu.readLine();
				//String((intQuizCount + 1) + ": " + strQuizName[intQuizchoice];
				//intQuizchoice += 1;				
			}
			Menu.close(); 
			
		
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
