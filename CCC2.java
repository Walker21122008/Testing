import arc.Console;
import arc.TextInputFile;
import java.util.Random;

public class CCC2 {
   public static void main(String[] var0) {
      Console var1 = new Console(1280, 720);
      String var3 = "";
      boolean var4 = false;
      int var5 = 0;

      TextInputFile var6;
      for(var6 = new TextInputFile("Quizchoice.txt"); !var6.eof(); ++var5) {
         var6.readLine();
      }

      var6.close();
      String[][] var2 = new String[var5][6];
      var6 = new TextInputFile("Quizchoice.txt");
      int var7 = 0;

      while(!var6.eof()) {
         String var8 = var6.readLine();
         String[] var9 = var8.split(",");
         if (var9.length == 6) {
            var2[var7] = var9;
            ++var7;
         } else {
            var1.println("Error: Incorrect question format in file.");
         }
      }

      var6.close();
      Random var13 = new Random();

      int var10;
      for(int var14 = var2.length - 1; var14 > 0; --var14) {
         var10 = var13.nextInt(var14 + 1);
         String[] var11 = var2[var14];
         var2[var14] = var2[var10];
         var2[var10] = var11;
      }

      var1.println("Calc and Vectors Multiple Choice Game");
      var1.println("Press P to play game");
      var1.println("Press Q to exit");

      while(true) {
         while(true) {
            var1.print("Enter choice: ");
            String var15 = var1.readLine().trim();
            if (var15.equalsIgnoreCase("q")) {
               var1.println("Exiting game...");
               return;
            }

            if (var15.equalsIgnoreCase("p")) {
               var1.print("Enter your username: ");

               for(var3 = var1.readLine().trim(); var3.isEmpty(); var3 = var1.readLine().trim()) {
                  var1.println("Player's name cannot be blank. Try again.");
               }

               int var12 = 0;

               for(var10 = 0; var10 < var2.length; ++var10) {
                  var1.clear();
                  var1.println("\nQ" + (var10 + 1) + ": " + var2[var10][0]);
                  var1.println("A) " + var2[var10][1]);
                  var1.println("B) " + var2[var10][2]);
                  var1.println("C) " + var2[var10][3]);
                  var1.println("D) " + var2[var10][4]);
                  var1.print("Your answer: ");
                  String var16 = var1.readLine().trim();
                  if (var16.equalsIgnoreCase(var2[var10][5])) {
                     ++var12;
                  }
               }

               var1.println("\nQuiz Completed! " + var3 + " scored: " + var12 + "/" + var2.length);
            } else {
               var1.println("Invalid option. Try again.");
            }
         }
      }
   }
}
