public class INCCCCC {

    public static void inc(int lastnumber, int startingnumber){
        
        if(startingnumber <= lastnumber){ 
            System.out.println(startingnumber);
        }
        else{
            return;
        }
        inc(lastnumber, startingnumber + 1);

    } 



    public static void main(String args[]){
        inc(20, 1);
    }

    
}


