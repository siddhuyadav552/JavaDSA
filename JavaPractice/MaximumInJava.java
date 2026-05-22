import java.util.*;
public class MaximumInJava {
    public static void main(String args[]){

        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(80);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(17);
        numbers.add(18);
        numbers.add(19);
        numbers.add(20);


        int max = Integer.MIN_VALUE;

        for(int i=0; i<numbers.size(); i++){
            if(numbers.get(i)>max){
                max = numbers.get(i);
            }
        }
        System.out.println("Greatest Value is: " + max);

    }
    
}
