class Pen{
    String color;
    String type; 

    public void write(){
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }

}

class Student{
    String name;
    int age;
    int standard;

    public void printInfor(){
        System.out.println(this.name);
        System.out.println(this.age);
    }


}


public class OOPS {
    public static void main(String args[]){

    //  PEN OBJECT CREATED 
        Pen pen1 = new Pen();
        pen1.color = "Black";
        pen1.type = "Gel";
        pen1.printColor();
        Pen pen2 = new Pen();
        pen2.color = "Yellow";
        pen2.type = "Ball";
        pen2.write();


        // STUDENT OBJECT CREATED
        Student s1 = new Student();
        s1.name = "Siddhartha";
        s1.age = 26;

        Student s2 = new Student();
        s2.name= "Rohan";
        s2.age= 23;

        s2.printInfor();
        s1.printInfor();

   
    }
    
}
