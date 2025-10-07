// This is a program by Leo
// This creates a few horses and out puts there name and birthday

public class ojecttesting {
public static void main(String[] args) {
    
// This sets each horse

horse horse1 = new horse("Patrick",2012);
horse horse2 = new horse("Johnny",2011);
horse horse3 = new horse("Gyro",2004);

// This prints each horse

System.out.println("First horse's name: " + horse1.name);
System.out.println("First horse's birthday: " + horse1.birthYear);

System.out.println("Second horse's name: " + horse2.name);
System.out.println("Second horse's birthday: " + horse2.birthYear);

System.out.println("Third horse's name: " + horse3.name);
System.out.println("Third horse's birthday: " + horse3.birthYear);
}
}


public class horse {

    String name;

    int birthYear;

    public horse(String horseName, int year){ //horse constructor needs its name and birth year.

        name=horseName; //assigns the name of the horse to the horseName which was sent in the construtor.

        birthYear=year; //assigns the year to the birthYear that was sent in the constructor;

    }
    }
