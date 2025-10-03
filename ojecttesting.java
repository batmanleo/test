public class ojecttesting {
public static void main(String[] args) {
    

Arraylist<horse> objects=new Arraylist<horse>();  


horse horse1 = new horse("Patrick",2012);
horse horse2 = new horse("Johnny",2011);

System.out.println("First horse's name: " + horse1.name);
System.out.println("First horse's birthday: " + horse1.birthYear);

System.out.println("Second horse's name: " + horse2.name);
System.out.println("Second horse's birthday: " + horse2.birthYear);
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
