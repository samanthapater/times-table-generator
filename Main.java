import java.util.Scanner;

class Main {
  public static void main(String[] args) {


    //Get the number of rows in the text file
    Scanner kb = new Scanner(System.in);
    int numChoice;
  
    do {
      System.out.print("Please enter a positive integer: ");
      while(!kb.hasNextInt()) {
        System.out.println("That is not a valid choice. Please enter a positive integer:");
        kb.next();
      }
      numChoice = kb.nextInt();
    } while (numChoice <= 0);
  
    int[][] timesTable = new int [numChoice][numChoice];
  
    System.out.print("Times Table up to " + Integer.toString(numChoice) + "\n");
  
    for (int row = 0; row < timesTable.length; row++) {
      for (int col = 0; col < timesTable[row].length; col++) {
        timesTable[row][col] = (row+1)*(col+1);
        System.out.print(timesTable[row][col] + "\t");
      }
      System.out.println();
    }
  }
}
