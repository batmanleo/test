// This is a loop that prints numbers 1 through 100, and says if it's even or odd using an array

public class arrayproject {
public static void main(String[] args) {

int sum = 0;

// This is the array and loop
int[] number = new int[101];
    for (int i = 1; i <= number.length; i++) {
    number[i] = i; 
    System.out.print(number[i]);

    //This is to tell even or odd
   if (i%2 == 0) {
      System.out.println(" even");} 
      else { System.out.println(" odd"); } 
    
        //This is to sum all the numbers 
        sum = number[i] + sum; 
        System.out.println("The sum is: " + sum); 
}
    }    
}