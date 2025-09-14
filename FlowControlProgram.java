// This is a loop that prints numbers 1 through 100, and says if it's even or odd

public class FlowControlProgram {
public static void main(String[] args) {
  int totalsum = 0;

  // This is the code for the loop and counting 1 to 100

    for (int number = 0; number <= 100; number++) {
    System.out.print(number);

      // This is the code for telling if it's even or odd

      if (number%2 == 0) {
      System.out.print(" even");} 
      else { System.out.print(" odd "); }   

      // This is the code for the sum of the numbers

      System.out.print(" Sum ");
      totalsum = totalsum+number; 
      System.out.println(totalsum); 
      

    }
  }
}    
