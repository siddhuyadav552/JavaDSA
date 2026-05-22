
public class OOPSCons {
    public static void main(String args[]){
        Student s1 = new Student("Siddhartha", 26);
        System.out.println(s1.name + " " + s1.roll);

    }
}

class Student{
    String name;
    int roll;

    Student(String name, int roll){
        System.out.println("Constructer is called.");
        this.name = name; 
        this.roll = roll;
          
    }
}
