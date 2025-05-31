import arc.*;
import java.awt.*;
import java.awt.image.*;
import java.util.Random;

public class CPTJason {
    public static void main(String[] args) {
        Console con = new Console(1280, 720);
        BufferedImage imgHomePageBKG = con.loadImage("Homepage.png");
        BufferedImage imgHelpBKG = con.loadImage("Help.png");
        BufferedImage imgScoreBKG = con.loadImage("Score.jpg");

        String strName = "";
        int intScore = 0;
        String strAnswer = "";
        String strCheat = "statitan";
        int intQuizchoice = 0;

        con.drawImage(imgHomePageBKG, 0, 0);
        con.println("Calc and Vectors Multiple Choice Game");
        con.println("Press P to play game");
        con.println("Press V to view High Scores");
        con.println("Press H for help options");
        con.println("Press Q to exit");
        String strInput = con.readLine();

        if (strInput.equalsIgnoreCase("p")) {
            con.println("Enter your username: ");
            strName = con.readLine();
            while (strName.equals("")) {
                con.println("Username cannot be blank. Try again:");
                strName = con.readLine();
            }
            if (strName.equalsIgnoreCase(strCheat)) {
                intScore = 2;
                con.println("Cheat enabled! Starting score: " + intScore);
            }

            String[] strQuizchoices = new String[3];
            TextInputFile file = new TextInputFile("Quizchoice.txt");
            for (int i = 0; i < 3; i++) {
                strQuizchoices[i] = file.readLine();
            }

            con.println("Please choose a quiz to complete:");
            for (int i = 0; i < 3; i++) {
                con.println((i + 1) + ") " + strQuizchoices[i]);
            }
            intQuizchoice = con.readInt();

            String selectedQuizFile = "";
            if (intQuizchoice == 1) {
                selectedQuizFile = "Calc.txt";
            } else if (intQuizchoice == 2) {
                selectedQuizFile = "Vectors.txt";
            } else if (intQuizchoice == 3) {
                selectedQuizFile = "Both.txt";
            }

            TextInputFile quiz = new TextInputFile(selectedQuizFile);
            int intNumQuestions = 0;
            while (!quiz.eof()) {
                quiz.readLine();
                intNumQuestions++;
            }
            quiz.close();
            intNumQuestions = intNumQuestions / 6;

            String[][] strQuiz = new String[intNumQuestions][6];
            TextInputFile quiz2 = new TextInputFile(selectedQuizFile);
            for (int i = 0; i < intNumQuestions; i++) {
                for (int j = 0; j < 6; j++) {
                    strQuiz[i][j] = quiz2.readLine();
                }
            }

            // Shuffle
            Random random = new Random();
            for (int i = 0; i < intNumQuestions; i++) {
                int randIndex = random.nextInt(intNumQuestions);
                String[] temp = strQuiz[i];
                strQuiz[i] = strQuiz[randIndex];
                strQuiz[randIndex] = temp;
            }

            for (int i = 0; i < intNumQuestions; i++) {
                con.println();
                con.println("Q" + (i + 1) + ": " + strQuiz[i][0]);
                con.println("A) " + strQuiz[i][1]);
                con.println("B) " + strQuiz[i][2]);
                con.println("C) " + strQuiz[i][3]);
                con.println("D) " + strQuiz[i][4]);
                con.print("Enter your answer (A/B/C/D): ");
                strAnswer = con.readLine().toUpperCase();

                if (strAnswer.equals(strQuiz[i][5].toUpperCase())) {
                    intScore++;
                }
            }

            con.drawImage(imgScoreBKG, 0, 0);
            con.println(strName + ", your final score is: " + intScore + "/" + intNumQuestions);

        } else if (strInput.equalsIgnoreCase("v")) {
            con.println("High scores not implemented.");
        } else if (strInput.equalsIgnoreCase("h")) {
            con.drawImage(imgHelpBKG, 0, 0);
            con.println("Help Section:");
            con.println("- Enter your username to begin.");
            con.println("- Choose a quiz topic.");
            con.println("- Answer each question (A/B/C/D).");
            con.println("- Use 'statitan' as a cheat code for bonus points!");
        } else if (strInput.equalsIgnoreCase("q")) {
            con.println("Thanks for playing!");
        } else {
            con.println("Invalid choice. Restart the program.");
        }
    }
}
