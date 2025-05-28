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
		
		
		con.println("Calc and Vectors Multiple choice game");
		con.println("Press P to play game");
		con.println("Press V to view High Scores");
		con.println("Press H for help options");
		String userInput = con.readLine();
		if(userInput.equalsIgnoreCase("p")){
			con.println("Enter your username");
			String userName = con.readLine();
			
		}else if(userInput.equalsIgnoreCase("V")){
			//make some method for high scores
			
		}else if(userInput.equalsIgnoreCase("H")){
			//help screen menu
			
		}else{
			con.println("exiting...");
		}
		
		
	}
}
