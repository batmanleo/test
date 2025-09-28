//This is a sorting program
// This is writtin by Leo 

public class Bubblesort {
  
public static void main(String[] args){
    
// This creates the array and prints it
int[] arrayToSort={1,3,4,5,1,23,57,126,4,543,345,23,12,45,67,97};
    System.out.println("before ");
    for (int i : arrayToSort) {
      System.out.println(i);
    }

// This is the bubble sorting algorithm 
Boolean swappedSomething = true;

 while (swappedSomething) {

  swappedSomething = false;
  for (int i = 0; i < arrayToSort.length - 1; i++) {
    if (arrayToSort[i] > arrayToSort [i + 1]) {
      swappedSomething = true;
      int temp = arrayToSort[i];
      arrayToSort[i] = arrayToSort[i + 1];
      arrayToSort[i + 1] = temp;
    }
  }
}
// This prints the array after sorting
  System.out.println("after ");
    for (int i : arrayToSort) {
      System.out.println(i);

}
}
}
