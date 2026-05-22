
public class inheritance {
    public static void main(String args[]){

        Fish f1 = new Fish();
        f1.eat();
        f1.swim();
        f1.breathe();


    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("Eating");
    } 

    void breathe(){
        System.out.println("Breathing");
    }
}


class Fish extends Animal{ // Inheriting properties of ANIMAL class
    int fins;

    void swim(){
        System.out.println("Swimming........");
    }
}
