public class DecreasingOrder {

    public void Recnn(int n){

        if(n==1){
            System.out.println(n);
            return;
        }
        
        System.out.println(n);
        Recnn(n-1);
        
    }
    public void main(String args[]){
        int n = 10;
        Recnn(n);
        
    }
    
}
