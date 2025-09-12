// This is a loop that prints numbers 1 through 100, and says if it's even or odd

public class FlowControlProgram {
public static void main(String[] args) {

  // This is the code for the loop and counting 1 to 100

    for (int number = 0; number <= 100; number++) {
  System.out.println(number);

  // This is the code for telling if it's even or odd

if (number%2 == 1) {
   System.out.print("even ");} 
   else { System.out.print("odd  "); }   

    }
  }
}    