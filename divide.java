//this code is written by Leo to showcase exceptions

public class divide {
public static void main(String[] args) {



int mathingthing = 11; 
int mathington = 0;

//this is the exception

try {
System.out.println(mathingthing / mathington);
} catch (Exception e) {
    System.out.println(e);
    System.out.println("you tried to divide by zero, an error happened");
    System.out.print("you tried to ");
    
}


System.out.println("divided something");

//this array only can hold 6 things (0,1,2,3,4,5)

int[]bob = new int[5];

//this is the exception

try {

//this for loop tries to add 10 things to the array

for(int x = 0; x<10; x++){

    bob[x]=x;
    System.out.println(x);
}
} catch (Exception e)

{
    System.out.println(e);
    System.out.println("you tried to put to much in the array");
}

//this is proof the code ran all the way through

System.out.println("if this printed the code ran");

}
}
