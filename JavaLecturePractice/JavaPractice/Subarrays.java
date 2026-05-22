public class Subarrays {
    public static void main(String args[]){
         int numbers[] = {1,5,4,2,3,8,9,7};
    int a = numbers.length;

    //Subarray ka phela loop jisme array ka phela item select hoga only
    for (int i=0; i<= a; i++){
        //Dusra loop jo bta rha hai ki i=o se phela element 1 le lia hai, ab yeh wala uska endpoint define krega, har step me ek increment.
        for(int j=i; j<a; j++){
            System.out.println(); // pheli baar sirf 1 dekhega, 2nd run me 1,2 tk jayga toh 1,2 dusri line me print honi chaiye uske l;iye ye line hai 
            for(int k= i; k<=j; k++){ //ye wala particular value ko print kra rha hai 
                System.out.print(numbers[k]);
            }
        }System.out.println();
    }
    
    }

}
