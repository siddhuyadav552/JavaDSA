import java.util.*;
public class InbuiltSort {

    public static void main(String args[]){
        Integer arr[] = {5,7,6,8,4,9,3,1,2};
        //Arrays.sort(arr);
        Arrays.sort(arr, 0,  3, Collections.reverseOrder());
        // 0 index va;ue hai, ya kahan se shuru karna chahte hein 
        //3 index value hai, ya kahan khatam karna chahte hein 
        // Collection me features milte hei sorting ke, reverse order function hamesha functions par kaam karta hai

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " " );
        }

    }
    
}
