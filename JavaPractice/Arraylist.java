import java.util.*;
public class Arraylist {
    public static void main(String args[]){
        ArrayList<String> Fruits = new ArrayList<>();
        Fruits.add("Apple");
        Fruits.add("Banana");
        Fruits.add("Mango");

        //OPERATIONS OF ARRAYLIST 
        //ADD ELEMENT O(1)
        Fruits.add("Guvava");

        //GET ELEMENT
        Fruits.getLast();

        // REMOVE ELEMENT
        Fruits.remove(0);
        
        //SET ELEMENT AT INDEX 
        Fruits.set(0, "Apple"); // This will remove the current element of that index

        Fruits.add(2, "Banana");


        //Contains Element

        Fruits.contains("Mango"); // This will return boolean value

        
        int last = (Fruits.size()-1);
        for(int i = last; i >= 0; i--){
            System.out.println(i+1 + ". " + Fruits.get(i));
        }
    }
    
}
 